package com.landian.crud.ibatis.sql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by Administrator on 2016/8/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProxyInsertSQL {
    /**
     *
     */
    private String sql;
    /**
     *
     */
    private Object returnObject;
}
