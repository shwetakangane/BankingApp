package com.example.demo.dto;

public class AccountDto {
	private Long id;
	private String accHolderName;
	private double balance;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountDto(Long id, String accHolderName, double balance) {
		super();
		this.id = id;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public AccountDto() {
		super();
	}
	
	


}
