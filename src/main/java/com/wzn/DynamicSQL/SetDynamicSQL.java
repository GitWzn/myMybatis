package com.wzn.DynamicSQL;

import org.apache.ibatis.session.SqlSession;

import com.wzn.Bean.User;
import com.wzn.Util.SqlSessionUtil;

public class SetDynamicSQL {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		User user = new User();
		user.setUid(16);
		user.setUsername("米斯特余");
		user.setPassword("6666666");
		int result = sqlSession.update("com.wzn.userOperate.setDynamicSQL", user);
		sqlSession.commit();
		System.out.println("set动态SQL更新数据后的结果：" + result);
	}
}
