package com.opentext.Hibernate;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opentetxt.hibernate1.dto.Department_info;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Department_info d=new Department_info();
        d.setDept_id(54);
        d.setDept_name("jkik");
        
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        System.out.println("ghhj");
        
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        
       Transaction t=s.beginTransaction();
        s.save(d);
        t.commit();
        s.close();
        
        
    }
}
