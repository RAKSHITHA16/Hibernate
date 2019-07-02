package com.opentext.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.Hib.dto.Leaves_info;

public class Delete {
	
	public static void main(String[] args) {
		
   
    {
    	// Leaves_info d=new Leaves_info();
    	// d.setDescription("dgh");
    	 //d.setLeave_type("fhsj");
    	// d.setNo_of_leaves(34);
   
    	
    	
    	   Configuration cfg=new Configuration();
           cfg.configure("hibernate.cfg.xml");
           cfg.addAnnotatedClass(Leaves_info.class);
           System.out.println("ghhj");
           
           SessionFactory factory=cfg.buildSessionFactory();
           Session s=factory.openSession();
           
          Leaves_info l= s.get(Leaves_info.class, "casual leave");
           
          Transaction t=s.beginTransaction();
           s.delete(l);
           t.commit();
           s.close();
    }      
           
       
    }

}
