package ArrayList;
import java.util.*;

public class Ques3 {

    public static ArrayList<Integer> updateMembers(ArrayList<Integer> members,
int[] expired, int[] newMembers){
    for(int i=0;i<expired.length;i++){
        if(members.contains(expired[i])){
            members.remove(Integer.valueOf(expired[i]));
        }
    }
    for(int i=0;i<newMembers.length;i++){
        if(!members.contains (newMembers[i])){
            members.add(newMembers[i]);
        }
    }
    return members;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> members=new ArrayList<>();
        for(int i=0;i<n;i++){
            members.add(sc.nextInt());
        }
        int e=sc.nextInt();
        int []expired=new int[e];
        for(int i=0;i<e;i++){
            expired[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int []newMembers=new int[m];
        for(int i=0;i<m;i++){
            newMembers[i]=sc.nextInt();
        }

        ArrayList<Integer>result=updateMembers(members, expired, newMembers);
        System.out.println(result);
    }
}
