package com.example2.Spring.Spring_Project2;

public class Laptop {
	int srNo;
	String brand;
	float cost;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int srNo, String brand, float cost) {
		super();
		this.srNo = srNo;
		this.brand = brand;
		this.cost = cost;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [srNo=" + srNo + ", brand=" + brand + ", cost=" + cost + "]";
	}

}
