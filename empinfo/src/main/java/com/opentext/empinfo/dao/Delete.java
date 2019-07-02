package com.opentext.empinfo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.empinfo.dto.EmpInfoBean;

public class Delete {
	
	public static void main(String[] args) {
		
		   
	    {
	    	
	    	
	    	
	    	   Configuration cfg=new Configuration();
	           cfg.configure("hibernate.cfg.xml");
	           cfg.addAnnotatedClass(EmpInfoBean.class);
	           System.out.println("ghhj");
	           
	           SessionFactory factory=cfg.buildSessionFactory();
	           Session s=factory.openSession();
	           
	           EmpInfoBean l= s.get(EmpInfoBean.class, 5);
	           
	          Transaction t=s.beginTransaction();
	           s.delete(l);
	           t.commit();
	           s.close();
	    }  }      

}
