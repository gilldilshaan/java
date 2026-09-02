package ErrorHandling;

import java.util.Scanner;

public class q4 {
    public static void stringval(String str)throws Exception{
        if(str.length()<5){
            throw new Exception("s");
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                throw new Exception("w");
            }
        }
        System.out.println("Valid string");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        try{
            stringval(str);
        }catch(Exception e){
            if(e.getMessage().equals("s")){
                System.out.print("Username is too short");
            }else if(e.getMessage().equals("w")){
                System.out.print("Username contains whitespace");
            }
        }

    }

}
