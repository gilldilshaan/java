import java.util.*;;
public class ques1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        String AccDetails=sc.nextLine();
        double oppBalance=sc.nextDouble();
        double DepAmount=sc.nextDouble();
        double WithAmount=sc.nextDouble();
        BankAccount acc=new BankAccount(AccDetails, oppBalance);

        acc.deposit(DepAmount);
        acc.withdraw(WithAmount);


        System.out.println(acc.getBalance());

    }
}
class BankAccount{
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Overdraft");
        }else{
            balance-=amount;
            
        }
    }
    public double getBalance(){
        return balance;
    }
}