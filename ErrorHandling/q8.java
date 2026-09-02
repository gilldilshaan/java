package ErrorHandling;

import java.util.Scanner;

public class q8 {
    public static void check(int bal,int withdraw)throws Exception{
        if(withdraw<=bal){
            System.out.println(bal-withdraw);
        }else{
            throw new Exception("b");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int withdraw=sc.nextInt();
        try{
            check(bal,withdraw);
        }catch(Exception e){
            if(e.getMessage().equals("b")){
                System.out.print("Insufficient balance");
            }

        }
    }
}
