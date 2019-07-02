package com.opentext.empinfo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opentext.empinfo.dto.EmpInfoBean;

public class Retrieve {
	
	
	public static void main(String[] args) {
		
		
		{

			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(EmpInfoBean.class);
			System.out.println("ghhj");

			SessionFactory factory=cfg.buildSessionFactory();
			Session s=factory.openSession();

			//          Transaction t=s.beginTransaction();
			EmpInfoBean l=  s.load(EmpInfoBean.class,1);
			
			System.out.println(l);

			int y=  l.getInd();
		
			

			System.out.println(y+" "+l.getName()+" "+l.getDob()+" "+l.getAge()+" "+l.getGender()+" "+l.getPhoneno()+" "+l.getEmailid()+" "+l.getDesignation()+" "+l.getJoiningdate()+" "+l.getSalary()+" "+l.getMgrid()+" "+l.getDeptid());

			s.close();




}
	}}
