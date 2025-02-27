package exception_handling;

/*
public class ExceptionPropogaton {

    void m1() throws ClassNotFoundException {
        Class.forName("jsdncja");
    }

    void m2() throws ClassNotFoundException{
        m1();
    }

    void m3() throws ClassNotFoundException{
        m2();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        ExceptionPropogaton e = new ExceptionPropogaton();
        e.m3();
    }
}
*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class ExceptionPropagationTest {

    void m1(String name) throws IOException, SQLException {
        if(name.length() < 5){
            throw new RuntimeException("Please enter name with at least 5 characters");
        }
        System.out.println("Welcome "+name);
        new ExceptionPropagationTest().m2();
    }
    void m2() throws FileNotFoundException, IOException, SQLException {
        FileInputStream stream = new FileInputStream("file");
        new ExceptionPropagationTest().m3();
    }
    void m3() throws SQLException {
        int a = 100 / 0;

    }

    public static void main(String[] args) {
        ExceptionPropagationTest test = new ExceptionPropagationTest();
        try {
            test.m1("Test123");
        } catch (IOException |  SQLException | NullPointerException e) {
            System.out.println("Got exception in main method");
        }

        System.out.println("Main method message");
    }
}




