package com.epam.maven_Oops;

public class GulabJamun extends Sweets{
	int quantity;
	float price, weight;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public GulabJamun(int quantity, float price, float weight) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.weight = weight;
	}

	public GulabJamun() {
		super();
		// TODO Auto-generated constructor stub
	}
}
