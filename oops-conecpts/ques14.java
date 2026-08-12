import java.util.Scanner;

public class ques14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            int choice = sc.nextInt();
            sc.nextLine();

            Product p;

            if (choice == 1) {

                String name = sc.nextLine();

                p = new Product(name);

            } else if (choice == 2) {

                String name = sc.next();
                double price = sc.nextDouble();

                p = new Product(name, price);

            } else {

                String name = sc.next();
                double price = sc.nextDouble();
                int quantity = sc.nextInt();

                p = new Product(name, price, quantity);
            }

            p.calculateStockVlaue();
            p.display();
        }

        Product.displayInventorySummary();

        sc.close();
    }
}
class Product{
    int id;
    String Name;
    double Price;
    int Quamtity;
    double Value;

    static int nextProductId=9001;
    static int productCount;
    static double totalValue;

    Product(String Name){
        this.Name=Name;
        this.Price=0;
        this.Quamtity=0;  
        id=nextProductId++;
        productCount++; 

    }
    Product(String Name, double Price){
        this.Name = Name;
        this.Price = Price;
        this.Quamtity=1;

        id = nextProductId++;
        productCount++;
    }
    Product(String Name, double Price, int Quamtity){
        this.Name = Name;
        this.Price = Price;
        this.Quamtity = Quamtity;

        id = nextProductId++;
        productCount++;
    }
    void calculateStockVlaue(){
        Value=Price*Quamtity;
        totalValue+=Value;
    }
    void display(){
        System.out.println("Product Id : " + id);
        System.out.println("Product Name : " + Name);
        System.out.printf("Stock Value : %.2f%n", Value);
    }
    static void displayInventorySummary(){

        System.out.println("Total Products : " + productCount);
        System.out.printf("Total Stock Value : %.2f%n", totalValue);
    }
}
