package com.yunhe.user.service.impl;

import com.yunhe.common.model.domain.Users;
import com.yunhe.common.model.domain.UsersKey;
import com.yunhe.common.mapper.UsersMapper;
import com.yunhe.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/9 17:31
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Resource
    UsersMapper usersMapper;

    @Override
    public Users addUser(Users user) {
        usersMapper.insert(user);
        return user;
    }

    @Override
    public int deleteUserByUsername(String username) {
        log.info("删除用户名为:"+username+"的用户");
        UsersKey usersKey = new UsersKey();
        usersKey.setUsername(username);
        return usersMapper.deleteByPrimaryKey(usersKey);
    }

    @Override
    public Users selectUserByUsername(String username) {
        UsersKey usersKey = new UsersKey();
        usersKey.setUsername(username);
        return usersMapper.selectByPrimaryKey(usersKey);
    }

    @Override
    public Users updateUser(Users user) {
        usersMapper.updateByPrimaryKey(user);
        return user;
    }
}
