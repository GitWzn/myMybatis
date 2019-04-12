package com.wzn.Test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.wzn.Bean.User;
import com.wzn.Util.SqlSessionUtil;
import com.wzn.dao.IUserDao;

public class FindUserByInterface {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		//通过绑定Dao接口去加载接口的映射文件   
		IUserDao userDao = sqlSession.getMapper(IUserDao.class);
		//通过操作接口的方法去调用映射文件中相应的操作功能
		List<User> users = userDao.findAllUser();
		for (User user : users) {
			System.out.println(user);
		}
		/*int result = userDao.saveUser(new User("看看看", "23221312", "男", new Date()));
		sqlSession.commit();
		System.out.println("添加后的结果：" + result);*/
	}
}
