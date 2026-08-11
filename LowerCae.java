import java.util.Scanner;

public class LowerCae {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='A'){
                sb.append("A");
            }else if(ch=='E'){
                sb.append("E");
            }else if(ch=='I'){
                sb.append("I");
            }else if(ch=='O'){
                sb.append("O");
            }else if(ch=='U'){
                sb.append("U");
            }else{
                 sb.append((char)(ch + 32));
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
