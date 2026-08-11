import java.util.Scanner;

public class ques7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int minutes=sc.nextInt();
        int seconds=sc.nextInt();

        Time t1=new Time(hours, minutes, seconds);
        int secondsToAdd = sc.nextInt();
        t1.addSeconds(secondsToAdd);
        System.out.println(t1);

    }
}
class Time{
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours,int minutes,int seceonds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seceonds;
    }
    public void addSeconds(int secondsToAdd){
        seconds+=secondsToAdd;

        minutes+=seconds/60;
        seconds=seconds%60;

        hours+=minutes/60;
        minutes=minutes%60;

        hours=hours%24;

    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
}
