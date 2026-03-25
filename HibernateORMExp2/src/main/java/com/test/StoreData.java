package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer c = new Customer();
		c.setC_name("Viratt");
		c.setC_item("BCCi");
		c.setC_city("DELHIi");
		session.persist(c);
		t.commit();
		Customer obj = session.find(Customer.class, 102);
		System.out.println(obj.getId()+" "+obj.getC_name()+" "+obj.getC_item()+" "+obj.getC_city());
		obj.setC_name("Dhoni");
		obj.setC_item("BCCI");
		obj.setC_city("Ranchi");
		//session.remove(obj);
		//t.commit();
		System.out.println("Done...");
		session.close();		
	}
}
