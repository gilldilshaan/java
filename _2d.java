import java.util.Scanner;

public class _2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] newMatrix = new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         newMatrix[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }


        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(newMatrix[i][j] + " ");
        //         }
        //     System.out.println();
        //     }

        //1 Print the sum of each row of the matrix
        // int sum=0;
        // for(int i=0;i<r;i++){
            
        //     for(int j=0;j<c;j++){
        //         newMatrix[i][j] = sc.nextInt();
        //     }
            
        // }
        // for(int i=0;i<r;i++){
        //     sum=0;
        //     for(int j=0;j<c;j++){
        //         sum+=newMatrix[i][j];
        //     }
        //     System.out.println("Sum of row " + (i+1) + " is: " + sum);
        // }        


    //Sum of kth row of the matrix
//    int sum=0;
//         for(int i=0;i<r;i++){
            
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//         }
//         int k=sc.nextInt();
//         for(int i=0;i<r;i++){
//             sum=0;
//             for(int j=0;j<c;j++){
//                 sum+=newMatrix[k-1][j];
//             }
//         }        
//         System.out.println("Sum of row " + k + " is: " + sum);


// //Maximum element in the matrix
//         for(int i=0;i<r;i++){
            
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//         }
//         int max=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(newMatrix[i][j]>max){
//                     max=newMatrix[i][j];
//                 }
//             }
//         }        
//         System.out.println("Maximum element  is: " + max);


//Check if the matrix is symmetric or not
// boolean symetric=false;

//         for(int i=0;i<r;i++){
            
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(newMatrix[i][j]!=newMatrix[j][i]){
//                     symetric=false;
//                     break;
//                 }
//                 else{
//                     symetric=true;
//                 }
//             }
//         }
//         if(symetric){
//                 System.out.println("Matrix is symetric");
//             }else{
//                 System.out.println("Matrix is not symetric");
//         }    


//Upper triangular matrix
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         newMatrix[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }


        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(j>=i){
        //             System.out.print(newMatrix[i][j] + " ");
        //         }
        //         else{
        //             System.out.print(0 + " ");
        //         }
        //     }
        //     System.out.println();
        //     }

//Lower triangular matrix Sum
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         newMatrix[i][j] = sc.nextInt();
        //     }
        //     System.out.println();
        // }

        // int sum=0;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         if(j<=i){
        //             sum += newMatrix[i][j];
        //         }
        //     }
        //     System.out.println();
        //     }
        //     System.out.println("Sum of lower triangular matrix is: " + sum);

//Sum of diagonal elements of the matrix
    // for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             newMatrix[i][j] = sc.nextInt();
    //         }
    //         System.out.println();
    //     }


    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(i==j){
    //                 System.out.print(newMatrix[i][j] + " ");
    //             }
    //         }
    // }

    
}
}

