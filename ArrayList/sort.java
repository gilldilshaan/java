package ArrayList;
import java.util.*;

public class sort {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(675);
        list.add(10);
        list.add(54);
        list.add(44);
        list.add(23);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
