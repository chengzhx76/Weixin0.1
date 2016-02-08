package com.cheng.weixin.Other;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/2/1 0001
 */
public class UrlEncoder {

    public static void main(String[] args) throws UnsupportedEncodingException {
        //System.out.println(URLEncoder.encode("iSE3Uq4AN+aissY1TeAGP2YY6SnydL8xy3mIqOb0jHibEtFKmkddLUTCAV2tWKvrAlWGeVF4VDvEFP62FMG3BA==","UTF-8"));
        System.out.println(URLDecoder.decode("dnM3qk2W4TFFvEhYwrRMrxFGt3NEw3I5Ljx9RAN9%2BjgHJ5LqLa0BR8r%2BxtGfVRU9HX8xU6jo%2BPBEk%2Fhn%2FR7zpw%3D%3D", "UTF-8"));
    }

}
