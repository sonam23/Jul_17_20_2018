package com.intuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService
{
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private StatementDao statementDao;
	
	public void deposit(int accountNumber,String type, int amount) {
		accountDao.deposit(accountNumber, amount);
		statementDao.addStatement(accountNumber, type, amount);
	}
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=MyOwnSillyException.class)
	public void withdraw(int accountNumber,String type, int amount)throws MyOwnSillyException
	{
		accountDao.withdraw(accountNumber, amount);
		String[] arr = {"a","b"};
		//arr[4] = "d";
		if(arr.length < 3)
			throw new MyOwnSillyException();
		statementDao.addStatement(accountNumber, type, amount);
	}
}








