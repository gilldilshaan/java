package ArrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // 1. add() - add element at the end
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);


        // 2. add(index, element) - add at a specific index
        list.add(2, 10);

        System.out.println("After adding 10 at index 2: " + list);


        // 3. get(index) - get element at an index
        int element = list.get(2);

        System.out.println("Element at index 2: " + element);


        // 4. remove(index) - remove element at an index
        list.remove(3);

        System.out.println("After removing index 3: " + list);


        // 5. contains(element) - check if element exists
        System.out.println("Contains 1: " + list.contains(1));


        // 6. set(index, element) - replace element
        list.set(4, 10);

        System.out.println("After replacing index 4: " + list);


        // 7. size() - number of elements
        System.out.println("Size: " + list.size());


        // 8. Loop through ArrayList
        System.out.println("Elements:");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}



// # Java `ArrayList` — VS Code Notes

// `ArrayList` is a **resizable array** in Java. Unlike a normal array, its size can increase or decrease dynamically.

// ### 1. Import ArrayList

// ```java
// import java.util.ArrayList;
// ```

// ### 2. Create an ArrayList

// ```java
// ArrayList<Integer> list = new ArrayList<>();
// ```

// Here:

// * `ArrayList` → the class
// * `<Integer>` → type of data stored
// * `list` → name of the ArrayList
// * `new ArrayList<>()` → creates the ArrayList

// You can also store other types:

// ```java
// ArrayList<String> names = new ArrayList<>();
// ArrayList<Double> prices = new ArrayList<>();
// ```

// ---

// ## 3. `add()` — Add elements

// ```java
// list.add(10);
// list.add(20);
// list.add(30);
// ```

// ArrayList now:

// ```text
// [10, 20, 30]
// ```

// Unlike arrays, you **don't need to specify the size**.

// ---

// ## 4. `add(index, element)` — Add at a particular position

// ```java
// list.add(1, 50);
// ```

// Before:

// ```text
// [10, 20, 30]
// ```

// After:

// ```text
// [10, 50, 20, 30]
// ```

// Remember: indexing starts from `0`.

// ```text
// Index:   0   1   2
//          ↓   ↓   ↓
//         10  20  30
// ```

// ---

// ## 5. `get(index)` — Access an element

// For an array:

// ```java
// numbers[2]
// ```

// For an ArrayList:

// ```java
// list.get(2);
// ```

// Example:

// ```java
// System.out.println(list.get(1));
// ```

// Output:

// ```text
// 20
// ```

// ---

// # 6. `size()` ⭐

// This is the ArrayList equivalent of the array's `.length`.

// ### Array:

// ```java
// numbers.length
// ```

// ### ArrayList:

// ```java
// list.size()
// ```

// Example:

// ```java
// System.out.println(list.size());
// ```

// If:

// ```java
// list = [10, 20, 30]
// ```

// then:

// ```text
// 3
// ```

// ### Important difference

// ```java
// numbers.length      // Array
// list.size()         // ArrayList
// ```

// `size()` is a **method**, so you need `()`.

// ---

// ## 7. Using `size()` in a loop

// ```java
// for(int i = 0; i < list.size(); i++){
//     System.out.println(list.get(i));
// }
// ```

// Output:

// ```text
// 10
// 20
// 30
// ```

// Think of it like:

// ```java
// for(int i = 0; i < list.size(); i++)
// ```

// and access using:

// ```java
// list.get(i)
// ```

// ---

// ## Complete basic program

// ```java
// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);

//         System.out.println(list);

//         System.out.println(list.get(1));

//         System.out.println(list.size());

//         for(int i = 0; i < list.size(); i++){
//             System.out.println(list.get(i));
//         }
//     }
// }
// ```

// Output:

// ```text
// [10, 20, 30]
// 20
// 3
// 10
// 20
// 30
// ```

// ### Remember these 4 first

// | Operation | ArrayList                         |
// | --------- | --------------------------------- |
// | Add       | `list.add(10)`                    |
// | Access    | `list.get(0)`                     |
// | Size      | `list.size()`                     |
// | Loop      | `for(int i=0; i<list.size();i++)` |

// **Array vs ArrayList:**

// ```java
// // Array
// int[] arr = new int[5];
// arr[0] = 10;
// System.out.println(arr.length);

// // ArrayList
// ArrayList<Integer> list = new ArrayList<>();
// list.add(10);
// System.out.println(list.size());
// ```

// The key thing to remember is: **Array → `[]` and `.length`; ArrayList → `.get()` and `.size()`**.

