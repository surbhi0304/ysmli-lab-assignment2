package day2assignments;

import java.util.*;

public class CarApplication {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Menu----");
		System.out.println("1. to create vehicel object");
		System.out.println("2. to display car object");
		System.out.println("3. to create convertible object");
		System.out.println("4. to create spotCar object");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Vehicle v = new Vehicle();
			System.out.println("Enter Number Of wheels: ");
			int wheels = sc.nextInt();
			v.setNoOfWheel(wheels);

			System.out.println("Enter Number Of Passengers: ");
			int passenger = sc.nextInt();
			v.setNoOfPassengers(passenger);

			System.out.println("Enter Model Number: ");
			int model = sc.nextInt();
			v.setModel(model);

			System.out.println("Enter Make: ");
			String make = sc.nextLine();
			v.setMake(make);
			v.display();
			break;
		case 2:
			Car c = new Car();
			System.out.println("Enter number of Doors: ");
			int doors = sc.nextInt();
			c.setNoOfDoor(doors);
			c.display();
			break;
		case 3:
			Convertible conv = new Convertible();

			System.out.println("Enter is car convertible or not: ");
			boolean head = sc.hasNext();
			conv.setHeadOpen(head);
			conv.display();
			break;

		case 4:
			SportCar scar = new SportCar();
			scar.display();
			break;

		default:
			System.out.println("Wrong choice...");
		}

		sc.close();
	}

}
