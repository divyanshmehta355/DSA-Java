package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        //Decimal to Binary
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int number = scanner.nextInt();
        String result = "";

        while(number>0){
            int rem = number % 2;
            number = number / 2;
            result = rem + result;
        }

        System.out.println(result);
    }
}
