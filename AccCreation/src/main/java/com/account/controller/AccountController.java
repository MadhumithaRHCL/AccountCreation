package com.account.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.entities.Account;
import com.account.formbean.AccountForm;
import com.account.formbean.UpdateAccount;
import com.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping(path = "/createAccount")
	public ResponseEntity<Account> createAccount(@RequestBody AccountForm req) {
		Account account2=accountService.createAccount(new Account(req.getIfsc(), req.getBalance(), req.isStatus(),req.getAccount()));
		return new ResponseEntity<>(account2, HttpStatus.OK);
		
	}
	
	@PutMapping(path = "updateAccount")
	public ResponseEntity<Account> updateAccount(@RequestBody UpdateAccount account) {
		Account updatedAccount = accountService.UpdateAccount(account);
		return new ResponseEntity<Account>(updatedAccount, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = "deleteAccount/{accountnumber}")
	public ResponseEntity<Account> deleteAccount(@PathVariable(name = "accountnumber") Long accountnumber) {
		accountService.deleteAccount(accountnumber);
		return new ResponseEntity<Account>(HttpStatus.OK);

	}
	
	@GetMapping(path = "retriveallaccount/{ifsc}")
	public ResponseEntity<List<Account>> retriveAllAccount(@PathVariable(name = "ifsc") String ifsc) {
		List<Account>accounts= accountService.retriveAllAccount(ifsc);
		return new ResponseEntity<List<Account>>(accounts,HttpStatus.OK);

	}
	
	@GetMapping(path ="retriveaccount/{accountno}")
	public ResponseEntity<Account> retriveAccountUsingAccountNo(@PathVariable(name = "accountno") Long accountnumber) {
		Account account=accountService.retriveAccountUsingAccountNo(accountnumber);
		return new ResponseEntity<>(account,HttpStatus.OK);

	}
	
	

}
