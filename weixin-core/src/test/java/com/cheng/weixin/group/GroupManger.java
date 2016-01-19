package com.cheng.weixin.group;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.cheng.weixin.core.exception.WeixinException;
import com.cheng.weixin.core.response.model.Group;
import com.cheng.weixin.core.service.IGroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class GroupManger {
//	private BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
	@Resource
	private IGroupService groupService;

	@Test
	public void addGroup() {
		Group group = groupService.addGroup("测试组01");
		System.out.println(group);
	}

	@Test
	public void getAllGroup() {
		try {
			List<Group> groups = groupService.getAllGroup();
			for(Group group : groups) {
				System.out.println(group);
			}
		} catch (WeixinException e) {
			System.out.println(e.getCode()+" "+ e.getErrorMsg());
			e.printStackTrace();
		}
	}
	@Test
	public void getUserGroup() {
		Integer gid = groupService.getUserGroup("oR43ywDiiYX9c_m0N8frmqQsrigk");
		System.out.println(gid);
	}
	@Test
	public void updateGroupName() {
		groupService.updateGroupName(101, "测试分组2");;
	}
	@Test
	public void updateUserGroup() {
		groupService.updateUserGroup("oR43ywDiiYX9c_m0N8frmqQsrigk", 102);
	}
	@Test
	public void updateBatchUserGroup() {

		List<String> openids = new ArrayList<>();
		openids.add("oR43ywDiiYX9c_m0N8frmqQsrigk");
		openids.add("oR43ywC-VajmZ5tq5hIMzqKgUAS4");

		groupService.updateBatchMoveUserGroup(openids, 100);
	}

	@Test
	public void deleteGroup() {
		groupService.deleteGroup(101);
	}


	@Test
	public void test() {
		Group group = new Group();
		group.setId(100);
		group.setName("测试组01");
		Map<String, Group> maps = new HashMap<>();
		maps.put("group", group);

		System.out.println(JSON.toJSON(maps));
	}
	@Test
	public void test01() {
		String json = "{\"group\":{\"id\":100,\"name\":\"测试组01\"}}";
//		Map<String, Map> repMap = new HashMap<>();
//		JSONObject repMap = JSONObject.parseObject(json);
		Map<String, Group> repMap = new HashMap<>();
		repMap = JSONObject.parseObject(json,new TypeReference<Map<String, Group>>(){});
//		Group repGroup = repMap.get("group");
//		repMap.getObject("group", Group.class);
//		System.out.println(repMap.getObject("group", Group.class));
		System.out.println(repMap.get("group"));
	}
	@Test
	public void test02() {
		String json = "{\"id\":100,\"name\":\"测试组01\"}";
		JSONObject group = JSONObject.parseObject(json);

		System.out.println(group);
	}
}
