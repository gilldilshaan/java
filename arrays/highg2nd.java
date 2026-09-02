import java.util.Scanner;

public class highg2nd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max==arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
