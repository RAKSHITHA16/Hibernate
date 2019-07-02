package com.opentext.empinfo.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opentext.empinfo.dto.EmpInfoBean;

/**
 * Hello world!
 *
 */
public class InsertSave 
{
    public static void main( String[] args )
    {
    	EmpInfoBean eb=new EmpInfoBean();
    	
    	  
           
           
    	eb.setInd(0);
    	eb.setName("ravi");
      eb.setDob("2013-02-01");
    	eb.setAge(21);
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
    	
    	
    	   SessionFactory factory=cfg.buildSessionFactory();
           Session s=factory.openSession();
           
          Transaction t=s.beginTransaction();
           s.save(eb);
           t.commit();
           s.close();
           
    }
}
