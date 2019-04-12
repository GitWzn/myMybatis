package com.wzn.dao;

import java.util.List;
import com.wzn.Bean.Book;

public interface IBookDao {
	public List<Book> findAllBook();
}
