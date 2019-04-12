package com.wzn.Test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.wzn.Bean.User;
import com.wzn.Util.SqlSessionUtil;
import com.wzn.dao.IUserDao;

public class FindUserByInternalCache {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		//通过绑定Dao接口去加载接口的映射文件   
		IUserDao userDao1 = sqlSession.getMapper(IUserDao.class);
		//通过操作接口的方法去调用映射文件中相应的操作功能
		List<User> users1 = userDao1.findAllUser();
		for (User user : users1) {
			System.out.println(user);
		}
		//一级缓存默认是打开的  随时可以使用    不需要指定哪个查询需要缓存查询  
		//一级缓存就是当sqlSession查询到数据后缓存起来
		//当同一个sqlSession查询数据时是在缓存中提取数据  不会再次操作数据库查询数据
		System.out.println("一级缓存");
		IUserDao userDao2 = sqlSession.getMapper(IUserDao.class);
		//通过操作接口的方法去调用映射文件中相应的操作功能
		List<User> users2 = userDao2.findAllUser();
		for (User user : users2) {
			System.out.println(user);
		}
	}
}
