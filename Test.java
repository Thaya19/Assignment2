package assignment2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StudentUI view = new StudentUI();
		
		System.out.print("1. Input Marks \n2. Check Student's Mark \nSelect: ");
		int option = input.nextInt();
		
		view.displayMenu(option);
	}
}
