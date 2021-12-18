package com.dw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
