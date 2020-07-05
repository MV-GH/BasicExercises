package Basic;

import java.util.Scanner;

public class MainEx35 {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("This program  computes the area of a polygon.\nPlease insert the length of a side:");
        double lSide = S.nextDouble();
        System.out.println("Please insert the quantity of the sides of the polygon:");
        int qSide = S.nextInt();
        S.close();
        double area = (qSide * Math.pow(lSide, 2)) / (4 * Math.tan(Math.PI / qSide));
        System.out.println(area);
    }

}
