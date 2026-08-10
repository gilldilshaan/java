public class ReverseWordsStringBuilder {
    public static void main(String[] args) {
        String sb = "woH erA uoy";

        String[] words = sb.split(" ");
        
        StringBuilder reversed = new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            reversed.append(word.reverse().toString());
            if(i<words.length-1){
                reversed.append(" ");
            }
        }
        System.out.println(reversed);
    }
}
