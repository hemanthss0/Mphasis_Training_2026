package com.test;

import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		OrderDao odao = new OrderDao();
		Order obj = new Order();
		obj.setId(2);
		obj.setO_name("Electronics");
		obj.setO_quantity(5);
		obj.setO_price(1500);
		odao.saveOrder(obj);
		//odao.updateOrder(obj);
		//odao.deleteOrder(obj);
		List<Order> list = odao.listAllOrders();
		list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));
		System.out.println("Done...");

	}

}
