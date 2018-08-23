package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses= "";
	private int tuitionbalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//constructor: prompt user to enter sudent's name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2- for sophomore\n3- Junior\n4 Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		setStudentID();

		System.out.println(firstName+ " "+ lastName+" "+gradeYear+ ""+ studentID);
		
		
	}
	
	
	// Generate an id 
	
	private void setStudentID() {
		//grade level  + ID
		id++;
		this.studentID =  gradeYear + ""+id;
	}
	
	//enroll in courses
		public void enroll() {
			//get inside a loop, user hits 0
			
			do {
				System.out.println("Enter course to enroll (0 to quit): ");
				Scanner in=new Scanner(System.in);
				String course = in.nextLine();
				if(!course.equals("Q")) {
					courses = courses + "\n" +course;
					tuitionbalance = tuitionbalance + costOfCourse;
				}
				else {
					break;
					}
			} while (1 !=0);
			System.out.println("Enrolled in: "+ courses);
			
		}
	 
	
	//view balance
		public void viewBalance() {
			System.out.println("Your Balance is: $"+ tuitionbalance);
		}
		
		
	
	//pay tuition
		
		public void payTuition() {
			viewBalance();
			System.out.println("Enter your payment: ");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionbalance = tuitionbalance - payment;
			System.out.println("Thank you for your payment ");
			viewBalance();
		}
	
	//show status
		public String toString() {
			return "Name: " + firstName+ " "+ lastName+
					"\nCourses Enrolled: "+ courses+
					"\nBalance: $"+tuitionbalance; 
		}
	
}
