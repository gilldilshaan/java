public class Bank {
    public static void main(String[]args){
        Account a1=new SavingsAccount(101,"Rahul",50000);
        Account a2=new CurrentAccount(102, "Rohan", 20000);
        
        a1.displayAccount();
        System.out.println("Intrest "+a1.calculateIntrest());
        a2.displayAccount();
        System.out.println("Intrest "+ a2.calculateIntrest());
            
    }
}

abstract class Account{
    int accountNumber;
    String holderName;
    int balance;
    
    Account(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    abstract double calculateIntrest();
    void displayAccount(){
        System.out.println(accountNumber);
        System.out.println(holderName);
        System.out.println(balance);
    }
}

// We use super() to call the constructor of the parent class.
// The values are passed to the Account constructor, where
// this.accountNumber, this.holderName, and this.balance are initialized.
// After the parent constructor finishes, control returns to the child constructor.

class SavingsAccount extends Account{
    SavingsAccount(int accountNumber,String holderName,int balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    double calculateIntrest() {
        return balance*0.05;
    }
}
class CurrentAccount extends Account{
    CurrentAccount(int accountNumber,String holderName,int balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    double calculateIntrest(){
        return balance*0.02;
    }
}