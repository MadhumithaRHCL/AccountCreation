package com.account.service;

import java.util.List;

import com.account.entities.Account;
import com.account.entities.Customer;
import com.account.formbean.*;
public interface AccountService {
	
	Account createAccount(Account account);
	Account UpdateAccount(UpdateAccount updateAccount);
	public void deleteAccount(Long accountNumber);
	public List<Account>retriveAllAccount(String ifsc);
	//retrive using accountno
	public Account retriveAccountUsingAccountNo(Long accountNumber);

 
}
