package com.huangmaojie.duomall.cart.mapper.extension;

import com.github.pagehelper.Page;
import com.huangmaojie.duomall.cart.entity.User;
import com.huangmaojie.duomall.cart.entity.UserExample;

/**
 * User扩展Mapper
 *
 * @author huangmaojie
 * @date 2020/3/28
 */
public interface UserExtMapper {
    /**
     * 分页信息
     * @param example
     * @return 含有分页信息的列表
     */
    Page<User> selectByExample(UserExample example);

}
