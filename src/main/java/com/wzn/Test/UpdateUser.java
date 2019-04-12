package com.wzn.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UpdateUser {
	public static void main(String[] args) {
		try {
			//加载Mybatis配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			//获取sqlSession生产工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取sqlsession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//数据库操作
			HashMap<String, Object> map = new HashMap<>();
			map.put("username", "吴宗宁");
			map.put("password", "1234567");
			map.put("uid", 1);
			int result = sqlSession.update("com.wzn.userOperate.updateUserByUid", map);
			//事务提交
			sqlSession.commit();
			inputStream.close();
			System.out.println("更新数据后的结果：" + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
