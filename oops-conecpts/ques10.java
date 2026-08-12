import java.util.Scanner;

public class ques10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Double d=sc.nextDouble();

        WeatherReport w=new WeatherReport(s,d);
        System.out.printf("%.2f\n",w.toFahrenheit());
        System.out.println(w.dayLabel());
    }
}
class WeatherReport{
    private String cityName;
    private double celsius;
    public WeatherReport(String cityName,double celsius){
        this.cityName=cityName;
        this.celsius=celsius;
    }
    public double toFahrenheit(){
        return (celsius*9/5.0)+32;
    }
    public String dayLabel(){
        if(celsius>=35){
            return "Hot";
        }else if(celsius>=25){
            return "Warm";
        }else if(celsius>10){
            return "Pleasant";
        }else{
            return "Cold";
        }
    }
}
