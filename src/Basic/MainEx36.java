package Basic;

import java.util.Scanner;

public class MainEx36 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("This program computes the distance between two points on the surface of earth.\nPlease insert the latitude of coordinate 1:");
        double laCo1 = S.nextDouble();
        System.out.println("Please insert the longtitude of coordinate 1:");
        double loCo1 = S.nextDouble();
        System.out.println("Please insert the latitude of coordinate 2:");
        double laCo2 = S.nextDouble();
        System.out.println("Please insert the longtitude of coordinate 2:");
        double loCo2 = S.nextDouble();
        S.close();

        laCo1 = Math.toRadians(laCo1);
        laCo2 = Math.toRadians(laCo2);
        loCo1 = Math.toRadians(loCo1);
        loCo2 = Math.toRadians(loCo2);
        final double raduisEarth = 6371.01;
        double distance = raduisEarth * (Math.acos(Math.sin(laCo1) * Math.sin(laCo2) + Math.cos(laCo1) * Math.cos(laCo2) * Math.cos(loCo1 - loCo2)));

        System.out.println("The distance between the coordinates is: " + distance + " kilometers.");


    }


}
