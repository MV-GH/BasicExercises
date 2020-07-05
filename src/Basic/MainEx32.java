package Basic;

import java.util.Scanner;

public class MainEx32 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("This program compares the two inputted numbers.\nPlease insert the first number:");
        double var1 = S.nextDouble();
        System.out.println("Please insert the second number:");
        double var2 = S.nextDouble();
        S.close();

        if (var1 > var2) {
            System.out.println(var1 + " > " + var2);
        }
        if (var1 >= var2) {
            System.out.println(var1 + " >= " + var2);
        }
        if (var1 == var2) {
            System.out.println(var1 + " = " + var2);
        }
        if (var1 < var2) {
            System.out.println(var1 + " < " + var2);
        }
        if (var1 <= var2) {
            System.out.println(var1 + " <= " + var2);
        }
        if (var1 != var2) {
            System.out.println(var1 + " != " + var2);
        }

    }

}
