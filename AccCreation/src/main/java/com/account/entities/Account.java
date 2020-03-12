package com.account.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "accountsequence", initialValue = 123456, allocationSize = 1)
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "account_number")
	@GeneratedValue(strategy = GenerationType.AUTO/* generator = "accountsequence"*/)
	private long accountNumber;
	private String ifsc;
	private double balance;
	private boolean status;
	private AccountType account;

	public long getAccountNumber() {
		return accountNumber;
	}
	/*
	 * //@JsonIgnore //@OneToOne(mappedBy="account", cascade=CascadeType.ALL,
	 * fetch=FetchType.EAGER) private Customer customer;
	 */
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getAccount() {
		return account;
	}

	public void setAccount(AccountType account) {
		this.account = account;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", ifsc=" + ifsc + ", balance=" + balance + ", status="
				+ status + ", account=" + account + "]";
	}

	public Account(String ifsc, double balance, boolean status, AccountType account) {
		super();
		this.ifsc = ifsc;
		this.balance = balance;
		this.status = status;
		this.account = account;
	}
}
