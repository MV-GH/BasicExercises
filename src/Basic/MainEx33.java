package Basic;

import java.util.Scanner;

public class MainEx33 {

    public static void main(String[] args) {


        Scanner S = new Scanner(System.in);
        System.out.println("This program  computes the sum of the digits of an integer.\nPlease insert the integer:");
        int var = S.nextInt();
        S.close();

        int length = String.valueOf(var).length();
        int[] varapart = new int[length];

        for (int i = 0; i < length; i++) {
            varapart[i] = var % 10;
            var /= 10;
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += varapart[i];
        }
        System.out.println("The sum is: " + sum);

    }

}
