import java.util.Scanner;

public class ques8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        double dis=sc.nextDouble();
        double fuel=sc.nextDouble();

        Car c1=new Car(s, dis, fuel);
        System.out.println(s);
        System.out.println(c1.mileage());
        System.out.println(c1.efficiencyStatus());
    }
}
class Car{
    private String model;
    private double distanceKm;
    private double fuelLiters;
    public Car(String model,double distanceKm,double fuelLiters){
        this.model=model;
        this.distanceKm=distanceKm;
        this.fuelLiters=fuelLiters;
    }
    public double mileage(){
        return distanceKm/fuelLiters;
    }
    public String efficiencyStatus(){
        if(mileage()>15.0){
            return "Efficiency";
        }else{
            return "Inefficient";
        }
    }
}
