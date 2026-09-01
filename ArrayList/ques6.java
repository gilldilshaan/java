package ArrayList;
import java.util.*;

public class ques6 {

    public static LinkedList<Integer> findRepeatedSongs(LinkedList<Integer>
playHistory){
    LinkedList<Integer>duplicates=new LinkedList<>();
    for(int i=0;i<playHistory.size();i++){
        int count =0;
        for(int j=0;j<playHistory.size();j++){
            if(playHistory.get(i).equals(playHistory.get(j))){
                count++;
            }
        }
        if(count>1&& !duplicates.contains(playHistory.get(i))){
            duplicates.add(playHistory.get(i));
        }
    }
return duplicates;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer>playHistory=new LinkedList<>();
        for(int i=0;i<n;i++){
            playHistory.add(sc.nextInt());
        }
        LinkedList<Integer>result=findRepeatedSongs(playHistory);
        System.out.println(result);
    }
}
