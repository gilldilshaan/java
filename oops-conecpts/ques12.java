import java.util.Scanner;

public class ques12 {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    double tax=sc.nextDouble();
    int n=sc.nextInt();
    Employee.setTaxRate(tax);
    for(int i=0;i<n;i++){
        int id = sc.nextInt();
        String name = sc.next();
        double sal = sc.nextDouble();

        Employee e=new Employee(name, id, sal);
        e.calculateNetSalery();
        e.display();
    }
    System.out.printf("Tax Rate Applied : %.1f%%%n",Employee.taxRate);
    }
}
class Employee{
    int EmployeeId;
    String EmployeeName;
    double BasicSalary;
    double netSalary;

    static double taxRate;
    Employee(String EmployeeName,int EmployeeId,double BasicSalary){
        this.EmployeeName=EmployeeName;
        this.EmployeeId=EmployeeId;
        this.BasicSalary=BasicSalary;
    }
    static void setTaxRate(double taxRate){
        Employee.taxRate=taxRate;
    }
    void calculateNetSalery(){
        netSalary=BasicSalary-(BasicSalary*taxRate/100);
        
    }
    void display(){
        System.out.println("Employee Id : " + EmployeeId);
        System.out.println("Employee Name : " + EmployeeName);
        System.out.printf("Net Salary : %.2f%n", netSalary);
    }
}
