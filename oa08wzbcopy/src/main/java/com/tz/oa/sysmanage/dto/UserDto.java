package com.tz.oa.sysmanage.dto;

import java.util.List;

import com.tz.oa.sysmanage.entity.User;
 
/**
 * 
 * 类描述 用户对象bean：  
 * 类名称：com.tz.ssspm.sysmanage.bean.User       
 * 创建人：keven  
 * 创建时间：2016年11月5日 下午9:06:40
 * @version   V1.0
 */
public class UserDto extends User implements java.io.Serializable{

 	private static final long serialVersionUID = 3573926540976059111L;
 	
 	private String deptName;
 	//private List<Role> roleList;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	 
	 
	
}