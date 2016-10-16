package com.landian.crud.ibatis.dao;

import com.landian.crud.core.dao.ProxyDao;
import com.landian.crud.ibatis.sql.ProxyInsertSQL;
//SqlMapClientDaoSupport (Spring Framework 3.2.3.RELEASE API) 版本问题
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class ProxyDaoIbatis
//        extends SqlMapClientDaoSupport
        implements ProxyDao {

    @Override
    public int doInsert(String sql) {
//        Object object = this.getSqlMapClientTemplate().insert("crudProxy.doInsert", sql);
        return 1;
    }

    public int doInsertWidthId(String sql) {
//        this.getSqlMapClientTemplate().insert("crudProxy.doInsertWidthId", sql);
        return 1;
    }

    @Override
    public Object doInsertAndReturnId(String sql) {
        String returnIdSql = sql + " SELECT SCOPE_IDENTITY() AS returnObject";
        ProxyInsertSQL proxyInsertSQL = ProxyInsertSQL.builder().sql(returnIdSql).build();
//        Object returnVal = this.getSqlMapClientTemplate().insert("crudProxy.doInsertAndReturnObject", proxyInsertSQL);
//        return returnVal;
        return null;
    }

    @Override
    public int doUpdate(String sql) {
//        this.getSqlMapClientTemplate().update("crudProxy.doUpdate", sql);
        return 1;
    }

    @Override
    public List<HashMap<String, Object>> doFind(String sql) {
//        List<HashMap<String, Object>> emptyMap = this.getSqlMapClientTemplate().queryForList("crudProxy.doFind", sql);
//        return emptyMap;
        return null;
    }

    @Override
    public List<HashMap<String, Object>> doFindPage(String sql, int start, int pageSize) {
//        List<HashMap<String, Object>> emptyMap = this.getSqlMapClientTemplate().queryForList("crudProxy.doFindPage", sql, start, pageSize);
//        return emptyMap;
        return null;
    }

    @Override
    public int doDelete(String sql) {
//        this.getSqlMapClientTemplate().update("crudProxy.doDelete", sql);
        return 1;
    }

    @Override
    public List<Long> queryAsLongValue(String sql) {
        //ToDo
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<Integer> queryAsIntValue(String sql) {
        //ToDo
        return Collections.EMPTY_LIST;
    }
}
