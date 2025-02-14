package collections;

	import java.util.LinkedList;

	public class LinkedListDemo {

		public static void main(String[] args) {
			LinkedList al = new LinkedList();
			al.add(100);
			al.add(200);
			al.add("Java");
			al.add("Python");
			al.add(3500);
			al.add(5500);
			System.out.println(al);
			Object obj= al.get(0);
			int x=(int) obj;
			System.out.println(x);
			
			//Generic version LinkedList-Type safety & Avoids type casting
	        LinkedList<Integer> subjectMarks = new LinkedList<>();
	        subjectMarks.add(44);
	        subjectMarks.add(55);
	        subjectMarks.add(66);
	        subjectMarks.add(77);
	        subjectMarks.add(88);
	        subjectMarks.add(99);
	        //subjectMarks.add("Java");
	       System.out.println(subjectMarks);
	       
	       int s1= subjectMarks.get(0);
	       System.out.println(s1);
		


	//create an Linked list with a group of course names
	//java,python,angular,reactjs.js
	LinkedList courseNames = new LinkedList();
	courseNames.add("Java");
	courseNames.add("Python");
	courseNames.add("Angular");
	courseNames.add("ReactJS");
	courseNames.add("JS");
	   
	System.out.println(courseNames);
	}
	}


