package com.justplay.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

public class DegistUtil {
	/**
	 * md5����
	 * @param str
	 * @return
	 */
	public static String md5(String str){
		try {
			//��str����md5����
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] dist = md.digest(str.getBytes());
			//�����ܺ��byte[]����ʹ��base64�㷨��ʾ
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
