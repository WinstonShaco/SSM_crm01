package com.winston.crm.service;

import com.winston.common.utils.Page;
import com.winston.crm.po.Customer;
import com.winston.crm.po.QueryVo;

/**
 * @Author: 于新泽
 * @Date: Created in 21:06 2018/5/2.
 * @site :
 */

public interface CustomerService {

    //通过四个条件  查询分页对象
    public Page<Customer> selectPageByQueryVo(QueryVo vo);

    //通过ID查询客户
    public Customer selectCustomerById(Integer id);

    //修改客户通过ID
    public void updateCustomerById(Customer customer);

    //通过ID 删除客户
    public void deleteCustomerById(Integer id);
}
