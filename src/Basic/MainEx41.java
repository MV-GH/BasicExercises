package Basic;

import java.util.Scanner;

public class MainEx41 {
    public static void main(String[] args) {
        System.out.println("This program prints the ascii value of a given character");

        Scanner s = new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(0);
        int i = ch;
        s.close();
        System.out.println(i);


    }
}
