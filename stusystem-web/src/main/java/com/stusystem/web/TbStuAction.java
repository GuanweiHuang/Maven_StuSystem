package com.stusystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.stusystem.entity.TbClass;
import com.stusystem.entity.TbStu;
import com.opensymphony.xwork2.ActionContext;
import com.stusystem.service.TbClassService;
import com.stusystem.service.TbStuService;

/**
 * 处理学生相关请求
 * @author hgw
 *
 */
@Controller("stuAction")
public class TbStuAction {

	private TbStu stu;
	
	//声明提供Users服务的接口
	@Resource(name="stuService")
	private TbStuService stuService;
	
	@Resource(name="clsService")
	private TbClassService clsService;
	
	private List<TbClass> clsList;
	
	private int msg;
	
	//查询出所有班级
	public String findClassList() {
		clsList = clsService.findClassList();
		return "findClassList";
	}
	
	//添加学生
	public String addStu() {
		if (stuService.addStu(stu)) {
			msg=1;
		} else {
			msg=-1;
		}
		return "addStu";
	}
	
	//删除学生
	public String deleteStu() {
		if (stuService.deleteStu(stu)) {
			msg=2;
		} else {
			msg=-2;
		}
		return "deleteStu";
	}
	
	//去到修改学生的页面
	public String toUpdateStu() {
		stu = stuService.getStuId(stu);
		ActionContext.getContext().put("clsList", clsService.findClassList());
		return "toUpdateStu";
	}
	
	//执行修改学生操作
	public String doUpdateStu() {
		if (stuService.updateStu(stu)) {
			msg=3;
		} else {
			msg=-3;
		}
		return "doUpdateStu";
	}
	
	//查询所有学生
	public String findStuList() {
		ActionContext.getContext().put("stuList", stuService.findStuList());
		return "findStuList";
	}

	public TbStu getStu() {
		return stu;
	}

	public void setStu(TbStu stu) {
		this.stu = stu;
	}

	public List<TbClass> getClsList() {
		return clsList;
	}

	public void setClsList(List<TbClass> clsList) {
		this.clsList = clsList;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}

	public void setStuService(TbStuService stuService) {
		this.stuService = stuService;
	}

	public void setClsService(TbClassService clsService) {
		this.clsService = clsService;
	}
}
