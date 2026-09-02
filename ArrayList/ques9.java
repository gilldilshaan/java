import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            count[ch - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (count[ch - 'a'] == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}