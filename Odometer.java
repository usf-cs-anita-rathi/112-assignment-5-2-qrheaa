// Define a class called Odometer that will be used to track fuel and mileage for an automobile. 

import java.util.Scanner;

public class Odometer {
	private float miles;
	private float fuel;

	public void odometer(float miles, float fuel) {
		miles = miles;
		fuel = fuel;
	}

	public void setMiles() {
		miles = 0;
	}

	public void setFuel(int newFuel) {
		fuel = newFuel;
	}

	public void getTotal(int newFuel) {
		miles += newFuel;
	}

	public float getGas() {
		return (miles/fuel);
	}

}