package com.wzn.Test;

import java.io.IOException;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.wzn.Bean.User;
import com.wzn.dao.IUserDao;

public class FindUserBySecondCache {
	public static void main(String[] args) {
		// 获取sqlSession对象
		try {
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("mybatis.cfg.xml"));
			SqlSession sqlSession1 = sqlSessionFactory.openSession();
			// 通过绑定Dao接口去加载接口的映射文件
			IUserDao userDao1 = sqlSession1.getMapper(IUserDao.class);
			// 通过操作接口的方法去调用映射文件中相应的操作功能
			List<User> users1 = userDao1.findAllUser();
			for (User user : users1) {
				System.out.println(user);
			}
			// 只有关闭sqlSession时告诉Mybatis数据查询成功 二级缓存才会将数据缓存起来
			// Mybatis才确认这个查询操作完成，才会进行数据的缓存
			sqlSession1.close();
			// 二级缓存 默认是打开的 但是需要指定哪个查询需要查询缓存 一开始查询数据时将查询到的数据缓存起来
			// 当不同的sqlSession查询数据时是在缓存中提取数据
			// 二级缓存需要是同一个SqlSession生产工厂生成的
			System.out.println("二级缓存");
			// 获取sqlSession对象
			SqlSession sqlSession2 = sqlSessionFactory.openSession();
			IUserDao userDao2 = sqlSession2.getMapper(IUserDao.class);
			// 通过操作接口的方法去调用映射文件中相应的操作功能
			List<User> users2 = userDao2.findAllUser();
			for (User user : users2) {
				System.out.println(user);
			}
			sqlSession2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
