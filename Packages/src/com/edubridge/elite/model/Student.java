package com.edubridge.elite.model;

public class Student {
     private int studentId;
     private String studentName;
     private long studentMobile;
     private String studentEmail;
       
     //Generate superclass
	public Student() {
		super();
	}
	
    // setter and getter
	public Student(int studentId, String studentName, long studentMobile, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentEmail = studentEmail;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	// tostring
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", studentEmail=" + studentEmail + ", getStudentId()=" + getStudentId() + ", getStudentName()="
				+ getStudentName() + ", getStudentMobile()=" + getStudentMobile() + ", getStudentEmail()="
				+ getStudentEmail() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}   
}
 