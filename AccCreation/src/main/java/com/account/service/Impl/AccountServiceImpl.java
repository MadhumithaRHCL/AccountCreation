package com.account.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.account.Exception.AccountNotFoundException;
import com.account.entities.Account;
import com.account.formbean.UpdateAccount;
import com.account.repository.AccountRepository;
import com.account.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account createAccount(Account account) {
		Account b = accountRepository.save(account);
		return b;
	}

	@Override
	public Account UpdateAccount(UpdateAccount updateAccount) {
		Account accountToBeUpdated = accountRepository.findById(updateAccount.getAccountNumber())
				.orElseThrow(AccountNotFoundException::new);
		accountToBeUpdated.setStatus(updateAccount.isStatus());
		accountToBeUpdated.setBalance(updateAccount.getBalance());
		accountRepository.save(accountToBeUpdated);
		return accountToBeUpdated;

	}

	@Override
	public void deleteAccount(Long accountNumber) {
		accountRepository.deleteById(accountNumber);

	}

	@Override
	public List<Account> retriveAllAccount(String ifsc) {
		List<Account> account = accountRepository.findByIfsc(ifsc);
		return account;
	}

	@Override
	public Account retriveAccountUsingAccountNo(Long accountNumber) {
		Account accno = accountRepository.findById(accountNumber).orElseThrow(AccountNotFoundException::new);
		return accno;
	}

}
