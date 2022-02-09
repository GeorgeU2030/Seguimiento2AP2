package model;

import exception.NegativeNumberException;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW)throws NegativeNumberException {
		if(additionalW<0) {
			throw new NegativeNumberException(additionalW);
		}else {
		weight = weight + additionalW;
		}
	}
	public void removeWeight(double removeW)throws NegativeNumberException {
		if(removeW<0) {
			throw new NegativeNumberException(removeW);
		}else {
		weight= weight-removeW;
		}
	}
	
}
