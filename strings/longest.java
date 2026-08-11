import java.util.Scanner;

public class longest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String [] word=n.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length;i++){
            if(word[i].length()>sb.length()){
                sb.setLength(0);
                sb.append(word[i]);
            }
        }
    System.out.println(sb);
    sc.close();
    }
}
