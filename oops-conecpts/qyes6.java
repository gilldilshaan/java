import java.util.Scanner;

public class qyes6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int roll=sc.nextInt();
        int[] num=new int [4];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        StudentGrade s1=new StudentGrade(roll, num);

        System.out.println(s1.percentage());
        System.out.println(s1.letterGrade());
    }
}

class StudentGrade{
    private int rollNo;
    private int[]marks=new int [4];
    public StudentGrade(int rollNo,int[]marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public double percentage(){
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return (sum/400.0)*100.0;
    }
    public char letterGrade(){
        if(percentage()>=90){
            return 'A';
        }else if(percentage()>=75){
            return 'B';
        }else if(percentage()>=60){
            return 'C';
        }else if(percentage()>=40){
            return 'D';
        }else{
            return 'F';
        }
    }



}
