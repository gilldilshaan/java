import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int vowels=0;
        int cons=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }else{
                 cons++;
            }
        }
        sb.append("Vowels:");
        sb.append(vowels);
        sb.append(",Constraints:");
        sb.append(cons);
        System.out.print(sb);
        sc.close();
    }
}
