package SpaceTimeComplexity;

public class Linear { // O(n)
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        // Add 10 to the first element
        arr[0] = arr[0] + 10; // O(1) T.C. | S.C - O(1)

        // Task: Print the elements of an array
        for (int i = 0; i < arr.length; i++){ // O(n) Time C. | S.C. - O(1)
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]); // T.C O(1) | S.C O(1)

        // Copy the elements of one array to another
        int[] newArr = new int[arr.length]; // T.C O(1) | S.C O(n)

        for (int i = 0; i < arr.length; i++) { // T.C O(n) | S.C O(1)
            newArr[i] = arr[i];
        }

        for (int num: newArr){ // T.C. O(n) | S.C. O(1)
            System.out.println(num);
        }

        // Overall Old
        // T. C = O(n)
        // S. C = O(1)

        // Overall New
        // S. C -> 1 + 1 + 1 + n + 1 + 1 = O(5 + n) -> O(n)
        // T. C -> 1 + n + 1 + 1 + n + n = O(3 + 3n) -> O(3 * n) => O(n)

    }
}
