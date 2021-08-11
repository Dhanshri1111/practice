package com.sunbeam;

class Vehicle{
	String company;
	String model;
	String type;
	double price;
	int Number;
	String colour;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String company, String model, String type, double price, int Number, String colour) {
		super();
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.Number = Number;
		this.colour = colour;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int no) {
		this.Number = no;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Vehicle [company=" + company + ", model=" + model + ", type=" + type + ", price=" + price + ", no=" + Number
				+ ", colour=" + colour + "]";
	}

	
	
}