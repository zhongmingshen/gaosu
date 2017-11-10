/**
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.onway.makeploy.common.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.onway.makeploy.common.dal.daointerface.ProductParameterDAO;

import com.onway.makeploy.common.dal.dataobject.ProductParameterDO;
import java.util.List;
import org.springframework.dao.DataAccessException;
import java.util.Map;
import java.util.HashMap;

/**
 * An ibatis based implementation of dao interface <tt>com.onway.makeploy.common.dal.daointerface.ProductParameterDAO</tt>.
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
 * @version $Id: IbatisProductParameterDAO.java,v 1.0 2013/10/29 07:34:20 guangdong.li Exp $
 */
public class IbatisProductParameterDAO extends SqlMapClientDaoSupport implements ProductParameterDAO {
	/**
	 *  Query DB table <tt>makeploy_product_parameters</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from makeploy_product_parameters</tt>
	 *
	 *	@param productNo
	 *	@param shopId
	 *	@return List<ProductParameterDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProductParameterDO> selectInfoByShopIdAndProductNo(String productNo, String shopId) throws DataAccessException {

	Map<String,Object> param = new HashMap<String,Object>();

        param.put("productNo", productNo);
        param.put("shopId", shopId);

        return getSqlMapClientTemplate().queryForList("MS-PRODUCT-PARAMETER-SELECT-INFO-BY-SHOP-ID-AND-PRODUCT-NO", param);

    }

	/**
	 *  Query DB table <tt>makeploy_product_parameters</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from makeploy_product_parameters</tt>
	 *
	 *	@param productNo
	 *	@param parflag
	 *	@return List<ProductParameterDO>
	 *	@throws DataAccessException
	 */	 
    public List<ProductParameterDO> selectProductParametersById(String productNo, String parflag) throws DataAccessException {

	Map<String,Object> param = new HashMap<String,Object>();

        param.put("productNo", productNo);
        param.put("parflag", parflag);

        return getSqlMapClientTemplate().queryForList("MS-PRODUCT-PARAMETER-SELECT-PRODUCT-PARAMETERS-BY-ID", param);

    }

	/**
	 *  Insert one <tt>ProductParameterDO</tt> object to DB table <tt>makeploy_product_parameters</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into makeploy_product_parameters(SHOP_ID,PRODUCT_NO,FATHER_NAME,CHILDREN_NAME,STOCK,CREATER,PARFLAG,GMT_CREATE,MODIFIER,GMT_MODIFIED,MEMO) values (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP, ?, CURRENT_TIMESTAMP, ?)</tt>
	 *
	 *	@param productParameter
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int insert(ProductParameterDO productParameter) throws DataAccessException {
    	if (productParameter == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PRODUCT-PARAMETER-INSERT", productParameter);

        return productParameter.getId();
    }

	/**
	 *  Insert one <tt>ProductParameterDO</tt> object to DB table <tt>makeploy_product_parameters</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into makeploy_product_parameters(ID,SHOP_ID,PRODUCT_NO,FATHER_NAME,CHILDREN_NAME,STOCK,PARFLAG,CREATER,GMT_CREATE,MODIFIER,GMT_MODIFIED,MEMO) values (?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP, ?, CURRENT_TIMESTAMP, ?)</tt>
	 *
	 *	@param productParameter
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int addPartnerPara(ProductParameterDO productParameter) throws DataAccessException {
    	if (productParameter == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PRODUCT-PARAMETER-ADD-PARTNER-PARA", productParameter);

        return productParameter.getId();
    }

	/**
	 *  Update DB table <tt>makeploy_product_parameters</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update makeploy_product_parameters set STOCK=?, GMT_MODIFIED=CURRENT_TIMESTAMP where ((SHOP_ID = ?) AND (PRODUCT_NO = ?) AND (PARFLAG = ?))</tt>
	 *
	 *	@param stock
	 *	@param shopId
	 *	@param productNo
	 *	@param parflag
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int editProductParameterInfo(int stock, String shopId, String productNo, String parflag) throws DataAccessException {
        Map<String,Object> param = new HashMap<String,Object>();

        param.put("stock", new Integer(stock));
        param.put("shopId", shopId);
        param.put("productNo", productNo);
        param.put("parflag", parflag);

        return getSqlMapClientTemplate().update("MS-PRODUCT-PARAMETER-EDIT-PRODUCT-PARAMETER-INFO", param);
    }

}