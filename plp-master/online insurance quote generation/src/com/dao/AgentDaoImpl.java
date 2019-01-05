package com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Agent;
import com.bean.Customers;
import com.exception.AgentException;
import com.util.DBConnection;

public class AgentDaoImpl implements IAgentDao{

	@Override
	public List<Agent> viewPolicy() throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub

		Connection con=DBConnection.getConnection();
		int donorCount = 0;
		
		PreparedStatement ps=null;
		ResultSet resultset = null;
		
		List<Agent> al=new ArrayList<Agent>();
		try
		{
			ps=con.prepareStatement("select * from agent");
			resultset=ps.executeQuery();
			
			while(resultset.next())
			{	
				Agent agent=new Agent();
				agent.setAgentId(resultset.getString(1));
				agent.setAgentName(resultset.getString(2));
				agent.setNumofCustomers(resultset.getInt(3));
				al.add(agent);
				//al.viewPolicy(agent);
				
				//donorCount++;
			}			
			
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return al;
	}

	@Override
	public List<Customers> viewCustomers(String agentId) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stu
Connection con=DBConnection.getConnection();
		PreparedStatement ps=null;
		ResultSet resultset = null;
		
		List<Customers> a2=new ArrayList<Customers>();
		try
		{
			ps=con.prepareStatement("select c.customername,c.agentid,c.policy_businesssegment from customers c,agent a where c.agentid=a.agentid and a.agentid=?");
		
				ps.setString(1,agentId); 
				 

			resultset=ps.executeQuery();
			
			while(resultset.next())
			{	
				Customers customer=new Customers();
				
				customer.setCustomerName(resultset.getString(1));
				customer.setAgentId(resultset.getString(2));
				
				customer.setPolicy_BusinessSegment(resultset.getString(3));
				a2.add(customer);
				//al.viewPolicy(agent);
				
				//donorCount++;
			}		
			
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return a2;
	}
	}

	


	

