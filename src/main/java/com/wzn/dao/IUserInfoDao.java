package com.wzn.dao;

import java.util.List;
import com.wzn.Bean.UserInfo;

public interface IUserInfoDao {
	public List<UserInfo> findAllUserInfo();
}
