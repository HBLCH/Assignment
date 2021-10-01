package assignments;

public class Employee {
String firstName;
String lastName;
double monthlySalary;
public Employee(String firstName, String lastName, double monthlySalary) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.monthlySalary=monthlySalary;
	
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getMonthlySalary() {
	if (monthlySalary<0) {
		return 0;
	}
	return monthlySalary;
}
public void setMonthlySalary(double monthlySalary) {
	if (monthlySalary<0) {
	}
    this.monthlySalary=monthlySalary;
}

public static void main(String[] args) {
	Employee emp1=new Employee("HB","beh",-1.0);
	Employee emp2=new Employee("HB","BH",3000.0);

	System.out.println("Employee 1 yearly salary: "+ emp1.getMonthlySalary()*12 );
	System.out.println("Employee 2 yearly salary: "+ emp2.getMonthlySalary()*12 );
	System.out.println("Employee 1 yearly salary + 10%yearly bonus : "+ emp1.getMonthlySalary()*12*1.10 );
	System.out.println("Employee 1 yearly salary 10%yearly bonus : "+ emp2.getMonthlySalary()*12*1.10 );
	
}
}
