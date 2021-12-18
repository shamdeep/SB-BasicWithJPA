package com.dw.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountPK implements Serializable {

	private Integer acctId;
	private String acctType;
	private String holderName;
}
