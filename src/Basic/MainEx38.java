package Basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainEx38 {

    public static void main(String[] args) {

        String phrase;
        String lines = "";
        System.out.println("This program shows the amount of letters, spaces, numbers, others. Please insert the path to the textfile");
        Scanner S = new Scanner(System.in);
        phrase = S.nextLine();

        S.close();
        //sentenceScanner(phrase);


        // The name of the file to open.
        String fileName = phrase;

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                lines += line;
            }


            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        sentenceScanner(lines);
        System.out.println(lines);
    }

    public static void sentenceScanner(String p) {
        int spaces, letters, numbers, others;
        letters = spaces = numbers = others = 0;
        //spaces
        for (int i = 0; i < p.length(); i++) {
            char c = p.substring(i, i + 1).charAt(0);

            if (Character.isLetter(c)) {
                letters++;
            }
            if (p.substring(i, i + 1).equals(" ")) {
                spaces++;
            }
            if (Character.isDigit(c)) {
                numbers++;
            }
            if (!p.substring(i, i + 1).equals(" ") && !Character.isLetter(c) && !Character.isDigit(c)) {
                others++;
            }
        }
        System.out.println("\nspaces: " + spaces + "\nletters: " + letters + "\nNumbers: " + numbers + "\nother: " + others);

    }

}
