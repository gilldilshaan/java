import java.util.Scanner;

public class ques5 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int [] words=new int[5];
        String s=sc.nextLine();
        for(int i=0;i<words.length;i++){
            words[i]=sc.nextInt();
        }
        Movie m1=new Movie(s, words);
        System.out.println(m1.averageRatings());
        System.out.println(m1.getBadge());
    }
}

class Movie{
    private String title;
    private int[] ratings;
    public Movie(String title,int []ratings){
        this.title=title;
        this.ratings=ratings;
    }
    public double averageRatings(){
        int sum=0;
        for(int i=0;i<ratings.length;i++){
            sum+=ratings[i];
        }
        return sum/5.0;
    }
    public String getBadge(){
        if(averageRatings()>=8.5){
            return "Blockbuster";
        }else if(averageRatings()>=6.0){
            return "Hit";
        }else if(averageRatings()>=4.0){
            return "Average";
        }else{
            return "Flop";
        }
    }

}