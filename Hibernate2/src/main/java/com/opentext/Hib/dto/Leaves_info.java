package com.opentext.Hib.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leaves_info")


public class Leaves_info implements Serializable {
	
	@Id
	@Column(name="leave_type")
	private String leave_type;
	
	@Column(name="no_of_leaves")
	private int no_of_leaves;
	
	@Column(name="description")
	private String description;
	
	
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public int getNo_of_leaves() {
		return no_of_leaves;
	}
	public void setNo_of_leaves(int no_of_leaves) {
		this.no_of_leaves = no_of_leaves;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
