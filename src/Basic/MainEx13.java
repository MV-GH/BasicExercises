package Basic;
import java.util.Scanner;

public class MainEx13 {

	public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	System.out.println("Input the height of the rectangle:");
	double height =  S.nextDouble();
	System.out.println("Input the width of the rectangle:");
	double width =  S.nextDouble();
	S.close();
	System.out.println("The is area is: " +height*width*1.00);
	double peri =height + height+ width +width;
	System.out.println("The perimeter is: " + peri*1.00 );
	
	}

}

