package com.wzn.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.wzn.Bean.User;

public class FindManyUser {
	public static void main(String[] args) {
		try {
			//加载Mybatis配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
			//获取sqlSession类的生产工厂
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//获取sqlSession对象
			SqlSession sqlSession = sqlSessionFactory.openSession();
			inputStream.close();
			//操作数据库
			HashMap<String, Object> map = new HashMap<>();
			map.put("cloumnName", "username");
			map.put("keyWord", "%呵%");
			map.put("startIndex", 0);
			map.put("pageSize", 4 );
			List<User> users = sqlSession.selectList("com.wzn.userOperate.selectManyUser", map);
			for (User user : users) {
				System.out.println("查询多个数据的结果：" + user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
