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
    

    // for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
    //             newMatrix[i][j] = sc.nextInt();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Enter the row number to calculate the sum: ");
    //     int a=sc.nextInt();
    //     System.out.println("Enter the column number to calculate the sum: ");
    //     int b=sc.nextInt();
    //     int [][] matrix1 = new int[a][b];
    // for(int i=0;i<a;i++){
    //     for(int j=0;j<b;j++){
    //         System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
    //         matrix1[i][j] = sc.nextInt();
    //         }
    //     System.out.println();
    //     }
    //     if(c == a){
    
    // int[][] MulMatrix = new int[r][b];

    // for(int i=0;i<r;i++){
    //     for(int j=0;j<b;j++){
            
    //         MulMatrix[i][j] = 0;
            
    //         for(int k=0;k<c;k++){
    //             MulMatrix[i][j] += newMatrix[i][k] * matrix1[k][j];
    //         }
    //     }
    // }
    //         System.out.println("Product of the two matrices is: ");
    //         for(int i=0;i<r;i++){
    //             for(int j=0;j<c;j++){
    //                 System.out.print(MulMatrix[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    //     else{
    //         System.out.println("Matrix multiplication is not possible");
    //     }


// //Check if two matrices are equal or not
//     for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }
//         System.out.println("Enter the row number to calculate the sum: ");
//         int a=sc.nextInt();
//         System.out.println("Enter the column number to calculate the sum: ");
//         int b=sc.nextInt();
//         int [][] matrix1 = new int[a][b];
//     for(int i=0;i<a;i++){
//         for(int j=0;j<b;j++){
//             System.out.print("Enter element at position (" + (i+1) + "," + (j+1) + "): ");
//             matrix1[i][j] = sc.nextInt();
//             }
//         System.out.println();
//         }
//         boolean equal = true;
//     for(int i=0;i<a;i++){
//         for(int j=0;j<b;j++){
//             if(newMatrix[i][j] == matrix1[i][j]){
//                 equal = true;
//             }
//             else{
//                 equal = false;
//             }
//         }
//     }

//     if(equal){
//         System.out.println("The two matrices are equal");
//     }
//     else{
//         System.out.println("The two matrices are not equal");
//     }


//Sum of minor diagonal elements of the matrix
// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

//         int sum=0;
//         for(int i=0;i<r;i++){
//             for(int j=c-1;j>=0;j--){
//                 if(i+j==c-1){
//                     sum+=newMatrix[i][j];  
//                 }
//             }

// }
// System.out.println("Sum of the anti-diagonal elements is: " + sum);



//Check if the matrix is an identity matrix


// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

// boolean flag=true;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(i==j&& newMatrix[i][j]!=1){
//                     flag=false;
//                 }
//                 if(i!=j && newMatrix[i][j]!=0){
//                     flag=false;
//                 }
//             System.out.println();
//             }
//     }
//     if(flag){
//             System.out.println("The matrix is an identity matrix");
//         }
//         else{
//             System.out.println("The matrix is not an identity matrix");
//         }



// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

// int even=0, odd=0;
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(newMatrix[i][j] %2==0){
//                     even++;
//                 }
//                 else{
//                     odd++;
//                 }

//             }


// }
// System.out.println("Number of even elements in the matrix is: " + even);
// System.out.println("Number of odd elements in the matrix is: " + odd);



//Transpose of the matrix
// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }


//         for(int i=0;i<c;i++){
//             for(int j=0;j<r;j++){
//                 System.out.print(newMatrix[j][i] + " ");
//                 }
//             System.out.println();
//             }


//Rotate the matrix by 90 degrees

// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

//         for(int j=0;j<c;j++){
//             for(int i=c-1;i>=0;i--){
//                 System.out.print(newMatrix[i][j] + " ");
//                 }
//             System.out.println();
//             }



//sum of two matrices
// int [][] Matrix1 = new int[r][c];
// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 newMatrix[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }
// for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 Matrix1[i][j] = sc.nextInt();
//             }
//             System.out.println();
//         }

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(newMatrix[i][j] + Matrix1[i][j] + " ");
//                 }
//             System.out.println();
//             }

 for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMatrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }

    int min=newMatrix[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(newMatrix[i][j]<min){
                    min=newMatrix[i][j];
                }
            }
        }
        System.out.println("Minimum element in the matrix is: " + min);
            }


}