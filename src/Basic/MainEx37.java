package Basic;

import java.util.Scanner;

public class MainEx37 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String phrase;
        System.out.println("This program reverse the string, please insert a string.");
        Scanner S = new Scanner(System.in);
        phrase = S.nextLine();

        S.close();
        backwards(phrase);


    }

    public static void backwards(String p) {

        for (int i = p.length(); i > 0; i--) {
            System.out.print(p.substring(i - 1, i));

        }

    }

}
