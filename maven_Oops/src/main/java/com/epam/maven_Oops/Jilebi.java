package com.epam.maven_Oops;



public class Jilebi extends Sweets{
	int quantity; 
	float weight, price;
	@Override
	float calculateWeight(float weight, int quanity) {
		return 0;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Jilebi(int quantity, float weight, float price) {
		super();
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
	}
	
	public Jilebi() {
		super();
	}
}
