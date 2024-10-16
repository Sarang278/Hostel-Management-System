package com.hms;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Date;
import com.hms.ServiceImpl.*;
import com.hms.entity.*;
import com.hms.Service.*;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class AllOperations {
    
    private HostelServiceImpl hostelService = new HostelServiceImpl();
    private RoomServiceImpl roomService = new RoomServiceImpl();
    private StudentService studentService = new StudentServiceImpl();
    private BookingService bookingService = new BookingServiceImpl();
    private PaymentService paymentService = new PaymentServiceImpl();
    private ComplaintService complaintService = new ComplaintServiceImpl();
    private WardenService wardenService = new WardenServiceImpl();
  //  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public void addHostel(Scanner scanner) {
        System.out.print("Enter Hostel Name: ");
        String name = scanner.next();
        System.out.print("Enter Address: ");
        String address = scanner.next();
        Hostel hostel = new Hostel(name, address);
        hostelService.addHostel(hostel);
        System.out.println("Hostel added successfully.");
    }
    
    public void addRoom(Scanner scanner) {
        System.out.print("Enter Room Number: ");
        String roomNumber = scanner.next();
        System.out.print("Enter Room Capacity: ");
        int capacity = scanner.nextInt();
        System.out.print("Enter Hostel Id: ");
        Long hostelId = (long) scanner.nextInt();
        Hostel hostel = hostelService.getHostelById(hostelId);
        Room room = new Room(roomNumber,capacity, hostel);
        roomService.addRoom(room);
        System.out.println("Room added successfully.");
    }
    
    public void addStudent(Scanner scanner) {
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Email: ");
        String email = scanner.next();
        Student student = new Student(name, email);
        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }
    
    public void addBooking(Scanner scanner) {
    	  System.out.print("Enter Booking Date (yyyy-mm-dd): ");
          String dateStr = scanner.next();
        System.out.print("Enter Room Id: ");
        Long roomId =  scanner.nextLong();
        Room room = roomService.getRoomById(roomId);
        System.out.print("Enter Student Id: ");
        Long studentId =  scanner.nextLong();
        Student student = studentService.getStudentById(studentId);
      
     
        try {
        	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        	   formatter.setLenient(false);
            Date bookingDate = formatter.parse(dateStr);
            Booking booking = new Booking(student,room,bookingDate);
            bookingService.addBooking(booking);
            System.out.println("Booking added successfully.");
            
        } catch (ParseException e) {
            e.printStackTrace();
        }

     
  }
    
    public void addPayment(Scanner scanner) {
        System.out.print("Enter Payment Amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter Payment Date (yyyy-mm-dd): ");
        String dateStr = scanner.next();
        System.out.print("Enter Booking Id: ");
        Long bookingId = (long) scanner.nextInt();
        Booking booking = bookingService.getBookingById(bookingId);
 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date paymentDate = formatter.parse(dateStr);
        Payment payment = new Payment(amount,paymentDate,booking);
        paymentService.addPayment(payment);
        System.out.println("Payment added successfully.");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    
    }
    public void addComplaint(Scanner scanner) {
        System.out.print("Enter Student Id: ");
        
        // Validate if the input is a long
        if (!scanner.hasNextLong()) {
            System.out.println("Invalid input. Please enter a valid Student Id.");
            scanner.next(); // Clear the invalid input
            return;
        }
        
        Long studentId = scanner.nextLong();
        Student student = studentService.getStudentById(studentId);
        
        // Check if the student exists
        if (student == null) {
            System.out.println("No student found with Id: " + studentId);
            return;
        }
        
        // Clear the buffer before reading the description
        scanner.nextLine(); 
        
        System.out.print("Enter Complaint Description: ");
        String description = scanner.nextLine(); // Use nextLine() to capture full description

        // Create the complaint object
        Complaint complaint = new Complaint(description, student);
        
        // Add the complaint
        complaintService.addComplaint(complaint);
        System.out.println("Complaint added successfully.");
    }
    
    public void addWarden(Scanner scanner) {
        System.out.print("Enter Warden Name: ");
        String name = scanner.next();
        System.out.print("Enter Contact Number: ");
        String contact = scanner.next();
        System.out.print("Enter Hostel Id: ");
        Long hostelId = (long) scanner.nextInt();
        Hostel hostel = hostelService.getHostelById(hostelId);
        Warden warden = new Warden(name, contact,hostel);
        wardenService.addWarden(warden);
        System.out.println("Warden added successfully.");
    }

    public void listAllEntities() {
        System.out.println("All hostels: " + hostelService.listAllHostels());
        System.out.println("All rooms: " + roomService.listAllRooms());
        System.out.println("All students: " + studentService.listAllStudents());
        System.out.println("All bookings: " + bookingService.listAllBookings());
        System.out.println("All payments: " + paymentService.listAllPayments());
        System.out.println("All complaints: " + complaintService.listAllComplaints());
        System.out.println("All wardens: " + wardenService.listAllWardens());
    }
}
