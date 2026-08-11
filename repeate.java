import java.util.*;
public class repeate {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0||ch!=s.charAt(i-1)){
                sb.append(ch);
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
