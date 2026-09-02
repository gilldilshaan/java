package ErrorHandling;
import java.util.Scanner;

public class q7 {
    public static void check(int arr[],int seat)throws Exception{
        try{
            System.out.println(arr[seat]);
        }catch(ArrayIndexOutOfBoundsException e){
            throw new Exception("o");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            int seat=sc.nextInt();
            try{
                check(arr,seat);
            }catch(Exception e){
                if(e.getMessage().equals("o"    )){
                    System.out.println("Seat not available");
                }
            }
        }

    }
}
