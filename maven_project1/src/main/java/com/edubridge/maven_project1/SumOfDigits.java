package com.edubridge.maven_project1;

public class SumOfDigits {
	 public void findSumOfDigits(int n) {
	 int n1=2345;
	 int rem = 0;
	 int sum = 0;
      while(n1 > 0){
   	   rem = n1%10;
   	   sum = sum+rem;
   	   n1 =n1/10;
      }
}
}
