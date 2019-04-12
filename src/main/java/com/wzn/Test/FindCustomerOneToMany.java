package com.wzn.Test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzn.Bean.Customer;
import com.wzn.Util.SqlSessionUtil;
import com.wzn.dao.ICustomerDao;

public class FindCustomerOneToMany {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		//获取接口对象
		ICustomerDao mapper = sqlSession.getMapper(ICustomerDao.class);
		//查询操作
		List<Customer> customers = mapper.findAllCustomer();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
