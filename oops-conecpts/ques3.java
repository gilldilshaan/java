import java.util.Scanner;

public class ques3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        int qualtity=sc.nextInt();

        Product p1=new Product(price,qualtity);

        System.out.println(p1.getPrice());
        System.out.println(p1.getQuantity());
        System.out.println(p1.totalValue());
    }
}
class Product{
    private double price;
    private int quantity;
    public Product(){
        price=0.0;
        quantity=0;
    }
    public Product(double price,int quantity){
        this.price=price;
        this.quantity=quantity;
    }

    public Product(Product p){
        this.price=p.price;
        this.quantity=p.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity(){
        return quantity;
    }


    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    
    public double totalValue(){
        return price*quantity;
    }
}