package Basic;

import java.util.Scanner;

public class MainEx44 {

    public static void main(String[] args) {
        System.out.println("This progam prints the next number as N + NN +NNN . Please enter the number.");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        String nText = String.valueOf(n);


        System.out.println(nText + " + " + nText + nText + " + " + nText + nText + nText);
    }

}
