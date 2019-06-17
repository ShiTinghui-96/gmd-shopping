package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GOODS表对应的实体类，用于保存表中的数据
 * @author ShiTinghui
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
	
	/**
	 * 商品编号
	 */
    private Integer goodsId;

    /**
	 * 商品名称
	 */
    private String goodsName;

    /**
	 * 商品价格
	 */
    private Double goodsPrice;

    /**
	 * 商品折扣价
	 */
    private Double goodsDiscount;

    /**
	 * 商品状态：0预售，1热卖中，2已下架
	 */
    private Integer goodsStatus;

    /**
	 * 商品数量
	 */
    private Integer goodsNum;

    /**
	 * 是否新品：0是新品，1不是新品
	 */
    private Integer goodsNew;

    /**
	 * 是否热卖：0是热卖，1不是热卖
	 */
    private Integer goodsHot;

    /**
	 * 商品级别：0一星，1二星，2三星，3四星，4五星
	 */
    private Integer goodsLevel;

    /**
	 * 商品简介
	 */
    private String goodsDesc;

    /**
	 * 商品详情
	 */
    private String goodsDetail;

    /**
	 * 商品图片
	 */
    private String goodsImg;

    /**
	 * 	二级类别编号
	 */
    private Integer typeTwoId;
    
    /**
     * 查询条件：商品价格下限
     */
    private Double goodsPriceMin;
    
    /**
     * 查询条件：商品价格上限
     */
    private Double goodsPriceMax;
    
    /**
	 * 查询条件：一级类别编号
	 */
    private Integer typeOneId;
    
    /**
	 *商品销量：用于保存统计分组的结果
	 */
    private Integer goodsSum;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Double getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(Double goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsNew() {
        return goodsNew;
    }

    public void setGoodsNew(Integer goodsNew) {
        this.goodsNew = goodsNew;
    }

    public Integer getGoodsHot() {
        return goodsHot;
    }

    public void setGoodsHot(Integer goodsHot) {
        this.goodsHot = goodsHot;
    }

    public Integer getGoodsLevel() {
        return goodsLevel;
    }

    public void setGoodsLevel(Integer goodsLevel) {
        this.goodsLevel = goodsLevel;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getTypeTwoId() {
        return typeTwoId;
    }

    public void setTypeTwoId(Integer typeTwoId) {
        this.typeTwoId = typeTwoId;
    }
}