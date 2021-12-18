package com.dw.repository;

import org.springframework.data.repository.CrudRepository;

import com.dw.entity.ContactsMasterEntity;

public interface ContactsMasterRepository extends CrudRepository<ContactsMasterEntity,Integer>{

	//public ContactsMasterEntity findByContactName(String name);
	
	
}
