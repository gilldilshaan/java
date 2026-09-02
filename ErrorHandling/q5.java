package ErrorHandling;

import java.util.Scanner;

public class q5 {
    public static void check(String n)throws Exception{
       if(n.length()!=10){
        throw new Exception("l");
       }
       if(n.charAt(0)=='0'){
        throw new Exception("z");
       }
        System.out.print("Valid number");
       }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        try{
            check(n);
        }catch(Exception e){
            if(e.getMessage().equals("l")){
                System.out.print("Number is too short");
            }else if(e.getMessage().equals("z")){
                System.out.print("Number starts with zero");
            }
        }

    }
}

