package student;

public class Students {

	public void getStudentInfo(int id)
	{
		
	System.out.println("Student ID :" +id);
	System.out.println("===========================");
		
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID :" +id +" "+"Student Name :" +name);
		System.out.println("====================================");
	}
	public void getStudentInfo(String email,long phoneNum)
	{
		System.out.println("Student email :" +email +"    "+"Student PhoneNumber :" +phoneNum);
	}
	
	
	
	public static void main(String[] args) {
		

		Students stud=new Students();
		stud.getStudentInfo(1001);
		stud.getStudentInfo(1002, "Raji");
		stud.getStudentInfo("raj1234@gmail.com", 786432589998l);
		
		
	}

}
