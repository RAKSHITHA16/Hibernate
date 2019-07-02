package com.opentext.empinfo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.empinfo.dto.EmpInfoBean;

public class Update {
	
	 public static void main(String[] args) {
			

		    
		    
		    {
		    	 EmpInfoBean eb=new EmpInfoBean ();
		    	 eb.setInd(5);
		     	eb.setName("raviprakash");
		       eb.setDob("1996-02-21");
		     	eb.setAge(22);
		     	eb.setGender('M');
		     	eb.setPhoneno(90887);
		     	eb.setEmailid("ravi@123");
		     	eb.setDesignation("clerk");
		     	eb.setJoiningdate("2019-06-21");
		     	eb.setSalary(2000);
		     	eb.setMgrid(4);
		     	eb.setDeptid(4);
		     	
		    	
		    	
		    	   Configuration cfg=new Configuration();
		           cfg.configure("hibernate.cfg.xml");
		           cfg.addAnnotatedClass(EmpInfoBean.class);
		           System.out.println("ghhj");
		           
		           SessionFactory factory=cfg.buildSessionFactory();
		           Session s=factory.openSession();
		           
		          Transaction t=s.beginTransaction();
		           s.update(eb);
		           t.commit();
		           s.close();
		           
		           
		       
		    }
		    
		   }  


}
