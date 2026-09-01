package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ques5 {
    public static ArrayList<Integer> findOverheatingMachines(ArrayList<Integer>
temperatures){
    ArrayList<Integer>temp=new ArrayList<>();

    for(int i=0;i<temperatures.size();i++){
        if(temperatures.get(i)>90){
            temp.add(temperatures.get(i));
        }
    }

    return temp;
}
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>temperature=new ArrayList<>();
        for(int i=0;i<n;i++){
            temperature.add(sc.nextInt());
        }
        ArrayList<Integer>result= findOverheatingMachines(temperature);
        System.out.println(result);
    }
}
