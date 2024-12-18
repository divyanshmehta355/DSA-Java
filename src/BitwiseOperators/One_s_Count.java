package BitwiseOperators;

public class One_s_Count {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hammingWeight(n));
    }

    static int hammingWeight(int n) {
            int result = 0;

            while(n != 0){
                int lastBit = n & 1;
                if(lastBit == 1){
                    result++;
                }
                n = n >> 1;
            }
            return result;
        }

}
