package com.wzn.Bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int uid;
	private String email;
	private String phone;
	private String address;
	
	public UserInfo(String email, String phone, String address) {
		super();
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
}
