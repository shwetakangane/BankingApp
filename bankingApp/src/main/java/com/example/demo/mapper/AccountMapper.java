package com.example.demo.mapper;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account=new Account(accountDto.getId(),accountDto.getAccHolderName(),accountDto.getBalance()
		);
		
		return account;	
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto=new AccountDto(account.getId(),account.getAccHolderName(),account.getBalance()
		);
		
		return accountDto;	
	}

}
