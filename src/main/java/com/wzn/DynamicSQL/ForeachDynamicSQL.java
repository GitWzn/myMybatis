package com.wzn.DynamicSQL;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wzn.Bean.User;
import com.wzn.Util.SqlSessionUtil;

public class ForeachDynamicSQL {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		ArrayList<Integer> uid = new ArrayList<>();
		uid.add(1);
		uid.add(16);
		uid.add(19);
		List<User> selectList = sqlSession.selectList("com.wzn.userOperate.foreachDynamicSQL", uid);
		for (User user : selectList) {
			System.out.println("返回的数据：" + user);
		}
	}
}
