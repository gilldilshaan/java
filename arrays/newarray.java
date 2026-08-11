public class newarray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int index = 2;
        int element = 99;

        for (int i = 0; i < arr.length; i++) {

            if (i == index) {
                System.out.print(element + " ");
            }

            System.out.print(arr[i] + " ");
        }
    }
}