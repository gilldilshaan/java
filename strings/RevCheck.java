import java.util.Scanner;

public class RevCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder(n);
        StringBuilder reversed = new StringBuilder(sb).reverse();
        if(sb.toString().equals(reversed.toString())){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
