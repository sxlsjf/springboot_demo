package com.asiainfo.ctc.mapper;

import com.asiainfo.ctc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: shenxl
 * @Date: 2019/1/3 11:35
 * @Version 1.0
 */

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user_table WHERE user_id=#{id}")
    public User findByid(@Param("id") Integer id);

}
