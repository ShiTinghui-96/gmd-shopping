package com.springcloud.entity;

/**
 * TYPE_ONE表对应的实体类，用于保存表中一行一级类别信息
 * @author ShiTinghui
 *
 */
public class TypeOne {
	/**
	 * 一级类别编号
	 */
    private Integer typeOneId;
    
    /**
	 * 一级类别名称
	 */
    private String typeOneName;

    /**
	 * 序号
	 */
    private Integer typeOneNum;

    /**
	 * 备注
	 */
    private String typeOneRemark;

    public Integer getTypeOneId() {
        return typeOneId;
    }

    public void setTypeOneId(Integer typeOneId) {
        this.typeOneId = typeOneId;
    }

    public String getTypeOneName() {
        return typeOneName;
    }

    public void setTypeOneName(String typeOneName) {
        this.typeOneName = typeOneName;
    }

    public Integer getTypeOneNum() {
        return typeOneNum;
    }

    public void setTypeOneNum(Integer typeOneNum) {
        this.typeOneNum = typeOneNum;
    }

    public String getTypeOneRemark() {
        return typeOneRemark;
    }

    public void setTypeOneRemark(String typeOneRemark) {
        this.typeOneRemark = typeOneRemark;
    }
}