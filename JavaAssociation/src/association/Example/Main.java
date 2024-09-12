package association.Example;

import java.util.HashSet;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Employee emp1= new Employee("Nitish");
	Employee emp2=new Employee("Kumar");
	
	Set<Employee> employees = new HashSet<Employee>();
	employees.add(emp2);
	
		
	Bank bank= new Bank("ICIC");
	bank.setEmployees(employees);
	
	
	for(Employee emp:bank.getEmployees()) {
		System.out.println(emp.getEmployee() + "belongs to bank" + bank.getBankName());
	}

	
}
}
