package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ques8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(Arrays.equals(arr, arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        t--;
    }
    }
}
