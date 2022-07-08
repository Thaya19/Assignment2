package assignment2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*; 
public class StudentController {
	 
	 private Student model;
     private StudentUI view;
     
     public StudentController(Student model, StudentUI view){
         this.model = model;
         this.view = view;
      }
     
     public void getStudent(int id) throws SQLException{
    	 
    	 Student student = new Student();
    	
    	 String URL = "jdbc:mysql://127.0.0.1:3306/SSE4350?serverTimezone = UTC";
	     String username = "root";
	     String password = "";
		 Connection conn = DriverManager.getConnection(URL, username, password);
		 
 		String sql = "SELECT * FROM STUDENT where studentID ='" + id +"'";
 		
 		Statement stmt = conn.createStatement();
 		ResultSet result = stmt.executeQuery(sql);
 		
 		if (result.next()) {
 			student.setStudentID(result.getInt("studentId"));
 			student.setStudentName(result.getString("studentName"));
 			student.setDepartment(result.getString("department"));
 			student.setMaths(result.getInt("maths"));
 			student.setScience(result.getInt("science"));
 				
 	 } 
    	 view.displayStudentMarks(student.getStudentID(), student.getStudentName(), student.getDepartment(), student.getMaths(), student.getScience());
     }
     
     public void inputMarks(int studentID, String name, String department, int maths, int science) throws SQLException {
 		
    	 Student student = new Student();
    	 String URL = "jdbc:mysql://127.0.0.1:3306/SSE4350?serverTimezone = UTC";
	     String username = "root";
	     String password = "";
		 Connection conn = DriverManager.getConnection(URL, username, password);
		 Statement stmt = conn.createStatement();
 			
 		 stmt.executeUpdate("INSERT INTO STUDENT VALUES (" + studentID + ", '"+ name + "', '" + department + "', " + maths + ", " + science + ")");
 		
 		 System.out.println("Record inserted");
 	}
}
