package com.openbanking.api.infrastructure.persistence.repository;

import com.openbanking.api.infrastructure.persistence.entities.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> { }