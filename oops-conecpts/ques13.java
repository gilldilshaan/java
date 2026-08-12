import java.util.Scanner;

public class ques13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int interest=sc.nextInt();
        int n=sc.nextInt();
        BankAccount.intrestRate=interest;
        for(int i=0;i<n;i++){
            String holder=sc.next();
            Double balance=sc.nextDouble();

            BankAccount b=new BankAccount(holder, balance);
            b.addIntrest();
            b.display();
        }
        System.out.printf(
            "Total Bank Balance : %.2f%n",
            BankAccount.getTotalBankBalance()
        );
    }
}
class BankAccount{
    int AccountNumber;
    String Holder;
    double Balance;

    static int nextAccountNumber=100001;
    static double intrestRate;
    static double totalBankBalance;

    BankAccount(String Holder, double Balance){
        this.Holder=Holder;
        this.Balance=Balance;
        AccountNumber=nextAccountNumber++;
        totalBankBalance+=Balance;
    }
    void addIntrest(){
        double interest=Balance*intrestRate/100;
        Balance+=interest;
        totalBankBalance+=interest;
    }
    void display(){

    System.out.println("Account Number : " + AccountNumber);
    System.out.println("Holder Name : " + Holder);
    System.out.printf("Balance : %.2f%n", Balance);
}
    static double getTotalBankBalance(){
        return totalBankBalance;
    }
}
