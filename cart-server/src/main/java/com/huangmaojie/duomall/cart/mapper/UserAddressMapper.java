package com.huangmaojie.duomall.cart.mapper;

import com.huangmaojie.duomall.cart.entity.UserAddress;
import com.huangmaojie.duomall.cart.entity.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    long countByExample(UserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int deleteByExample(UserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int insert(UserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int insertSelective(UserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    List<UserAddress> selectByExample(UserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    UserAddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByPrimaryKeySelective(UserAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_address
     *
     * @mbg.generated Fri Mar 27 18:20:01 CST 2020
     */
    int updateByPrimaryKey(UserAddress record);
}