import java.util.Scanner;

public class maskvowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sb.append("*");
            }else{
                sb.append(ch);
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
