package com.asiainfo.ctc.utils;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


/**
 * @Author: shenxl
 * @Date: 2019/1/3 13:37
 * @Version 1.0
 */
//@Configuration
public class DataSourceConfiguration {


  /*  // c3p0 连接池
    @Bean(name = "dataSource")
    @Qualifier(value = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "c3p0")
    public DataSource dataSource() {
                 return DataSourceBuilder.create().
                         type(com.mchange.v2.c3p0.ComboPooledDataSource.class).
                         build();
*/

}
