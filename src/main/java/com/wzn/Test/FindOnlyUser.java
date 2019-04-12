package com.wzn.Test;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wzn.Bean.User;

public class FindOnlyUser {
	public static void main(String[] args) {
		try {
			//加载Mybatis配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			//获取sqlSession的生产工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//操作数据库   
			User user = sqlSession.selectOne("com.wzn.userOperate.selectOnlyUser", 1);
			System.out.println("查询一个数据的结果：" + user);
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
