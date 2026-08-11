import java.util.Scanner;

public class ques9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int all=sc.nextInt();
        int days=sc.nextInt();

        LibraryBook l1=new LibraryBook(n, all, days);

        System.out.println(n);
        System.out.println(l1.lateDays());
        System.out.println(l1.calculatorFine());
        
    }
}
class LibraryBook{
    private String bookTitle;
    private int allowedDays;
    private int daysTakes;
    public LibraryBook(String bookTitle ,int allowedDays,int daysTakes){
        this.bookTitle=bookTitle;
        this.allowedDays=allowedDays;
        this.daysTakes=daysTakes;
    }
public int lateDays() {
    if (daysTakes > allowedDays) {
        return daysTakes - allowedDays;
    } else {
        return 0;
    }
}
    public double calculatorFine(){
        return lateDays()*5.0;
    }
}
