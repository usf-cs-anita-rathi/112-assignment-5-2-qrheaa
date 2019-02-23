import java.util.Scanner;

public class TemperatureDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Temperature test1 = new Temperature();
		Temperature test2 = new Temperature();

		System.out.println("Would you like to convert to Fahrenheit(f) or Celsius(c) ?");
		String temp_ch = input.next();

		if(temp_ch.equals("c")) {
			System.out.println(test1.f_to_c());
			System.out.println("Test2: ");
			System.out.println(test2.f_to_c());
		}
		else {
			System.out.println(test1.c_to_f());
			System.out.println("Test2: ");
			System.out.println(test2.f_to_c());
		}
	}
}