package com.wzn.Test;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.wzn.Bean.Author;
import com.wzn.Bean.Book;
import com.wzn.Util.SqlSessionUtil;
import com.wzn.dao.IAuthorDao;
import com.wzn.dao.IBookDao;

public class FindManyToMany {
	public static void main(String[] args) {
		//获取sqlSession对象
		SqlSession sqlSession = SqlSessionUtil.getSqlSession();
		//通过book查找author
		//获取接口对象
		/*IBookDao mapper = sqlSession.getMapper(IBookDao.class);
		//查询操作
		List<Book> books = mapper.findAllBook();
		for (Book book : books) {
			System.out.println(book);
		}*/
		//通过author查询book
		IAuthorDao mapper = sqlSession.getMapper(IAuthorDao.class);
		List<Author> authors = mapper.findAllAuthor();
		for (Author author : authors) {
			System.out.println(author);
		}
	}
}
