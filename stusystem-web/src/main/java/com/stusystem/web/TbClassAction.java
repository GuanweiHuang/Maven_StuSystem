package com.stusystem.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.stusystem.entity.TbClass;
import com.opensymphony.xwork2.ActionContext;
import com.stusystem.service.TbClassService;
/**
 * 班级相关请求处理
 * @author hgw
 *
 */
@Controller("clsAction")
public class TbClassAction {

	private TbClass cls;
	
	//声明提供Users服务的接口
	@Resource(name="clsService")	
	private TbClassService clsService;
	
	private List teacherList;
	
	private int msg;

	
	//执行添加班级1
	public String doAddClass() {
		if (clsService.addTbClass(cls)) {
			msg=1;
		} else {
			msg=2;
		}
		return "doAddClass";
	}
	
	//删除班级
	public String deleteClass() {
		if (cls.getCno()!=0) {
			clsService.deleteTbClass(cls);
			msg=1;
		} else {
			msg=2;
		}
		return "deleteClass";
	}
	//去到修改页面
	public String toUpdateClass() {
		cls = clsService.getClassId(cls);
//		ActionContext.getContext().put("teacherList", teacherService.findTeacherList());
		return "toUpdateClass";
	}
	
	//执行更改班级
	public String doUpdateClass() {
		if (clsService.updateTbClass(cls)) {
			msg=3;
		} else {
			msg=4;
		}
		return "doUpdateClass";
	}
	
	//查询所有班级
	public String findClassList() {
//		List list = clsService.findClassList();
		ActionContext.getContext().put("clsList", clsService.findClassList());
		return "findClassList";
	}
	
	//查询一个班级(根据id查询出班级)
	public TbClass getClassId(TbClass cls) {
		return clsService.getClassId(cls);
	}
	
	public TbClass getCls() {
		return cls;
	}

	public void setCls(TbClass cls) {
		this.cls = cls;
	}

	public int getMsg() {
		return msg;
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}

	public void setClsService(TbClassService clsService) {
		this.clsService = clsService;
	}

	public List getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List teacherList) {
		this.teacherList = teacherList;
	}
}
