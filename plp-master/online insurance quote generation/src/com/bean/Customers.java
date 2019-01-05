package com.bean;

public class Customers {
	private String customerName;
	private String agentId;
	private String policy_BusinessSegment;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getPolicy_BusinessSegment() {
		return policy_BusinessSegment;
	}
	public void setPolicy_BusinessSegment(String policy_BusinessSegment) {
		this.policy_BusinessSegment = policy_BusinessSegment;
	}
	@Override
	public String toString() {
		return "Customers [customerName=" + customerName + ", agentId=" + agentId + ", policy_BusinessSegment="
				+ policy_BusinessSegment + "]";
	}
	

}
