package Basic;
import java.util.Scanner;

public class MainEx17 {

	public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	String binvar1 = S.next();
	String binvar2 = S.next();
	S.close();
	long binvar11= Long.parseLong(binvar1,2);
	long binvar22= Long.parseLong(binvar2,2);
	long sum = binvar11+binvar22;
	System.out.println(sum);
	String strSum = Long.toBinaryString(sum);
	System.out.println(strSum);
	
	


	}

}
