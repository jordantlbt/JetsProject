package com.skilldistillery.jets.entities;

public abstract class Jet {

	protected String type;
	private String model;
	private double speed;
	private int range;
	private double price;

	public Jet(String type, String model, double speed, int range, double price) {
		super();
		
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {

	}
	
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

}
