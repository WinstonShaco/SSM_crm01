package com.winston.crm.mapper;

import com.winston.crm.po.Customer;
import com.winston.crm.po.QueryVo;

import java.util.List;

/**
 * @Author: 于新泽
 * @Date: Created in 21:23 2018/5/2.
 * @site :
 */

public interface CustomerMapper {

    //总条数
    public Integer customerCountByQueryVo(QueryVo vo);

    //结果集
    public List<Customer> selectCustomerListByQueryVo(QueryVo vo);

    //通过ID查询客户
    public Customer selectCustomerById(Integer id);

    //修改客户通过ID
    public void updateCustomerById(Customer customer);

    //通过ID 删除客户
    public void deleteCustomerById(Integer id);
}
