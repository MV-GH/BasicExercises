package Basic;

import java.util.Scanner;

public class MainEx12 {

    public static void main(String[] args) {
        double num = 0;
        double x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the amount of numbers you want to calculate the average of: ");
        int n = sc.nextInt();
        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        sc.close();
        double avgn = (num / n);

        System.out.println("Average:" + avgn);
    }
}


