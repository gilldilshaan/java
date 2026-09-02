import java.util.Scanner;

class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}
public class q2mid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            int total=0;
            for(int i=0;i<5;i++){
                int n=sc.nextInt();
                if(n<0||n>100){
                    throw new InvalidMarksException("Invalid Marks");
                }else{
                    total+=n;
                }
            }
            System.out.println(total);
            int percentage=total/5;
            if(percentage>=80){
                
            }
        }catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        }
    }
}
