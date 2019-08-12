package com.airbat.web.controller;

import com.airbat.web.dto.TSysUser;
import com.airbat.web.mapper.TSysUserMapper;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {


    @Resource
    public TSysUserMapper tSysUserMapper;


    @RequestMapping("/")
    String home(){

        List<TSysUser> userList=tSysUserMapper.list();
        return JSON.toJSONString(userList);
    }
}
