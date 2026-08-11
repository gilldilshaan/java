import java.util.*;

public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='a'){
                sb.append("A");
            }else if(ch=='e'){
                sb.append("E");
            }else if(ch=='i'){
                sb.append("I");
            }else if(ch=='o'){
                sb.append("O");
            }else if(ch=='u'){
                sb.append("U");
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
