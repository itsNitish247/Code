package association.Example;

import java.util.Set;

public class Bank {
private String bankName;
private  Set<Employee> employees;


public Bank(String bankName) {
	super();
	this.bankName = bankName;
	
}

public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Set<Employee> getEmployees() {
	return employees;
}

public void setEmployees(Set<Employee> employees) {
	this.employees = employees;
}

}
