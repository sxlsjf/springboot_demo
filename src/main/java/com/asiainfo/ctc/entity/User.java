package com.asiainfo.ctc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @Author: shenxl
 * @Date: 2019/1/3 11:22
 * @Version 1.0
 */

@Data
@TableName("user_table")
public class User {
    @TableField("user_id")
    private Integer id;
    @TableField("user_name")
    private String name;
}
