package com.hms;

import java.util.List;
import java.util.Scanner;

public class MainOperation {

	public void onRun() {
		Scanner scanner = new Scanner(System.in);
		AllOperations operations = new AllOperations();

		boolean running = true;

		while (running) {
			System.out.println("1. Add Hostel");
			System.out.println("2. Add Room");
			System.out.println("3. Add Student");
			System.out.println("4. Add Booking");
			System.out.println("5. Add Payment");
			System.out.println("6. Add Complaint");
			System.out.println("7. Add Warden");
			System.out.println("8. List All Entities");
			System.out.println("9. Exit");

			System.out.print("Choose operation:");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				operations.addHostel(scanner);
				break;
			case 2:
				operations.addRoom(scanner);
				break;
			case 3:
				operations.addStudent(scanner);
				break;
			case 4:
				operations.addBooking(scanner);
				break;
			case 5:
				operations.addPayment(scanner);
				break;
			case 6:
				operations.addComplaint(scanner);
				break;
			case 7:
				operations.addWarden(scanner);
				break;
			case 8:
				operations.listAllEntities();
				break;
			case 9:
				running = false;
				break;
			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}
