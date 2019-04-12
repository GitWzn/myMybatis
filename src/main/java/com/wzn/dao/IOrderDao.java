package com.wzn.dao;

import java.util.List;
import com.wzn.Bean.Order;

public interface IOrderDao {
	public List<Order> findAllOrder();
}
