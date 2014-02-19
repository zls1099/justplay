package com.justplay.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class DegistUtil {
	/**
	 * md5加密
	 * @param str
	 * @return
	 */
	public static String md5(String str){
		try {
			//将str采用md5加密
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] dist = md.digest(str.getBytes());
			//将加密后的byte[]数组使用base64算法表示
			BASE64Encoder baseEncode = new BASE64Encoder();
			return baseEncode.encode(dist);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static void main(String[] args){
		System.out.println(md5("qwertyuiopasffdfgh").length());
	}
	
}
