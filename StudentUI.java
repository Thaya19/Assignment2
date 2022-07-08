package assignment2;
import java.sql.SQLException;
import java.util.Scanner;
public class StudentUI {
	
	public void displayMenu(int option) {
		
		Student student = new Student();
		StudentController controller = new StudentController(student,this);
		Scanner input = new Scanner(System.in);
		
		if(option == 1) {
			try {
				
			System.out.println("\nInsert Student Record");
			System.out.print("Student ID: ");
			int studentID = input.nextInt();
			
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Department: ");
			String department = input.next();
			
			System.out.print("Maths mark: ");
			int maths = input.nextInt();
			
			System.out.print("Science mark: ");
			int science = input.nextInt();
			
			controller.inputMarks(studentID, name, department, maths, science);
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else if (option == 2){

		System.out.print("\nEnter Student ID: ");
		int studentID = input.nextInt();
		
		try {
			controller.getStudent(studentID);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	}

	public void displayStudentMarks(int studentID, String name, String department, int maths, int science){
        System.out.println("\nStudent Marks");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Math: " + maths);
        System.out.println("Science: " + science);
     }	
}