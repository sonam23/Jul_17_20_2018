package com.intuit;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao
{
	public void deposit(int accountNumber,int amount)
	{
		String query = "update accounts set balance=balance+? where account_number=?";
		getJdbcTemplate().update(query,amount,accountNumber);
	}
	public void withdraw(int accountNumber,int amount)
	{
		String query = "update accounts set balance=balance-? where account_number=?";
		getJdbcTemplate().update(query,amount,accountNumber);
	}
}
