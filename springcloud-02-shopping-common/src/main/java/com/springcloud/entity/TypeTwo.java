package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TYPE_TWO表对应的实体类，用于保存表中二级类别信息
 * 
 * @author ShiTinghui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeTwo {
	/**
	 * 二级类别编号
	 */
	private Integer typeTwoId;

	/**
	 * 二级类别名称
	 */
	private String typeTwoName;

	/**
	 * 一级类别编号
	 */
	private Integer typeOneId;

	/**
	 * 备注
	 */
	private String typeTwoRemark;

	public Integer getTypeTwoId() {
		return typeTwoId;
	}

	public void setTypeTwoId(Integer typeTwoId) {
		this.typeTwoId = typeTwoId;
	}

	public String getTypeTwoName() {
		return typeTwoName;
	}

	public void setTypeTwoName(String typeTwoName) {
		this.typeTwoName = typeTwoName;
	}

	public Integer getTypeOneId() {
		return typeOneId;
	}

	public void setTypeOneId(Integer typeOneId) {
		this.typeOneId = typeOneId;
	}

	public String getTypeTwoRemark() {
		return typeTwoRemark;
	}

	public void setTypeTwoRemark(String typeTwoRemark) {
		this.typeTwoRemark = typeTwoRemark;
	}
}