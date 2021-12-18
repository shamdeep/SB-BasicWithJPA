package com.dw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "EMP_ADDRES_TBL")
public class Address {

	@Id
	@Column(name = "ADDRS_ID")
	private Integer addrsId;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE")
	private String state;

	@Column(name = "EMP_ID")
	private Integer empId;

}
