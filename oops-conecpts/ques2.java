import java.util.*;
public class ques2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double rad=sc.nextDouble();

        Circle c1=new Circle(rad);
        
        System.out.println(c1.getRadius());
        System.out.printf("%.2f%n", c1.area());
        System.out.printf("%.2f%n",c1.circumference());
        sc.close();
        
    }
}
class Circle{
    private double radius;


public Circle(){
    radius=1.0;
}
public Circle(double radius){
    this.radius=radius;
}
public void setRadius(double radius){
    this.radius=radius;
}
public double getRadius(){
    return radius;
}
public double area(){
    return (3.14159*radius*radius);
}
public double circumference(){
    return (2*3.14159*radius);
}

}