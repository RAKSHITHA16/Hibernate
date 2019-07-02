package com.opentext.Hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.Hib.dto.Leaves_info;

public class Update {
	
  public static void main(String[] args) {
	

    
    
    {
    	 Leaves_info d=new Leaves_info();
    	 d.setDescription("Sgh");
    	 d.setLeave_type("fsj");
    	 d.setNo_of_leaves(4);
   
    	
    	
    	   Configuration cfg=new Configuration();
           cfg.configure("hibernate.cfg.xml");
           cfg.addAnnotatedClass(Leaves_info.class);
           System.out.println("ghhj");
           
           SessionFactory factory=cfg.buildSessionFactory();
           Session s=factory.openSession();
           
          Transaction t=s.beginTransaction();
           s.update(d);
           t.commit();
           s.close();
           
           
       
    }
    
   }  

}
