package com.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bean.AdminBean;
import com.bean.Agent;
import com.bean.Customers;
import com.dao.AgentDaoImpl;
import com.dao.IAgentDao;
import com.service.IService;
import com.service.ServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class QuoteMain {
	 static Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		 AdminBean bean =null;
		 //int option=0;
		 while(true) {
			 System.out.println("**********Admin access***************");
			 System.out.println("1. check agent details");
			 System.out.println("2. check customer details");
			 
			 try 
				{
				 //System.out.println("hi");
					int option = 0;
					option=sc.nextInt();
//					System.out.println("enter");

					switch (option) {

					case 1:
						
						ServiceImpl iservice = new ServiceImpl();
						//System.out.println("bye");
					             
						List<Agent> al=new ArrayList();
						al=iservice.viewPolicy();
						//System.out.println("before loop");
						int number =0;
						
						for( Agent ad:al) {
							
							number++;
							System.out.println(number+" "+ad);
						}
						
						System.out.println("enter the choice");
						int value=sc.nextInt();
						List<Customers> a2=new ArrayList();
						for(int i=0;i<al.size();i++) {
							if(i==(value-1)) {
							System.out.println(al.get(i));
							Agent agent=new Agent();
							agent=al.get(i);
							System.out.println(agent.getAgentId());
							IAgentDao dao=new AgentDaoImpl();
							a2=dao.viewCustomers(agent.getAgentId());
							System.out.println(a2);
							}
						}
						//create a variable assign al.indexof;
						//if admin enter 1 
						//fetch the details of the customers from anither table 
						//by using agentId as forgein key 
						//display the details 
						//create table table_Name with parameteres
						//agentId (forgeinkey)
						
						
						
						
						
						
						
						break;
					
							default:
								System.out.println("out");
		 }
				}
		catch(Exception e) {
			
		}
		 
		 
		 
		 
	}

}
	 }
