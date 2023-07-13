package com.cg.epay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.epay.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
