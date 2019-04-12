package com.wzn.Bean;

import lombok.Data;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private int cid;
	private String c_name;
	private int c_age;
	private int c_money;	
	//一对多
	private List<Order> orders;
}
