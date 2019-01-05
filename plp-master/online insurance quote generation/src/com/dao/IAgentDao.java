package com.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.bean.Agent;
import com.bean.Customers;

public interface IAgentDao {

	 List <Agent> viewPolicy() throws ClassNotFoundException, IOException, SQLException; 
	 
	 List <Customers> viewCustomers(String string) throws ClassNotFoundException, IOException, SQLException;
		

}
