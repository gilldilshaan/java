import java.util.Scanner;
public class weakBact {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder(n);

    Boolean found=false;
    for(int i=0;i<sb.length()-3;i++){
        if(sb.charAt(i)=='p' && sb.charAt(i+3)=='q'||sb.charAt(i)=='q' && sb.charAt(i+3)=='p'){
            found=true;
            break;
        }
    }
    if(found){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    sc.close();
}
}