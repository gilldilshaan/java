package ArrayList;
import java.util.*;
import java.util.LinkedList;

public class ques7 {
    public static LinkedList<Integer> findRisingTemperatures(LinkedList<Integer>
temperatures){
        LinkedList<Integer>rise=new LinkedList<>();
        for(int i=1;i<temperatures.size();i++){
            if(temperatures.get(i)>temperatures.get(i-1)){
                rise.add(temperatures.get(i));
            }
        }

    return rise;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer>temperature=new LinkedList<>();
        for(int i=0;i<n;i++){
            temperature.add(sc.nextInt());
        }
        LinkedList<Integer>result=findRisingTemperatures(temperature);
        System.out.print(result);

    }
}
