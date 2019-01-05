package com.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//import com.bean.AdminBean;
import com.bean.Agent;
import com.bean.Customers;

public interface IService {
	
	 List <Agent> viewPolicy() throws ClassNotFoundException, IOException, SQLException; 
	 List <Customers> viewCustomers() throws ClassNotFoundException, IOException, SQLException;
		
	

}
