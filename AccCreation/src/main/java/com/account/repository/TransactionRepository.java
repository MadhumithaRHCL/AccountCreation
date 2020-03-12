package com.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entities.AccountTransaction;
import com.account.entities.Customer;

public interface TransactionRepository extends JpaRepository<Customer,Long>
{
	// List<AccountTransaction> findByAccountAccountNumber(Long accountNumber);

}
