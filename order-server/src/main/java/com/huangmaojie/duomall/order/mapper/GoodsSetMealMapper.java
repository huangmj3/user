package com.huangmaojie.duomall.order.mapper;

import com.huangmaojie.duomall.order.entity.GoodsSetMeal;
import com.huangmaojie.duomall.order.entity.GoodsSetMealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsSetMealMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    long countByExample(GoodsSetMealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int deleteByExample(GoodsSetMealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int insert(GoodsSetMeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int insertSelective(GoodsSetMeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    List<GoodsSetMeal> selectByExample(GoodsSetMealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    GoodsSetMeal selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsSetMeal record, @Param("example") GoodsSetMealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int updateByExample(@Param("record") GoodsSetMeal record, @Param("example") GoodsSetMealExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsSetMeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_set_meal
     *
     * @mbg.generated Sun Apr 26 18:30:51 CST 2020
     */
    int updateByPrimaryKey(GoodsSetMeal record);
}