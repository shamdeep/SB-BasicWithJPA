package com.dw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.entity.Account;

public interface AccountRepository  extends JpaRepository<Account, Integer>{

}
