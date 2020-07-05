package Basic;

public class MainEx31 {

    public static void main(String[] args) {
        System.out.println("Checks if java is installed" + "\n.\n..\n...");
        if (System.getProperty("java.version") == null) {
            System.out.println("Java is not installed!, Please install java.");

        } else {
            System.out.println("Found version: " + System.getProperty("java.version") + " ,Launching\n.\n..\n...");


        }


    }

}
