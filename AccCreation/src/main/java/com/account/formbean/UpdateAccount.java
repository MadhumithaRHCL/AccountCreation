package com.account.formbean;

public class UpdateAccount {
	
	private Long AccountNumber;
	private double balance;
	private boolean status;
	
	
	public Long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public UpdateAccount() {
		super();
	}
	@Override
	public String toString() {
		return "UpdateAccount [AccountNumber=" + AccountNumber + ", balance=" + balance + ", status=" + status + "]";
	}
	
	
	
	

}
