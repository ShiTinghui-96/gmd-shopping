package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ORDERS_SETAILS表对应的实体类，用于封装一行订单明细信息
 * 
 * @author ShiTinghui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails implements java.io.Serializable {
	private static final long serialVersionUID = -5748885032949678910L;
	/**
	 * 订单明细编号
	 */
	private Integer orderDetailId;
	/**
	 * 订单编号
	 */
	private Integer orderId;
	/**
	 * 商品编号
	 */
	private Integer goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品名称
	 */
	private String goodsPrice;
	/**
	 * 成交价
	 */
	private Double goodsFinalPrice;
	/**
	 * 成交数量
	 */
	private Integer goodsFinalNum;

}