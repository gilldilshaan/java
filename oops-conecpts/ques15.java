import java.util.Scanner;

public class ques15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String school=sc.next();
        Student.schoolName=school;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Student s;
            int Choice=sc.nextInt();
            
            if(Choice==1){
                String name=sc.next();
               s=new Student(name);
               s.display();
            }else if(Choice==2){
                String name=sc.next();
                int score=sc.nextInt();
               s=new Student(name,score);
               s.display();
            }
            

        }
        
        Student.displaySchoolSummary();
        
    }
}
class Student{
    int RollNo;
    String Name;
    double Score;
    static int nextRollNo=2001;
    static String schoolName;
    static double highestScore=0;
    static String toperName;


    Student(String Name){
        this.Name=Name;
        this.RollNo=nextRollNo++;
        this.Score=0;

        if(Score>highestScore){
            highestScore=Score;
            toperName=Name;
        }
    }
    Student(String Name, double Score){
        this.Name=Name;
        this.Score=Score;
        this.RollNo=nextRollNo++;

        if(Score>highestScore){
            highestScore=Score;
            toperName=Name;
        }
    }
    void display(){
    System.out.println("Roll No : " + RollNo);
    System.out.println("Name : " + Name);
    System.out.printf("Score : %.2f%n", Score);
}
    static void displaySchoolSummary(){
    System.out.println("School Name : " + schoolName);
    System.out.println("Topper : " + toperName);
    System.out.printf("Highest Score : %.2f%n", highestScore);
}
}
