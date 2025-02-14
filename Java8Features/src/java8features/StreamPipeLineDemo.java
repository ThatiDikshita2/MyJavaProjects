package java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamPipeLineDemo {
public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000, 40000, 20000, 30000, 60000);
		System.out.println(salaries);
		
		/* 
		  1.Filter the salaries which are >=50000
		  2.Increment the filtered salaries by 10%  //50000+60000
	      3.Find the total of filtered and incremented salaries //1,11,000
		  Expected output: 121000
		 */
             
       /*
		List<Integer> filteredSalaries = salaries.stream()
                .filter(salary -> salary >= 50000)
                .collect(Collectors.toList());
        System.out.println("Filtered Salaries: " + filteredSalaries);
        
        List<Integer> incrementedSalaries = filteredSalaries.stream()
                .map(salary -> (int) (salary * 1.10)) 
                .collect(Collectors.toList());
        System.out.println("Incremented Salaries: " + incrementedSalaries);

        
        int totalSalary = incrementedSalaries.stream()
                .mapToInt(Integer::intValue)
                .sum();
            System.out.println("Total Salary: " + totalSalary);
            */
		
		double totalSalary= salaries.stream()        //source
				.filter((salary) -> salary >=50000) //Intermediate operation -1
				.map((salary) -> salary+ salary*.1) //Intermediate operation -2
				.mapToDouble(salary-> salary)       //Intermediate operation -3 
				.sum();                             //Terminal operation
		System.out.println(totalSalary);
		
		/* 
		  Task-2:
		  Filter the salaries which are <=50000
		  sort the filtered salaries in Descending order
	      Expected output:[50000,40000,30000,20000]
		 */
           
       List<Integer> incrementedsalaries=salaries.stream() //source	   
          .filter((salary) -> salary <=50000)              //Intermediate operation-1
          .sorted(Comparator.reverseOrder())               //Intermediate operation-2
          .toList();                                       //Terminal operation
       System.out.println(incrementedsalaries);
       
       /*
        Task-3:
        Input :[1,3,2,4,3,1,2]
        output:[4,3,2,1]
        */
        
       List<Integer> nums =Arrays.asList(1,3,2,4,3,1,2);
       
      List<Integer> uniqueNums= nums.stream()
               .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
                System.out.println(uniqueNums);
                 
       /*
         Task -4
         Input :JAVA
         Output:J A V A                  
        */
                String input = "JAVA";
                      
                String result= input.chars() 
                                .mapToObj(c -> (char) c) 
                                .map(String::valueOf) 
                                .collect(Collectors.joining(" ")); 
                        System.out.println(result);
                }
        
}
	
