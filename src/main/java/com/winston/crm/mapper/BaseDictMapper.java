package com.winston.crm.mapper;

import com.winston.crm.po.BaseDict;

import java.util.List;

/**
 * @Author: 于新泽
 * @Date: Created in 19:55 2018/5/2.
 * @site :
 */

public interface BaseDictMapper {

    // 查询
    public List<BaseDict> selectBaseDictListByCode(String code);
}
