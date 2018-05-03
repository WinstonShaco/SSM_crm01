package com.winston.crm.service;

import com.winston.crm.po.BaseDict;

import java.util.List;

/**
 * @Author: 于新泽
 * @Date: Created in 20:05 2018/5/2.
 * @site :
 */

public interface BaseDictService {

    // 查询
    public List<BaseDict> selectBaseDictListByCode(String code);

}
