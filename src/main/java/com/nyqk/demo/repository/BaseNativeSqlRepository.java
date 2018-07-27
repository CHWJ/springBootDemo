package com.nyqk.demo.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BaseNativeSqlRepository {
    private final JdbcTemplate jdbcTemplate;

    public BaseNativeSqlRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<?> queryList(String sql, Class<?> clazz) {
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(clazz));
    }
}
