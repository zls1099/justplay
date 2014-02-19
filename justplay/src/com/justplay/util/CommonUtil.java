package com.justplay.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * ������ - ����
 */

public class CommonUtil {

	/**
	 * �����ȡUUID�ַ���(���л���)
	 * 
	 * @return UUID�ַ���
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid.substring(0, 8) + uuid.substring(9, 13)
				+ uuid.substring(14, 18) + uuid.substring(19, 23)
				+ uuid.substring(24);
	}

	/**
	 * �����ȡ�ַ���
	 * 
	 * @param length
	 *            ����ַ�������
	 * 
	 * @return ����ַ���
	 */
	public static String getRandomString(int length) {
		if (length <= 0) {
			return "";
		}
		
		char[] randomChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
				'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };
		
		Random random = new Random();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			stringBuffer.append(randomChar[Math.abs(random.nextInt())
					% randomChar.length]);
		}
		return stringBuffer.toString();
	}

	/**
	 * ����ָ������ �ָ��ַ���
	 * 
	 * @param str
	 *            ��Ҫ������ַ���
	 * @param length
	 *            �ָ�����
	 * 
	 * @return �ַ�������
	 */
	public static List<String> splitString(String str, int length) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < str.length(); i += length) {
			int endIndex = i + length;
			if (endIndex <= str.length()) {
				list.add(str.substring(i, i + length));
			} else {
				list.add(str.substring(i, str.length() - 1));
			}
		}
		return list;
	}

	/**
	 * ���ַ���Listת��Ϊ�ַ������Էָ������.
	 * 
	 * @param list
	 *            ��Ҫ�����List.
	 * 
	 * @param separator
	 *            �ָ���.
	 * 
	 * @return ת������ַ���
	 */
	public static String toString(List<String> list, String separator) {
		StringBuffer stringBuffer = new StringBuffer();
		for (String str : list) {
			stringBuffer.append(separator + str);
		}
		stringBuffer.deleteCharAt(0);
		return stringBuffer.toString();
	}

	public static void main(String[] args) {
		System.out.println(getRandomString(5));
	}

}