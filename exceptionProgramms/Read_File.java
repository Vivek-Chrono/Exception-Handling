package exception_handling.exceptionProgramms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) {
        try{
            readFile("Read_File.java");
        } catch (Exception e) {
            System.out.println("Execption caught filenot found "+e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File f = new File(filename);
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine()){
            String l = sc.nextLine();
            System.out.println(l);
        }
        sc.close();
    }
}
