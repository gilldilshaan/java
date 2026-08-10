public class patters {
    public static void main(String[] args){
        //5 Stars in straight line

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Trianfluar Stars

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //Inverted Stars

        // int n=5;
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Number Triangle

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // Full Pyramid

// int n = 5;

// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//     }
//     for(int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// Inverted Full Pyramid

    // int n = 5;

    // for(int i = n; i >= 1; i--) {
    //     for(int j = 1; j <= n - i; j++) {
    //         System.out.print(" ");
    // }
    //     for(int j = 1; j <= i; j++) {
    //         System.out.print("* ");
    // }
    //     System.out.println();
    //     }
        

    //Problem 9: Floyd's Triangle 
    // int n=5;
    // int a=1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(a+" ");
    //         a++;
    //     }
    //     System.out.println();
    // }


    //Problem 7: Diamond Pattern 
        // Diamond Pattern

// int n = 5;

// // Upper Half
// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//     }
//     for(int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }

// // Lower Half
// for(int i = n - 1; i >= 1; i--) {
//     for(int j = 1; j <= n - i; j++) {
//         System.out.print(" ");
//     }
//     for(int j = 1; j <= i; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }


int n = 5;
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1 || i==n || j==1 || j==n){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
}