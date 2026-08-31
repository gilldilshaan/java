package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ques2 {
    public static ArrayList<Integer> updateBookings(ArrayList<Integer> bookings,
    int[] cancelled, int[] newBookings){
        for(int i=0;i<cancelled.length;i++){
            if(bookings.contains(Integer.valueOf(cancelled[i]))){
                bookings.remove(Integer.valueOf(cancelled[i]));
            }
        }
        for(int i=0;i<newBookings.length;i++){
            if(!bookings.contains(newBookings[i])){
                bookings.add(newBookings[i]);
            }
        }
        return bookings;
    }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> bookings=new ArrayList<>();
    for(int i=0;i<n;i++){
        bookings.add(sc.nextInt());
    }
    int c=sc.nextInt();
    int []cancelled=new int[c];
    for(int i=0;i<c;i++){
        cancelled[i]=sc.nextInt();
    }
    int m=sc.nextInt();
    int []newBookings=new int[m];
    for(int i=0;i<m;i++){
        newBookings[i]=sc.nextInt();
    }

    ArrayList<Integer> result=updateBookings(bookings, cancelled ,newBookings);
    System.out.println(result);

}

}
