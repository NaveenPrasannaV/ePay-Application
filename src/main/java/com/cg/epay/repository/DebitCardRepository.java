package com.cg.epay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.epay.entity.DebitCard;

public interface DebitCardRepository extends JpaRepository<DebitCard, String> {

}
