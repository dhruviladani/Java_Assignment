import java.io.*;
 
class Company {
 
    private String name;
    Company(String name) {
 
        this.name = name;
    }
    public String getCompanyName() {
        return this.name;
    }
}
 
class Employee {
   
    private String name;
    Employee(String name) {
       
        this.name = name;
    }
 
   
    public String getEmployeeName() {
       
        return this.name;
    }
}
 
class P_12 {
 
    public static void main(String[] args) {

        Company c = new Company("XYZ");
        Employee emp = new Employee("ABC");
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + c.getCompanyName());
    }
}
