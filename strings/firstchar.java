import java.util.Scanner;

public class firstchar {
    public static void main(String[] var0){
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        StringBuilder sb=new StringBuilder(n);
        int count=0;
        for(int i=0;i<n.length();i++){
            char ch=sb.charAt(i);
            count=0;
            for(int j=0;j<n.length();j++){
                if(ch==sb.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(ch);
                return;
            }
        }
        System.out.print(-1);
        sc.close();
    }
}
