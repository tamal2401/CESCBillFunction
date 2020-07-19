package com.example.demo.Model;

import java.util.Arrays;

public class BillDetails {
	private String name;
	private double preReading;
	private double postReading;
	private double amountMar;
	private double amountApr;
	private double amountMay;
	private double amountJune;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPreReading() {
		return preReading;
	}
	public void setPreReading(double preReading) {
		this.preReading = preReading;
	}
	public double getPostReading() {
		return postReading;
	}
	public void setPostReading(double postReading) {
		this.postReading = postReading;
	}
	public double getAmountMar() {
		return amountMar;
	}
	public void setAmountMar(double amountMar) {
		this.amountMar = amountMar;
	}
	public double getAmountApr() {
		return amountApr;
	}
	public void setAmountApr(double amountApr) {
		this.amountApr = amountApr;
	}
	public double getAmountMay() {
		return amountMay;
	}
	public void setAmountMay(double amountMay) {
		this.amountMay = amountMay;
	}
	public double getAmountJune() {
		return amountJune;
	}
	public void setAmountJune(double amountJune) {
		this.amountJune = amountJune;
	}
	@Override
	public String toString() {
		return "BillDetails [name=" + name + ", preReading=" + preReading + ", postReading=" + postReading
				+ ", amountMar=" + amountMar + ", amountApr=" + amountApr + ", amountMay=" + amountMay + ", amountJune="
				+ amountJune + "]";
	}
		

}
