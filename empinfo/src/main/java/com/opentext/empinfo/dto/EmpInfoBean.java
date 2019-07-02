package com.opentext.empinfo.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_info")

public class EmpInfoBean implements Serializable{
	
	@Id
	@Column(name="Id")
	private int ind;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="Age")
	private int age;
	
	@Column(name="Gender")
	private char gender;
	
	@Column(name="PhoneNo")
	private long phoneno;
	
	@Column(name="EmailId")
	private String emailid;
	
	@Column(name="Designation")
	private String designation;
	
	@Column(name="Joiningdate")
	private String joiningdate;
	
	@Column(name="Salary")
	private int salary;
	
	@Column(name="MGRId")
	private int mgrid;
	
	@Column(name="Dept_Id")
	private int deptid;

	public int getInd() {
		return ind;
	}

	public void setInd(int ind) {
		this.ind = ind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate( String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getMgrid() {
		return mgrid;
	}

	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	
	
	
	
	
	

}
