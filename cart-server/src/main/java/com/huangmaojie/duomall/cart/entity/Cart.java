package com.huangmaojie.duomall.cart.entity;

import java.io.Serializable;
import java.util.Date;

public class Cart implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.uid
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private String uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private String goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_cover
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private String goodsCover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_unit_price
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Double goodsUnitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.goods_num
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Integer goodsNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.status
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.gmt_modified
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.gmt_create
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cart.version
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cart
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.id
     *
     * @return the value of cart.id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.id
     *
     * @param id the value for cart.id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.uid
     *
     * @return the value of cart.uid
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.uid
     *
     * @param uid the value for cart.uid
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_id
     *
     * @return the value of cart.goods_id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_id
     *
     * @param goodsId the value for cart.goods_id
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_cover
     *
     * @return the value of cart.goods_cover
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public String getGoodsCover() {
        return goodsCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_cover
     *
     * @param goodsCover the value for cart.goods_cover
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGoodsCover(String goodsCover) {
        this.goodsCover = goodsCover == null ? null : goodsCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_unit_price
     *
     * @return the value of cart.goods_unit_price
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Double getGoodsUnitPrice() {
        return goodsUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_unit_price
     *
     * @param goodsUnitPrice the value for cart.goods_unit_price
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGoodsUnitPrice(Double goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.goods_num
     *
     * @return the value of cart.goods_num
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Integer getGoodsNum() {
        return goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.goods_num
     *
     * @param goodsNum the value for cart.goods_num
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.status
     *
     * @return the value of cart.status
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.status
     *
     * @param status the value for cart.status
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.gmt_modified
     *
     * @return the value of cart.gmt_modified
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.gmt_modified
     *
     * @param gmtModified the value for cart.gmt_modified
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.gmt_create
     *
     * @return the value of cart.gmt_create
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.gmt_create
     *
     * @param gmtCreate the value for cart.gmt_create
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cart.version
     *
     * @return the value of cart.version
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cart.version
     *
     * @param version the value for cart.version
     *
     * @mbg.generated Sat Mar 28 13:25:12 CST 2020
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}