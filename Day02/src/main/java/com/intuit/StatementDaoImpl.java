package com.intuit;

import org.springframework.stereotype.Repository;

@Repository
public class StatementDaoImpl extends BaseDaoSupport implements StatementDao
{
	public void addStatement(int accountNumber,String type,int amount)
	{
		String query = "insert into statements(account_number,type,amount) values(?,?,?)";
		getJdbcTemplate().update(query,accountNumber,type,amount);
	}
}