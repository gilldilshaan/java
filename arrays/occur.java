import java.util.Scanner;
public class occur {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                System.out.println(i);
                flag=true;
                break;
            }
        }if (flag=false){System.out.println(-1);}
    }
}
