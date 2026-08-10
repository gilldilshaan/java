import java.util.Scanner;

public class diffpattern{

    public static int sum(int a,int b,char c){
        if(c=='+'){
            return (a+b);
        }else if(c=='-'){
            return(a-b);
        }else if(c=='*'){
            return(a*b);
        }
        return 0;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    char c=sc.next().charAt(0);


    System.out.println(sum(a,b,c));
}
    }
