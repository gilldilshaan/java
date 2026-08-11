import java.util.Scanner;
import java.util.*;

// // public class meathods {

// //     public static boolean Check(int a){
// //         if(a%2==0){
// //             return true;
// //         }else{
// //             return false;
// //         }
// //     }
// //     public static  void main(String[] args){
// //     Scanner sc= new Scanner(System.in);
// //     int a=sc.nextInt();
// //     if(Check(a)){
// //         System.out.print("Even");
// //     }else{
// //         System.out.print("Odd");
// //     }

// //     }
// // }
// public class meathods {

//     public static int check(int a,int b,int c){
//         if(a>=b&&a>=c){
//             return a;
//         }else if(b>=a&&b>=c){
//             return b;
//         }else{
//             return c;
//         }
//     }
//  public static void main(String[] args){
//     Scanner sc= new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int c=sc.nextInt();
//     System.out.print("Biggest Number:"+check(a,b,c));
//  }
// }

// public class meathods {
//     public static boolean leap(int a){
//         if(a%400==0){
//             return true;
//         }else if(a%100==0){
//             return false;
//         }else if(a%4==0){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int a=sc.nextInt();
//         if (leap(a)) {
//     System.out.println("Leap Year");
// } else {
//     System.out.println("Not Leap Year");
// }
//     }
// }

// public class meathods {

//     public static int elecBill(int a){
//         int bill=0;
//         if(a<=100){
//             bill=(a*5);
//         }else if(a<=200){
//             bill=((a-100)*7)+500;
//         }else{
//             bill=1200+((a-200)*10);
//         }
//         return bill;
//     }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.print(elecBill(a));
//     }
// }

// public class meathods {


//     public static int rev(int a){
//         int rev=0;
//         int digit=0;
//         while(a!=0){
//         digit=a%10;
//         rev=rev*10+digit;
//         a=a/10;
//         }
//         return rev;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         System.out.print(rev(a));
//     }
// }
public class meathods {
     public static int armstromg (int a){
        int digit=0;
        int origional=a;
        int sum=0;
        int count=0;
        while(a!=0){
            count++;
          a=a/10;            
        }
        a=origional;
        while(a!=0){
            digit=a%10;
            sum+=(int)Math.pow(digit,count);
            a=a/10;
        }
        return sum;
     }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if( armstromg(a)==a){
        System.out.print("Armstrong");
    }else{
        System.out.print("Not Armstrong");
    }
    }
}
