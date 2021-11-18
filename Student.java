package org.college;

public class Student extends Department {

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("studentName");
	}

	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("studentDept");
	}

	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("studentId");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();

		st.deptName();

		st.studentId();
		st.studentName();
		st.studentDept();
	}

}
