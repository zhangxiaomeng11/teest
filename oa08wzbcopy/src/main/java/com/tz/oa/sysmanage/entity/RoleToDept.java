package com.tz.oa.sysmanage.entity;

/**
 * 角色部门对应表
 * 类描述：  
 * 类名称：com.tz.ssspm.sysmanage.bean.RoleToMenu       
 * 创建人：keven  
 * 创建时间：2016年11月30日 下午1:37:03
 * @version   V1.0
 */
public class RoleToDept {
	private Long roleId;
	private Long deptId;
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
}
