package com.wzn.Bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {//当使用二级缓存时需要将类序列化    因为对象缓存时需要序列化  所以实现序列化接口
	private static final long serialVersionUID = 1L;
	private int uid;
	private String username;
	private String password;
	private String u_sex;
	private Date birthday;
	
	private UserInfo userInfo;

	public User(String username, String password, String u_sex, Date birthday) {
		super();
		this.username = username;
		this.password = password;
		this.u_sex = u_sex;
		this.birthday = birthday;
	}
}
