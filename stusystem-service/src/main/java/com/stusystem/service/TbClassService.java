package com.stusystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stusystem.dao.TbClassDao;
import com.stusystem.entity.TbClass;

/**
 * 处理班级的服务类
 * @author hgw
 *
 */
@Service("clsService")
@Transactional(propagation=Propagation.REQUIRED)
public class TbClassService {

	//声明要提供Dao操作的接口
	@Resource(name="clsDao")
	private TbClassDao clsDao;
	
	//添加班级
	public boolean addTbClass(TbClass cls) {
		try {
			clsDao.addTbClass(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//删除班级
	public boolean deleteTbClass(TbClass cls) {
		try {
			clsDao.deleteTbClass(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//修改班级
	public boolean updateTbClass(TbClass cls) {
		try {
			clsDao.updateTbClass(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//查询班级
	public List<TbClass> findClassList(){
		String hql = "from TbClass c";
		return clsDao.findClassList(hql);
	}
	
	//查询单个班级的信息(根据id查询班级信息)
	public TbClass getClassId(TbClass cls) {
		return clsDao.getClassId(cls);
	}

	public void setClsDao(TbClassDao clsDao) {
		this.clsDao = clsDao;
	}
	
}
