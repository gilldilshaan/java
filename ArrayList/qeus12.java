package ArrayList;
import java.util.*;

public class qeus12 {
    public static ArrayList<Integer>
findHighConsumptionDevices(ArrayList<Integer> arr){
    ArrayList<Integer>res=new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>75){
            res.add(arr.get(i));
        }
    }
    return res;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();    
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer>res=findHighConsumptionDevices(arr);
        System.out.println(res);
    }
}
