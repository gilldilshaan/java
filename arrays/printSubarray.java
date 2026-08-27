public class printSubarray {



    public static void printSubArray(int numbers[]){
        int count=0;
        int max=numbers[0];
        int mini=numbers[0];
        for (int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    if(numbers[k]>max){
                        max=numbers[i];
                    }
                    if(numbers[i]<mini){
                        mini=numbers[i];
                    }
                    
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray:"+count);
        System.out.println(max);
        System.out.println(mini);
        
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        printSubArray(numbers);
    }
}
