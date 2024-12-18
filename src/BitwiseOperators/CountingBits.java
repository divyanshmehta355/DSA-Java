package BitwiseOperators;


import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(countBits(n)));
    }

    static int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++){
            int count = 0;
            int num = i;
            while (num != 0){
                int lastBit = num & 1;
                if(lastBit == 1){
                    count++;
                }
                num = num >> 1;
            }
            ans[i] = count;
        }
        return ans;
    }
}
