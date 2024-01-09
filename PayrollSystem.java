//employee class
class Employee{
    String name;
    double salary;
//constructor 
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Employee: "+name+"\nSalary: "+salary);
        System.out.println();
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee employee1=new Employee("Guruprasad",25000);
        Employee employee2=new Employee("Raghu",50000);

        //display details
        employee1.displayDetails();
        employee2.displayDetails();
    }
}
