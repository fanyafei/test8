package com.itheima.service.impl;

import com.itheima.service.ICustomerService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author:fanyafei
 * @Version:1.0
 * @Date:2019/5/810:55.
 * @see:
 **/
@Service("customerService")
public class ICustomerServiceImpl implements ICustomerService {
	@Override
	public void saveCustomer() {
		System.out.println("保存了客户");
	}

	@Override
	public void updateCustomer(int i) {
		System.out.println("更新了客户。。。"+i);
	}

	@Override
	public int deleteCustomer() {
		System.out.println("删除了客户");
		return 0;
	}
}
