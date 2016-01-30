package com.cheng.weixin.menu;

import com.alibaba.fastjson.JSON;
import com.cheng.weixin.core.common.WeixinUrl;
import com.cheng.weixin.core.enums.ActionType;
import com.cheng.weixin.core.request.model.WxMenu;
import com.cheng.weixin.core.utils.HttpUtils;
import com.cheng.weixin.core.utils.WeixinContent;
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
public class AddMenu {
	@Resource
	protected WeixinUrl weixinUrl;
	@Test
	public void addMenu() {

		List<WxMenu> menus = new ArrayList<>();
		WxMenu menu = new WxMenu();
		menu.setName("一级菜单");
		menu.setType(ActionType.click);
		menu.setKey("A0001");
		menus.add(menu);

		WxMenu menu2 = new WxMenu();
		menu2.setName("二级菜单");
		menus.add(menu2);

		List<WxMenu> subMenu = new ArrayList<>();
		WxMenu menu3 = new WxMenu();
		menu3.setName("搜索");
		menu3.setType(ActionType.view);
		menu3.setUrl("https://m.baidu.com/");
		subMenu.add(menu3);
		WxMenu menu4 = new WxMenu();
		menu4.setName("学习");
		menu4.setType(ActionType.view);
		menu4.setUrl("http://www.ycku.com/");
		subMenu.add(menu4);
		WxMenu menu5 = new WxMenu();
		menu5.setType(ActionType.click);
		menu5.setName("赞一下我们");
		menu5.setKey("B0001");
		subMenu.add(menu5);

		menu2.setSub_button(subMenu);

		Map<String,List<WxMenu>> button = new HashMap<>();
		button.put("button", menus);

//		SerializerFeature feature = SerializerFeature.DisableCircularReferenceDetect;
//		String menuJson = JSON.toJSONString(menus, feature);
		String menuJson = JSON.toJSONString(button);
		System.out.println(menuJson);

		String addMenuUrl = weixinUrl.ADDMENU_URL;
		addMenuUrl = addMenuUrl.replace("ACCESS_TOKEN", WeixinContent.getInstance().getAccessToken());

		System.out.println(HttpUtils.httpPost(addMenuUrl, menuJson));


	}

}
