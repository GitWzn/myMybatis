package com.wzn.Bean;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private int oid;
	private String orderNum;
	private String productName;
	private int price;
	private int count;
	private int cid;
}
