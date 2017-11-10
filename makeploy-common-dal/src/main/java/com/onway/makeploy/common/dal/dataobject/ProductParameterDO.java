/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.onway.makeploy.common.dal.dataobject;

import com.onway.makeploy.common.dal.dataobject.BaseDO;

import java.util.Date;

/**
 * A data object class directly models database table <tt>makeploy_product_parameters</tt>.
 *
 * This file is generated by <tt>onway-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>onway</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/makeploy_product_parameters.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>onway-gen-dal</tt> 
 * to generate this file.
 *
 * @author guangdong.li
 * @version $Id: ProductParameterDO.java,v 1.0 2013/10/29 07:34:20 guangdong.li Exp $
 */
public class ProductParameterDO extends BaseDO {
    private static final long serialVersionUID = 741231858441822688L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>ID</tt>.
	 */
	private int id;

	/**
	 * This property corresponds to db column <tt>SHOP_ID</tt>.
	 */
	private String shopId;

	/**
	 * This property corresponds to db column <tt>PRODUCT_NO</tt>.
	 */
	private String productNo;

	/**
	 * This property corresponds to db column <tt>FATHER_NAME</tt>.
	 */
	private String fatherName;

	/**
	 * This property corresponds to db column <tt>CHILDREN_NAME</tt>.
	 */
	private String childrenName;

	/**
	 * This property corresponds to db column <tt>STOCK</tt>.
	 */
	private int stock;

	/**
	 * This property corresponds to db column <tt>CREATER</tt>.
	 */
	private String creater;

	/**
	 * This property corresponds to db column <tt>PARFLAG</tt>.
	 */
	private String parflag;

	/**
	 * This property corresponds to db column <tt>GMT_CREATE</tt>.
	 */
	private Date gmtCreate;

	/**
	 * This property corresponds to db column <tt>MODIFIER</tt>.
	 */
	private String modifier;

	/**
	 * This property corresponds to db column <tt>GMT_MODIFIED</tt>.
	 */
	private Date gmtModified;

	/**
	 * This property corresponds to db column <tt>MEMO</tt>.
	 */
	private String memo;

    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>shopId</tt>.
     *
     * @return property value of shopId
     */
	public String getShopId() {
		return shopId;
	}
	
	/**
	 * Setter method for property <tt>shopId</tt>.
	 * 
	 * @param shopId value to be assigned to property shopId
     */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

    /**
     * Getter method for property <tt>productNo</tt>.
     *
     * @return property value of productNo
     */
	public String getProductNo() {
		return productNo;
	}
	
	/**
	 * Setter method for property <tt>productNo</tt>.
	 * 
	 * @param productNo value to be assigned to property productNo
     */
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

    /**
     * Getter method for property <tt>fatherName</tt>.
     *
     * @return property value of fatherName
     */
	public String getFatherName() {
		return fatherName;
	}
	
	/**
	 * Setter method for property <tt>fatherName</tt>.
	 * 
	 * @param fatherName value to be assigned to property fatherName
     */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

    /**
     * Getter method for property <tt>childrenName</tt>.
     *
     * @return property value of childrenName
     */
	public String getChildrenName() {
		return childrenName;
	}
	
	/**
	 * Setter method for property <tt>childrenName</tt>.
	 * 
	 * @param childrenName value to be assigned to property childrenName
     */
	public void setChildrenName(String childrenName) {
		this.childrenName = childrenName;
	}

    /**
     * Getter method for property <tt>stock</tt>.
     *
     * @return property value of stock
     */
	public int getStock() {
		return stock;
	}
	
	/**
	 * Setter method for property <tt>stock</tt>.
	 * 
	 * @param stock value to be assigned to property stock
     */
	public void setStock(int stock) {
		this.stock = stock;
	}

    /**
     * Getter method for property <tt>creater</tt>.
     *
     * @return property value of creater
     */
	public String getCreater() {
		return creater;
	}
	
	/**
	 * Setter method for property <tt>creater</tt>.
	 * 
	 * @param creater value to be assigned to property creater
     */
	public void setCreater(String creater) {
		this.creater = creater;
	}

    /**
     * Getter method for property <tt>parflag</tt>.
     *
     * @return property value of parflag
     */
	public String getParflag() {
		return parflag;
	}
	
	/**
	 * Setter method for property <tt>parflag</tt>.
	 * 
	 * @param parflag value to be assigned to property parflag
     */
	public void setParflag(String parflag) {
		this.parflag = parflag;
	}

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     *
     * @return property value of gmtCreate
     */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	
	/**
	 * Setter method for property <tt>gmtCreate</tt>.
	 * 
	 * @param gmtCreate value to be assigned to property gmtCreate
     */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Getter method for property <tt>modifier</tt>.
     *
     * @return property value of modifier
     */
	public String getModifier() {
		return modifier;
	}
	
	/**
	 * Setter method for property <tt>modifier</tt>.
	 * 
	 * @param modifier value to be assigned to property modifier
     */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

    /**
     * Getter method for property <tt>gmtModified</tt>.
     *
     * @return property value of gmtModified
     */
	public Date getGmtModified() {
		return gmtModified;
	}
	
	/**
	 * Setter method for property <tt>gmtModified</tt>.
	 * 
	 * @param gmtModified value to be assigned to property gmtModified
     */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Getter method for property <tt>memo</tt>.
     *
     * @return property value of memo
     */
	public String getMemo() {
		return memo;
	}
	
	/**
	 * Setter method for property <tt>memo</tt>.
	 * 
	 * @param memo value to be assigned to property memo
     */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}