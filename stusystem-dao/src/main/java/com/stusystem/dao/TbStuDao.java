package com.stusystem.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stusystem.entity.TbStu;

/**
 * 处理学生操作的dao层
 * @author hgw
 *
 */
@Repository("stuDao")
public class TbStuDao extends BaseDao {

	//添加学生
	public boolean addTbStu(TbStu stu) {
		try {
			getSession().save(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//删除学生
	public boolean deleteTbStu(TbStu stu) {
		try {
			getSession().delete(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//修改学生
	public boolean updateTbStu(TbStu stu) {
		try {
			getSession().update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//查询学生
	public List findStuList(String hql) {
		return getSession().createQuery(hql).list();
	}
	
	//查询单个学生(根据id查询学生)
	public TbStu getStuId(TbStu stu) {
		return getSession().get(TbStu.class, stu.getSno());
	}
}












