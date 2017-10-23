package com.stusystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stusystem.entity.TbClass;

/**
 * 处理学生操作的dao层
 * @author hgw
 *
 */
@Repository("clsDao")
public class TbClassDao extends BaseDao {

	//添加班级
	public boolean addTbClass(TbClass cls) {
		try {
			getSession().save(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//查询班级
	public List findClassList(String hql) {
		return getSession().createQuery(hql).list();
	}
	
	//删除班级
	public boolean deleteTbClass(TbClass cls) {
		try {
			getSession().delete(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//修改班级
	public boolean updateTbClass(TbClass cls) {
		try {
			getSession().update(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//查询单个班级的信息(根据id查询班级信息)
	public TbClass getClassId(TbClass cls) {
		return getSession().get(TbClass.class, cls.getCno());
	}
}











