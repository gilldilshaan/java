import java.util.Scanner;
class calculator{
    public double divide(double a,double b){
        return a/b;
    }
    public double calculatePercentage(double marks,double total){
        if(total==0){
            throw new ArithmeticException("Cannot calculate percentage because total marks cannot be zero.");
        }
        return divide(marks, total)*100;
    }
    public double calculate(double marks,double total){
        return calculatePercentage(marks, total);
    }
}
public class q6mid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double marks=sc.nextDouble();
        double total=sc.nextDouble();

        calculator c=new calculator();
        try{
            double percentage=c.calculate(marks, total);
            System.out.println("Percentage:"+percentage);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
