package com.example.datasource_example.config;

import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataSourceConfig {

    private final DataSource dataSource;

    public DataSourceConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public DataSource getDataSource(){
        return dataSource;
    }
}
