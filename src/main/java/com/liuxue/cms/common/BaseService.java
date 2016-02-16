package com.liuxue.cms.common;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

/**
 * Created by Sandwich on 2016/2/16.
 */
public class BaseService {
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }
    @Resource
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
