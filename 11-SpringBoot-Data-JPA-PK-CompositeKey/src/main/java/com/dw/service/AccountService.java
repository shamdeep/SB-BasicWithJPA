package com.dw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.entity.Account;
import com.dw.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository repository;

	public void saveData() {

		Account account = new Account();
		account.setBranchName("Pune");
		account.setMinBal(20000.00);

		account.setAcctId(102);
		account.setAcctType("Saving");
		account.setHolderName("Deepak");
		
		repository.save(account);
	}
}
