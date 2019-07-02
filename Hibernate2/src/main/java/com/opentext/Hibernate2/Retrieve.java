package com.opentext.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.Hib.dto.Leaves_info;

public class Retrieve {
	public static void main(String[] args) {
		
	
	{

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Leaves_info.class);
		System.out.println("ghhj");

		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();

		//          Transaction t=s.beginTransaction();
		Leaves_info l=  s.load(Leaves_info.class,"casual leave");
		System.out.println(l);

		String y=  l.getLeave_type();
		String x=   l.getDescription();
		int u=     l.getNo_of_leaves();

		System.out.println(y+" "+x+" "+u);

		s.close();



	}

}
}