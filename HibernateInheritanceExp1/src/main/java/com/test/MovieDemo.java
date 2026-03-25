package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MovieDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Movie mobj  = new Movie();
		mobj.setM_name("Tenet");
		mobj.setM_location("USA");
		Movie_2d mt = new Movie_2d();
		mt.setM_name("ABC");
		mt.setCasting("MLA");
		Movie_3d md = new Movie_3d();
		md.setM_name("Cartoon");
		md.setDirector("CN");
		session.persist(mobj);
		session.persist(mt);
		session.persist(md);
		t.commit();
		System.out.println("Done...");
		session.close();
	}
}
