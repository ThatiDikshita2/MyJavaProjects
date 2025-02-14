package collections;

import java.util.HashSet;
//Insertion order won't be maintained.
//HashCodeElements are added based on hashcode of the  object
//Duplicates are not allowed.

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
          hs.add(100);
          hs.add(300);
          hs.add(500);
          hs.add(200);
          hs.add(400);
          
          System.out.println(hs);
          
          hs.add(100);
          hs.add(200);
          System.out.println(hs);
          
          System.out.println(hs);
	}

}
