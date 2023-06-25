import java.util.*;
import java.io.*;

class Employee{
    
    private String name;
    private int employeeId;
    private double salary;

    //  Default constructor
    Employee(){
        name="ABCD";
        employeeId=1;
        salary=30000.0;
    }

    // Parametrized constructor
    Employee(String n,int id,double s){
        name=n;
        employeeId=id;
        salary=s;
    }

    public String getName(){
        return name;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public double getSalary(){
        return salary;
    }
}

class Company{
    public static void main(String[] args) {
        
        Employee employee1=new Employee();
        Employee employee2=new Employee("Ravi", 122, 50000);
        Employee employee3=new Employee("Ramesh", 100, 45000);

        System.out.println("\nEmployee Details:\n");

        // Default constructor values

        System.out.println("Name:"+employee1.getName()+"\n"+"Employee Id:"+employee1.getEmployeeId()+"\n"+"Salary:"+employee1.getSalary()+"\n");

        // Parametrized constructor values

        System.out.println("Name:"+employee2.getName()+"\n"+"Employee Id:"+employee2.getEmployeeId()+"\n"+"Salary:"+employee2.getSalary()+"\n");

        System.out.println("Name:"+employee3.getName()+"\n"+"Employee Id:"+employee3.getEmployeeId()+"\n"+"Salary:"+employee3.getSalary()+"\n");

    }
}