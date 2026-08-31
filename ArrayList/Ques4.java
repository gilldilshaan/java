package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Ques4 {


    public static ArrayList<Integer> detectDuplicateVotes(ArrayList<Integer>
voterIds){  
    ArrayList<Integer> duplicates = new ArrayList<>();
    for(int i=0;i<voterIds.size();i++){
        int count=0;
        for(int j=0;j<voterIds.size();j++){
            if(voterIds.get(i).equals(voterIds.get(j))){
                count++;
            }
        }
        if(count>1&& !duplicates.contains(voterIds.get(i))){
                duplicates.add(voterIds.get(i));
            }
    }
    
    return duplicates;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>voterIds=new ArrayList<>();
        for(int i=0;i<n;i++){
            voterIds.add(sc.nextInt());
        }
    ArrayList<Integer> result=detectDuplicateVotes(voterIds);
    System.out.print(result);
    }    
}
