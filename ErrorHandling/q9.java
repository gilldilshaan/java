package ErrorHandling;

import java.util.Scanner;

public class q9 {
    public static void check(int n)throws Exception{
        if(n>=18){
            System.out.print("Eligible to vote");
        }else{
            throw new Exception("n");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            check(n);
        }catch(Exception e){
            if(e.getMessage().equals("n")){
                System.out.print("Not eligible to vote");
            }
        }
    }
}
