package com.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Department {
	@Id
	private int deptId;
	private String deptName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="dept_proj", joinColumns= {@JoinColumn(name="deptId")}, inverseJoinColumns= {@JoinColumn(name="projId")})
	private Project proj;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	

}
