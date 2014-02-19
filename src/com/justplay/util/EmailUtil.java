package com.justplay.util;


import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtil {
	/**
	 * 
	 * @param emailAddr
	 * @param msg
	 * @return
	 */
	public static boolean sendEmail(String emailAddr,String msg) {
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.126.com");
		email.setAuthentication("justplay2014", "xx2009091");
		email.setCharset("UTF-8");
		try {
			email.addTo(emailAddr);
			email.setFrom("justplay2014@126.com");
			email.setSubject("JUSTPLAY” º˛—È÷§");
			email.setMsg(msg);
			email.send();
			return true;
		} catch (EmailException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		String msg = "Test Success!";
		sendEmail("zls1099@163.com", msg);
	}
	
}
