package ErrorHandling;
import java.util.Scanner;
import java.util.*;

class Countnumber {
public int countNumber(int[] arr, int n) {
    int sum=0;
    int num=0;
    int count=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    try{
        for(int i=0;i<n;i++){
            num=sum-arr[i];
            if(num%arr[i]==0){
                count++;
            }
        }
    }catch(ArithmeticException e){
        System.out.print(e);
        return 1;
    }
    return count;
}
}

public class ques3 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
    }
    Countnumber obj = new Countnumber();
    int result = obj.countNumber(arr, n);
if (result != -1) {
System.out.println(result);
}
}
sc.close();
}
}

