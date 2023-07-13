package com.cg.epay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.epay.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
