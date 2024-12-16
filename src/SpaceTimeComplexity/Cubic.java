package SpaceTimeComplexity;

public class Cubic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int count = 0;
        int n = numbers.length;

        // Three nested loops for counting triplets
        for (int i = 0; i < n; i++) {          // Outer loop
            for (int j = 0; j < n; j++) {      // Middle loop
                for (int k = 0; k < n; k++) {  // Inner loop
                    // Example condition: Count if the sum of the triplet is even
                    if ((numbers[i] + numbers[j] + numbers[k]) % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of triplets: " + count);
    }

}
