package com.asiainfo.ctc.service.impl;

import com.asiainfo.ctc.entity.User;
import com.asiainfo.ctc.mapper.UserMapper;
import com.asiainfo.ctc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: shenxl
 * @Date: 2019/1/3 11:43
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findByid(id);
    }
}
