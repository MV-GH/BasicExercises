package Basic;

import java.util.Scanner;

public class MainEx42 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program will repeat the answer when asked, please enter the password.");
        String pass = s.nextLine();
        System.out.println("Type password in the console to see the password.");
        String g = s.nextLine();
        s.close();
        if (g.equals("password")) {
            System.out.println(pass);
        }


    }
}