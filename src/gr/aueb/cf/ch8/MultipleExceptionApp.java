package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {

    public static void main(String[] args) throws IOException{
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(System.in)){
            char ch = (char) System.in.read();
            int num =in.nextInt();
        }catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            throw e;
        }catch (IOException e) {
            System.err.println("IO EXCEPTION");
            e.printStackTrace();
//            throw e;
        }catch (Exception e) {
            System.err.println("Generic Error");
            e.printStackTrace();
        }
    }
}
