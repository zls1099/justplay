package com.justplay.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.justplay.bean.Pager;

public interface BaseDAO<T, PK extends Serializable> {

	/**
	 * ����ID��ȡʵ�����.
	 * 
	 * @param id
	 *            �� ��¼ID
	 * @return ʵ�����
	 */
	public T get(PK id);

	/**
	 * ����ID��ȡʵ�����.
	 * 
	 * @param id
	 *            ��¼ID
	 * @return ʵ�����
	 */
	public T load(PK id);

	/**
	 * ����ID�����ȡʵ����󼯺�.
	 * 
	 * @param ids
	 *            ID��������
	 * 
	 * @return ʵ����󼯺�
	 */
	public List<T> get(PK[] ids);

	/**
	 * ����������������ֵ��ȡʵ�����.
	 * 
	 * @param propertyName
	 *            ��������
	 * @param value
	 *            ����ֵ
	 * @return ʵ�����
	 */
	public T get(String propertyName, Object value);

	/**
	 * ����������������ֵ��ȡʵ����󼯺�.
	 * 
	 * @param propertyName
	 *            ��������
	 * @param value
	 *            ����ֵ
	 * @return ʵ����󼯺�
	 */
	public List<T> getList(String propertyName, Object value);

	/**
	 * ��ȡ����ʵ����󼯺�.
	 * 
	 * @return ʵ����󼯺�
	 */
	public List<T> getAll();

	/**
	 * ��ȡ����ʵ���������.
	 * 
	 * @return ʵ���������
	 */
	public Long getTotalCount();

	/**
	 * �������������޸�ǰ������ֵ�ж������ݿ����Ƿ�Ψһ(�����޸ĵ�ֵ��ԭ��ֵ�����ֱ�ӷ���true).
	 * 
	 * @param propertyName
	 *            ��������
	 * @param oldValue
	 *            �޸�ǰ������ֵ
	 * @param oldValue
	 *            �޸ĺ������ֵ
	 * @return boolean
	 */
	public boolean isUnique(String propertyName, Object oldValue,
			Object newValue);

	/**
	 * �����������ж������Ƿ��Ѵ���.
	 * 
	 * @param propertyName
	 *            ��������
	 * @param value
	 *            ֵ
	 * @return boolean
	 */
	public boolean isExist(String propertyName, Object value);

	/**
	 * ����ʵ�����.
	 * 
	 * @param entity
	 *            ����
	 * @return ID
	 */
	public void save(T entity);

	/**
	 * ����ʵ�����.
	 * 
	 * @param entity
	 *            ����
	 */
	public void update(T entity);

	/**
	 * ɾ��ʵ�����.
	 * 
	 * @param entity
	 *            ����
	 * @return
	 */
	public void delete(T entity);

	/**
	 * ����IDɾ��ʵ�����.
	 * 
	 * @param id
	 *            ��¼ID
	 */
	public void delete(PK id);

	/**
	 * ����ID����ɾ��ʵ�����.
	 * 
	 * @param ids
	 *            ID����
	 */
	public void delete(PK[] ids);

	/**
	 * ˢ��session.
	 * 
	 */
	public void flush();

	/**
	 * ���Session.
	 * 
	 */
	public void clear();

	/**
	 * ���ĳһ����.
	 * 
	 * @param object
	 *            ��Ҫ����Ķ���
	 */
	public void evict(Object object);

	/**
	 * ����Pager������в�ѯ(�ṩ��ҳ�����ҡ�������).
	 * 
	 * @param pager
	 *            Pager����
	 * @return Pager����
	 */
	public Pager findByPager(Pager pager);

	/**
	 * ����Pager��DetachedCriteria������в�ѯ(�ṩ��ҳ�����ҡ�������).
	 * 
	 * @param pager
	 *            Pager����
	 * @return Pager����
	 */
	public Pager findByPager(Pager pager, DetachedCriteria detachedCriteria);

}