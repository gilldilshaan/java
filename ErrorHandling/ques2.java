package ErrorHandling;

import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ques2 {
    public static int power(int num, int exp) throws CustomException{
        if(exp<0||num<0){
            throw new CustomException("Negative numbers are not allowed.");
        }else if(exp==0 && num==0){
            throw new CustomException("0 raised to the power of 0 is undefined.");
        }else{
            return (int)Math.pow(num, exp);
        }
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int exp = sc.nextInt();
try {
int result = power(num, exp);
    System.out.println(result);
    } catch (CustomException e) {
    System.out.println(e.getMessage());
    }
sc.close();
}
}