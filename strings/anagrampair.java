import java.util.Scanner;

public class anagrampair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String ne=sc.nextLine();
        StringBuilder sb=new StringBuilder(ne);
        if(n.length()!=ne.length()){
            System.out.print("NO");
        }

        for (int i=0;i<n.length();i++){
            char ch=n.charAt(i);

            int index=sb.indexOf(String.valueOf(ch));

            if(index==-1){
                System.out.print("No");
                return;
            }
            sb.deleteCharAt(index);
        }
        if(sb.length()==0){
            System.out.print("yes");
        }else{
            System.out.print("No");
        }
        sc.close();
        }
}
