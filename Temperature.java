import java.util.Scanner;

public class Temperature {
	private float degrees; //temperature value that is floating-point number
	private float celsius;
	private float fahrenheit;
	private String temp_scale; //C or F

	public void Temperature(float celsius, float fahrenheit) {
		celsius = celsius;
		fahrenheit = fahrenheit;
	}

	public void Temperature() {
		celsius = 0;
	}

	public void setCScale() {
		temp_scale = "C";
		// return temp_scale;
	}

	public void setFScale() {
		temp_scale = "F";
		//return temp_scale;
	}

	public float f_to_c() {
		Scanner input = new Scanner(System.in);
		System.out.println("How many Celsius would you like to convert to Fahrenheit?");
		celsius = input.nextFloat();
		fahrenheit = ((9*celsius)/5)+32;
		return fahrenheit;
	}

	public float c_to_f() {
		Scanner input = new Scanner(System.in);
		System.out.println("How much Fahrenheit would you like to convert to Celsius?");
		fahrenheit = input.nextFloat();
		celsius = (5*(fahrenheit-32)/9);
		return celsius;
	}

	public float getDegrees() {
		return degrees;
	}

	public float getCelsius() {
		return celsius;
	}

	public float getFahrenheit() {
		return fahrenheit;
	}

	public String toString() {
		return("Celsius: "+ celsius + " Fahrenheit: " + fahrenheit);
	}

}