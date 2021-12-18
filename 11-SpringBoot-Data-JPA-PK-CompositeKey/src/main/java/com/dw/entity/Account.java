package com.dw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BANK_ACCOUNTS")
@IdClass(value = AccountPK.class)
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private Double minBal;

	@Id
	private Integer acctId;

	@Id
	private String acctType;

	@Id
	private String holderName;

}