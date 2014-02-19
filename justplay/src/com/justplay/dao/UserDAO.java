package com.justplay.dao;

import com.justplay.entity.User;

public interface UserDAO extends BaseDAO<User, String> {
	/**
	 * 根据用户ID判断此用户是否存在（不区分大小写）
	 * 
	 */
	public boolean isExistByID(int id);
	
	/**
	 * 根据ID获取会员对象，若会员不存在，则返回null（不区分大小写）
	 * 
	 */
	public User getUserById(int id);
	
	/**
	 * 保存User
	 */
	public void save(User user);
	
	/**
	 * 更新User
	 */
	public void update(User user);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * 根据id数组删除
	 * @param ids
	 */
	public void delete(int[] ids);



}
