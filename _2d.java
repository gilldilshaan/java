import java.util.Scanner;

public class _2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] newMatrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMatrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(newMatrix[i][j] + " ");
                }
            System.out.println();
            }
        }
    }

