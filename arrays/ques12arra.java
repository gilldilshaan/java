import java.util.Scanner;

public class ques12arra {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int expsum=0;
        for(int i=1;i<=n;i++){
            expsum+=i;
        }
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int val=expsum-sum;
        System.out.println(val);
    }
}
