import java.util.Scanner;

public class ReverseWordsStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String[] words = s.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            reversed.append(word.reverse().toString());
            // if(i<words.length-1){
                reversed.append(" ");
            // }
        }
        System.out.println(reversed);
    }
}
