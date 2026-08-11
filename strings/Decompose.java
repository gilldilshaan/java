import java.util.*;
public class Decompose{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);

            if(i+1<n.length() && Character.isDigit(n.charAt(i+1))){
                int count=n.charAt(i+1)-'0';
                for(int j=0;j<count;j++){
                    sb.append(ch);
                }
                i++;
            }else{
                sb.append(ch);
            }
        }
         System.out.println(sb);
        sc.close();
    }
}