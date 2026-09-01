package ArrayList;
import java.util.*;
public class ques11 {
    public static ArrayList<Integer> detectDuplicateBarcodes(ArrayList<Integer>
barcodeList){
    ArrayList<Integer> duplicates=new ArrayList<>();
    for(int i=0;i<barcodeList.size();i++){
        for(int j=i+1;j<barcodeList.size();j++){
            if(barcodeList.get(i).equals(barcodeList.get(j))){
                if(!duplicates.contains(barcodeList.get(i))){
                    duplicates.add(barcodeList.get(i));
                }
            }
        }
    }
    return duplicates;
}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>barcodeList=new ArrayList<>();
        for(int i=0;i<n;i++){
            barcodeList.add(sc.nextInt());
        }
        ArrayList<Integer> duplicates=detectDuplicateBarcodes(barcodeList);
        System.out.println(duplicates);
    }
}
