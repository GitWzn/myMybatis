package com.wzn.Test;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeleteUser {
	public static void main(String[] args) {
		try {
			//加载Mybatis配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			//获取SQLSession生产工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//操作数据库
			int result = sqlSession.delete("com.wzn.userOperate.deleteUserByUid", 15);
			//提交事务
			sqlSession.commit();
			inputStream.close();
			System.out.println("删除数据后的结果：" + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
