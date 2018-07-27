package com.nyqk.demo.repository;

import java.util.List;

public interface BaseNativeSqlRepositoryInterface {
    List<?> queryList(String sql, Class<?> clazz);
}
