
public class oops{
    public static void main(String[] args){
    //     String a="woH erA uoY";
    //     String [] words=a.split(" ");
    //     for(int i=0;i<words.length;i++){
    //         String word=words[i];
            
    //         for(int j=word.length()-1;j>=0;j--){
    //             System.out.print(word.charAt(j));
    //         }
    //         System.out.print(" ");
    //     }
    // }
        String a="pabq";
        int b=a.indexOf('p');
        int c=a.indexOf("q");

        if(b-c==3||c-b==3){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }


    }
}