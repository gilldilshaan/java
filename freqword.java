import java.util.Scanner;

public class freqword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        String [] words=n.split(" ");
        int Maxcount=0;
        int count=0;
        for(int i=0;i<words.length;i++){
            count=0;
            for(int j=0;j<words.length;j++){
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count>Maxcount){
                Maxcount=count;
                sb.setLength(0);
                sb.append(words[i]);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
