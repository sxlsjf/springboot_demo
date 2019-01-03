package com.asiainfo.ctc.service;

import com.asiainfo.ctc.entity.User;

/**
 * @Author: shenxl
 * @Date: 2019/1/3 11:42
 * @Version 1.0
 */
public interface IUserService {
    public User findById(Integer id);
}
