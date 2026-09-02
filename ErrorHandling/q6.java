package ErrorHandling;
import java.util.Scanner;


public class q6 {
    public static void check(String n)throws Exception{
        char ch=n.charAt(0);
        if(ch!='E'||n.length()!=5){
            throw new Exception("e");
        }
        for(int i=1;i<n.length();i++){
            char c=n.charAt(i);
            if(c<'0'||c>'9'){
                throw new Exception("n");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        try{
            check(n);
        }catch(Exception e){
            if(e.getMessage().equals("e")){
                System.out.print("Invalid format");
            }else if(e.getMessage().equals("n")){
                System.out.print("Invalid number");
            }

        }
    }
}
