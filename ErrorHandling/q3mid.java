import java.util.Scanner;



class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String message){
        super(message);
    }
}
class InvalidWorkingDayException extends Exception{
    public InvalidWorkingDayException(String message){
        super(message);
    }
}
public class q3mid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        try{
            int n=sc.nextInt();
            if(n<=0){
                throw new InvalidSalaryException("Enter Coreeeect Salary");
            }
            int days=sc.nextInt();
            if(days<0||days>31){
                throw new InvalidWorkingDayException("Invalid amount of days");
            }
            int totalsal=0;
            if(days>=26){
                totalsal=n+((n*10)/100);
            }else if(days>=20){
                totalsal=n+((n*5)/100);
            }else {
                totalsal=n;
            }
            System.out.println(totalsal);
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }catch(InvalidWorkingDayException e){
            System.out.println(e.getMessage());
        }
    }
}
