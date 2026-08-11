import java.util.Scanner;

public class ques4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int year=sc.nextInt();
        double sal=sc.nextDouble();

        Employee e1=new Employee(s, year, sal);
        e1.printValues();
        System.out.println(e1.bonusCategory());
        System.out.println(e1.calculateBonus());

    }
}

class Employee{
    private String empName;
    private int yearsOfService;
    private double baseSalary;

    public Employee(String empName,int yearOfService,double baseSalary){
        this.empName=empName;
        this.yearsOfService=yearOfService;
        this.baseSalary=baseSalary;
    }
    public void printValues(){
        System.out.println(empName);
        System.out.println(yearsOfService);
        System.out.println(baseSalary);
    }
    public String bonusCategory(){
        if(yearsOfService>15){
            return "Platinum";
        }else if(yearsOfService>=10){
            return "Gold";
        }else if(yearsOfService>=5){
            return "Silver";
        }else{
            return"Bronze";
        }
    }
    public double calculateBonus(){
        if(yearsOfService>15){
            return (baseSalary*0.2);
        }else if(yearsOfService>=10){
            return (baseSalary*0.15) ;
        }else if(yearsOfService>=5){
            return (baseSalary*0.1);
        }else{
            return (baseSalary*0.05);
        }
    }

    
}
