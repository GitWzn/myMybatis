package com.wzn.dao;

import java.util.List;

import com.wzn.Bean.User;

public interface IUserDao {
	// 查询全部数据
	public List<User> findAllUser();

	// 通过uid查询数据
	public User findUserById();

	public int saveUser(User user);
}
