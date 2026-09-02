import java.util.Scanner;


class InvalidPinException extends Exception{
    public InvalidPinException(String message){
        super(message);
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class InvalidAmountException extends Exception{
    public InvalidAmountException(String message){
        super(message);
    }
}
public class q1mid{
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rightpin=1234;
        int bal=sc.nextInt();
        int with=sc.nextInt();
        int pin=sc.nextInt();
        try{
            if(rightpin!=pin){
                throw new InvalidPinExeception("Invalid pin");
            }
            if(with>bal){
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            if(with<=0){
                throw new InvalidAmountException("Invalid amount");
            }

            bal=bal-with;
            System.out.println("With Syccess");
            System.out.println(bal);
            
        }catch(InvalidPinExeception e){
            System.out.println(e.getMessage());
        }catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Thankyou for using atm");
        }
        
    }
}