package assignment2;
public class Student {
	
	private String studentName;
	private int studentID;
	private String department;
	private int maths;
	private int science;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public int getMaths() {
		return maths;
	}
	
	public void setMaths(int maths) {
		this.maths = maths;
	}
	
	public int getScience() {
		return science;
	}
	
	public void setScience(int science) {
		this.science = science;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
}