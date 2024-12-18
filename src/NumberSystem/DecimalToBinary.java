package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {

    static int toDecimal(int binary){
        int result = 0;
        int index = 0;

        while(binary != 0){
            int lastDigit = binary % 10;
            if (lastDigit == 1){
                result = result + (int) Math.pow(2, index);
            }
            index = index + 1;
            binary = binary / 10;
        }
        return result;
    }

    static String toBinary(int decimal){
        String result = "";

        while (decimal != 0){
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
//        String ans = toBinary(n);
//        System.out.println(ans);
        int ans = toDecimal(n);
        System.out.println(ans);
    }

    static void DecimalToBinary(){
        //Decimal to Binary
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int number = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        while(number>0){
            int rem = number % 2;
            number = number / 2;
            result.insert(0, rem);
        }

        System.out.println(result);
    }
}
