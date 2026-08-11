
public class oops {
    public static void main(String[]args){
        Pen p1=new Pen();//cREATED A PEN OBJECT CALLED P1
        Student s1=new Student();

        p1.setColor("Yellow");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());


        // BankAccount myAcc=new BankAccount();
        // myAcc.userName="gill";
        // myAcc.setPassword("asnadsa");

    }
}


// class BankAccount{
//     public String userName;
//     private String password;

//     public void setPassword(String pwd){
//         password=pwd;
//     }
// }

class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
     String name;
     int age;
     float percentage;

     void calPercentage(int phy,int chem,int maths){
        percentage=(phy+chem+maths)/3;
     }
}
