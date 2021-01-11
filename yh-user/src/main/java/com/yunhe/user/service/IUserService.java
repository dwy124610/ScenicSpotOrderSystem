package com.yunhe.user.service;

import com.yunhe.common.model.domain.Users;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/9 17:29
 */
public interface IUserService {

    Users addUser(Users user);

    int deleteUserByUsername(String username);

    Users selectUserByUsername(String username);

    Users updateUser(Users user);
}
