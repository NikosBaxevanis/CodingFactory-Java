package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο δεδομένα
 */

public class NamesScanning {
    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilePath = "C:/tmp/names-formated.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*"); // ,+ means one or more "," and \\s* means 0 >= spaces
                ps.printf("{ \"Firstename\": \"%s\", \"Lastname\": \"%s\", \"City\" : \"%s\" } , \n", tokens[0], tokens[1], tokens[2]);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
