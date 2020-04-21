package com.huangmaojie.duomall.goods.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.goods.entity.UserAddress;
import com.huangmaojie.duomall.goods.entity.UserAddressExample;

/**
 * UserAddress扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface UserAddressExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<UserAddress> selectByExample(UserAddressExample example);

}