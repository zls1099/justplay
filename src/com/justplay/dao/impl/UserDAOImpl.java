package com.justplay.dao.impl;

import com.justplay.dao.UserDAO;
import com.justplay.entity.User;

public class UserDAOImpl extends BaseDAOImpl<User, String> implements UserDAO {

	/**
	 * 获得User对象
	 * @param id
	 * @return
	 */
	@Override
	public User getUserById(int id) {
		String hql = "from User user where user.uid = " + id;
		User user = (User) getSession().createQuery(hql).setParameter(0, id).uniqueResult();
		return user;
	}
	
	@Override
	public boolean isExistByID(int id) {
		User user = getUserById(id);
		if (user == null) {
			return true;
		}
		return false;
	}

	@Override
	public void delete(int id) {
		User user = getUserById(id);
		super.delete(user);
	}

	@Override
	public void delete(int[] ids) {
		int len = ids.length;
		StringBuffer sbf = new StringBuffer("(");
		
		for (int i = 0; i < len; i++) {
			if (i == len - 1) {
				sbf.append(ids[i] + ")");
			} else {
				sbf.append(ids[i]);
			}
		}
		String hql = "from User user where uid in " + sbf.toString();
		getSession().update(hql);
	}
}
