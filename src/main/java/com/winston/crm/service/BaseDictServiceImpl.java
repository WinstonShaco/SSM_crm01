package com.winston.crm.service;

import com.winston.crm.mapper.BaseDictMapper;
import com.winston.crm.po.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 于新泽
 * @Date: Created in 20:05 2018/5/2.
 * @site :
 */


@Service
public class BaseDictServiceImpl implements BaseDictService{


    @Autowired
    private BaseDictMapper baseDictMapper;


    @Override
    public List<BaseDict> selectBaseDictListByCode(String code) {

        return baseDictMapper.selectBaseDictListByCode(code);
    }
}
