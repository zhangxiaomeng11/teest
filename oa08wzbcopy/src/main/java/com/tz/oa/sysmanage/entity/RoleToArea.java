package com.tz.oa.sysmanage.entity;

/**
 * 角色区域对应表
 * 类描述：  
 * 类名称：com.tz.ssspm.sysmanage.bean.RoleToMenu       
 * 创建人：keven  
 * 创建时间：2016年11月30日 下午1:37:03
 * @version   V1.0
 */
public class RoleToArea {
	private Long roleId;
	private Long areaId;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	 
}
