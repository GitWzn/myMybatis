package com.wzn.DynamicSQL;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzn.Bean.User;
import com.wzn.Util.SqlSessionUtil;

public class IfDynamicSQL {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		User user = new User();
		user.setUsername("吴宗宁");
		user.setPassword("1234567");
		List<User> users = sqlSession.selectList("com.wzn.userOperate.ifDynamicSQL", user);
		for (User u : users) {
			System.out.println("返回的数据：" + u);
		}
	}
}
