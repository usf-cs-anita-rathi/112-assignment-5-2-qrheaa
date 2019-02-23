public class OdometerDemo {

	public static void main(String[] args){
		// Use your class with a test program that creates several trips with different fuel efficiencies.
		Odometer trip1 = new Odometer();

		trip1.odometer(20,10);
		trip1.setFuel(15);
		trip1.getTotal(5);
		System.out.println(trip1.getGas());

		Odometer trip2= new Odometer();

		trip2.odometer(15,60);
		trip2.setFuel(30);
		trip2.getTotal(10);
		System.out.println(trip2.getGas());

	}

	
}