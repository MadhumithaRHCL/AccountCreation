package com.account.formbean;

import com.account.entities.AccountType;

public class AccountForm {
	private String ifsc;
	private double balance;
	private AccountType account;
	private boolean status;
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
		/**
	 * @return the account
	 */
	public AccountType getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(AccountType account) {
		this.account = account;
	}
		public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public AccountForm(String ifsc, double balance, AccountType account, boolean status) {
		super();
		this.ifsc = ifsc;
		this.balance = balance;
		this.account = account;
		this.status = status;
	}
	@Override
	public String toString() {
		return "AccountForm [ifsc=" + ifsc + ", balance=" + balance + ", account=" + account + ", status=" + status
				+ "]";
	}
	public AccountForm() {
		super();
	}
	
	
	

}
