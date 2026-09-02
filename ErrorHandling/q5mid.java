package ErrorHandling;
import java.util.Scanner;


class InvalidLoginException extends Exception{
    public InvalidLoginException(String message){
        super(message);
    }
}

public class q5mid {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        boolean login=false;

        try{

            for(int i=0;i<3;i++){

                try{

                    String n=sc.next();
                    String pass=sc.next();

                    if(n.equals("admin") && pass.equals("java123")){
                        System.out.println("Login Successful");
                        login=true;
                        break;
                    }
                    else{
                        throw new InvalidLoginException(
                            "Invalid username or password."
                        );
                    }

                }
                catch(InvalidLoginException e){
                    System.out.println(e.getMessage());
                }
            }

            if(!login){
                System.out.println("Account locked.");
            }

        }
        finally{
            System.out.println("Login process ended.");
        }
    }
}