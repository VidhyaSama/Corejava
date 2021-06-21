package training;
 interface School
 {
	 String schoolName="Smart School";
	 void getStudentDetails();
	void getAttendance();
	 interface background
	 {
		 String principal="yyyy";
		 void getSchoolDetails();
	 }
	 
 }
 
abstract class Student implements School,School.background
{
	String studentName;
	int studentId;
	
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	@Override
	public void getStudentDetails() {
		System.out.println("Name:"+this.studentName+"\nstudentId:"+this.studentId+"\nschoolname:"+ schoolName );
		System.out.println("Principal name:"+School.background.principal);
	}
	@Override
	public void getSchoolDetails()
	{
		System.out.println("Best School");
	}
}

public class InterfaceExample extends Student {
	float attendance;
	
	public InterfaceExample(String studentName, int studentId) {
		super(studentName, studentId);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample student=new InterfaceExample("vidhya",12);
		student.getStudentDetails();
		student.getAttendance();
		

	}

	@Override
	public void getAttendance() {
		attendance=75.5f;
		System.out.println("attendance"+ attendance );
		
	}
	
	

}

/*
1)By defaults fields in interface are public static final we cann't use other modifiers
and can't change the value of field as this is final.
2)interface only allow abstract methods but not concrete methods.
3)we can't create object for interface as it contains abstract methods and field but we can
make reference of it that refers to the object of its implemented class. 
4)Constructor is for initializing non static members as interface is not having non-static members 
so we don't use constructor in interface
5)we can't create private members only public is allowed.


*/