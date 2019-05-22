package com.tz.oa.sysmanage.entity;

import java.util.Date;

import com.tz.oa.framework.dto.TreeDto;
/**
 * 
 * 类描述：区域对象Dept  
 * 类名称：com.tz.ssspm.sysmanage.bean.Dept       
 * 创建人：keven  
 * 创建时间：2016年11月24日 下午4:33:47
 * @version   V1.0
 */
public class Area extends TreeDto implements java.io.Serializable{
	
 	private static final long serialVersionUID = -8572618187826567349L;

  	private String parentName;
   	private Integer sort;
  	private String code;
	private String	updateBy;
	private Date updateDate;
	private String remarks;
	
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	 
}