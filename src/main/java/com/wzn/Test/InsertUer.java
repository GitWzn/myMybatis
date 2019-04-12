package com.wzn.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.wzn.Bean.User;

public class InsertUer {
	public static void main(String[] args) {
		try {
			//加载配置文件    驱动数据库和连接数据可的配置文件
			InputStream  inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			//创建一个连接数据库对象的生产工场
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取session对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			//操作数据库
			User user = new User("呵656", "2325442", "女", new Date());
			int result = sqlSession.insert("com.wzn.userOperate.addUser", user);
			System.out.println("添加数据后的结果：" + result);
			System.out.println("添加数据后的user结果：" + user);
			//提交事务   只有提交事务后才可操作数据库
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
