
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.setEmployeeId(1001);
		e1.setEmployeeName("Krish");
		e1.setEmployeeSalary(50000.0);
		
		EmployeeServices es=new EmployeeServices();
		es.addEmployee(0, e1);
		 
		/*
		 * Employee[] employees=es. getAllEmployees();
		 * for(Employee employee:employees){
		 * System.out.println(employee.getEmployeeId());
		 * System.out.println(employee.getEmployeeName());
		 * System.out.println(employee.getEmployeSalaryd());
		 * System.out.println("-------");
		 * }
		 * 
		 */
		Employee employee=es.getEmployee(0);
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeSalary());
	}

}
