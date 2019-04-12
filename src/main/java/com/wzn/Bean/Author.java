package com.wzn.Bean;

import lombok.Data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
	private int aid;
	private String name;
	private int age;
	// 多对多
	private List<Book> books;

	/*@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", age=" + age + "]";
	}*/
}
