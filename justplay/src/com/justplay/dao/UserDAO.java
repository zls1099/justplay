package com.justplay.dao;

import com.justplay.entity.User;

public interface UserDAO extends BaseDAO<User, String> {
	/**
	 * �����û�ID�жϴ��û��Ƿ���ڣ������ִ�Сд��
	 * 
	 */
	public boolean isExistByID(int id);
	
	/**
	 * ����ID��ȡ��Ա��������Ա�����ڣ��򷵻�null�������ִ�Сд��
	 * 
	 */
	public User getUserById(int id);
	
	/**
	 * ����User
	 */
	public void save(User user);
	
	/**
	 * ����User
	 */
	public void update(User user);
	
	/**
	 * ����idɾ��
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * ����id����ɾ��
	 * @param ids
	 */
	public void delete(int[] ids);



}
