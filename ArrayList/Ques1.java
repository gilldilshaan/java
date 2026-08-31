package ArrayList;
import java.util.Scanner;
import java.util.*;

public class Ques1 {

    public static ArrayList<Integer> updateRecords(ArrayList<Integer> patients,
            int[] newPatients) {

        for (int i = 0; i < newPatients.length; i++) {
            if (!patients.contains(newPatients[i])) {
                patients.add(newPatients[i]);
            }
        }

        return patients;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> existingPatient = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            existingPatient.add(sc.nextInt());
        }

        int m = sc.nextInt();
        int[] newPatients = new int[m];

        for (int i = 0; i < m; i++) {
            newPatients[i] = sc.nextInt();
        }

        ArrayList<Integer> result = updateRecords(existingPatient, newPatients);

        System.out.println(result);
    }
}