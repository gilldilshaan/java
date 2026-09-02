import java.util.Scanner;
class InvalidPriceExceotion extends Exception{
    public InvalidPriceExceotion(String message){
        super(message);
    }
}
public class q4mid {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double total=0;
        double subtotal=0;
        try{
            for(int i=0;i<3;i++){
                double n=sc.nextDouble();
                int v=sc.nextInt();
                total+=n*v;
                if(n<0){
                    throw new InvalidPriceExceotion("Invalid product price");
                }
            }
            if(total>=5000){
                subtotal=total-((total*10)/100);
            }else if(total>=2000){
                subtotal=total-((total*5)/100);
            }
            System.out.println(subtotal);
        }catch(InvalidPriceExceotion e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Billing Process Completed");
        }
    }
}
