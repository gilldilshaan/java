import java.util.Scanner;

public class rotaion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String ne=sc.nextLine();
        StringBuilder sb=new StringBuilder(n);
        if(n.length()!=ne.length()){
            System.out.print("NO");
            return;
        }
        sb.append(n);

        if(sb.toString().contains(ne)){
            System.out.print("yes");
        }else{
            System.out.print("NO");
        }
         
        sc.close();
    }
}
