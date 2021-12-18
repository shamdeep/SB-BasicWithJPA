package com.dw.model;

public class Product {

	private Integer pid;
	private String pname;
	private String prise;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer pid, String pname, String prise) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prise = prise;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrise() {
		return prise;
	}

	public void setPrise(String prise) {
		this.prise = prise;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prise=" + prise + "]";
	}

}
