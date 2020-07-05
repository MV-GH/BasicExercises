package Basic;

import java.util.Scanner;

public class MainEx34 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("This program  computes the area of a hexagon.\nPlease insert the length of a side:");
        double var = S.nextDouble();
        S.close();
        double area = (6 * Math.pow(var, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println(area);


    }

}
