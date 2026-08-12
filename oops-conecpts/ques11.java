import java.util.Scanner;

public class ques11 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        String name=sc.next();
        Double fine=sc.nextDouble();
        
        Member m=new Member(name, fine);

        m.display();
    }
    System.out.println(Member.memberCount);
    }
}
class Member{
    int MemberId;
    String MemberName;
    Double TotalFine;

    static int nextId=1001;
    static int memberCount=0;

    Member(String MemberName,Double TotalFine){
        this.TotalFine=TotalFine;
        this.MemberName=MemberName;
        this.MemberId=nextId;
        nextId++;
        memberCount++;
    }
     void display() {

        System.out.println("Member Id : " + MemberId);
        System.out.println("Member Name : " + MemberName);
        System.out.printf("Total Fine : %.2f\n", TotalFine);
    }
}
