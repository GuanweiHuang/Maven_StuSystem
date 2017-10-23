package com.stusystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stusystem.dao.TbStuDao;
import com.stusystem.entity.TbStu;

/**
 * 处理学生的服务层
 * @author hgw
 *
 */
@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class TbStuService {

	//声明要提供Dao操作的接口
	@Resource(name="stuDao")
	private TbStuDao stuDao;
	
	//添加学生
	public boolean addStu(TbStu stu) {
		try {
			stuDao.addTbStu(stu);
			return true;
		} catch (Exception e) {
			 e.printStackTrace();
		}
		return false;
	}
	
	//删除学生
	public boolean deleteStu(TbStu stu) {
		try {
			stuDao.deleteTbStu(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//修改学生
	public boolean updateStu(TbStu stu) {
		try {
			stuDao.updateTbStu(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//查询单个学生(根据id查询单个学生)
	public TbStu getStuId(TbStu stu) {
		return stuDao.getStuId(stu);
	}
	
	//查询学生
	public List<TbStu> findStuList(){
		String hql = "from TbStu s inner join s.cls c order by c.cno";
		return stuDao.findStuList(hql);
	}

	public TbStuDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(TbStuDao stuDao) {
		this.stuDao = stuDao;
	}
}
