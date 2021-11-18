package method.overloading;

public class Students {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("Employee ID is"+id);
	} 
	
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("Employee id and Name"+id+" "+name);
	}
	
	public void getStudentInfo(String email, String phonenumber) {
		System.out.println("Email and Phonenumber"+email+" "+phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st=new Students();
		st.getStudentInfo(100);
		st.getStudentInfo( 100, "Somasundaram");
		st.getStudentInfo(" somasundaram020@gmail.com", "8489176661");
	}

}
