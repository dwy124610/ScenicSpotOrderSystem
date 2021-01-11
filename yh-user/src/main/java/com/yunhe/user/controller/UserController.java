package com.yunhe.user.controller;

import com.yunhe.common.model.ResultObject;
import com.yunhe.common.model.domain.Users;
import com.yunhe.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: DongWenYu
 * @Date: 2021/1/9 17:54
 */
@Api(value = "users" , description = "用户维护（仅测试用）")
@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    IUserService userService;

    @ApiOperation("新增用户")
    @PostMapping("/add")
    public ResponseEntity<ResultObject> addUser(@RequestBody Users user){
        Users results = userService.addUser(user);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("删除用户")
    @DeleteMapping("/delete")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username" , value = "用户名" , dataType = "String" , paramType = "query")
    }
    )
    public ResponseEntity<ResultObject> deleteUser(@RequestParam String username){
        userService.deleteUserByUsername(username);
        return new ResponseEntity<>(new ResultObject<>(null), HttpStatus.OK);
    }

    @ApiOperation("查询用户")
    @GetMapping("/select")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username" , value = "用户名" , dataType = "String" , paramType = "query")
    }
    )
    public ResponseEntity<ResultObject> selectUserByUsername(@RequestParam String username){
        Users results = userService.selectUserByUsername(username);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }

    @ApiOperation("更新单位（更新全部字段）")
    @PutMapping("/update")
    public ResponseEntity<ResultObject> updateUser(@RequestBody Users user){
        Users results = userService.updateUser(user);
        return new ResponseEntity<>(new ResultObject<>(results), HttpStatus.OK);
    }
}
