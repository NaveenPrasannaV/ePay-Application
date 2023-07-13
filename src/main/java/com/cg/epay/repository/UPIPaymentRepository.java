package com.cg.epay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.epay.entity.UPIPayment;

public interface UPIPaymentRepository extends JpaRepository<UPIPayment, String> {

}
