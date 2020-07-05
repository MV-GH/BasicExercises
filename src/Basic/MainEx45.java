package Basic;

import java.io.File;
import java.util.Scanner;

public class MainEx45 {

    public static void main(String[] args) {
        System.out.println("This program returns the size of a txtfile, please insert the path.");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        File f = new File(path);
        s.close();
        System.out.println("The length of file: " + path + " is: " + f.length() + " bytes");

    }

}
