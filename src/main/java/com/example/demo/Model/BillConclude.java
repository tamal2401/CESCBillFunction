package com.example.demo.Model;

public class BillConclude {
	private String name;
	private double totalBillPaid;
	private double expectedBillAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalBillPaid() {
		return totalBillPaid;
	}
	public void setTotalBillPaid(double totalBillPaid) {
		this.totalBillPaid = totalBillPaid;
	}
	public double getExpectedBillAmount() {
		return expectedBillAmount;
	}
	public void setExpectedBillAmount(double expectedBillAmount) {
		this.expectedBillAmount = expectedBillAmount;
	}
	@Override
	public String toString() {
		return "BillConclude [name=" + name + ", totalBillPaid=" + totalBillPaid + ", expectedBillAmount="
				+ expectedBillAmount + "]";
	}
	

}
