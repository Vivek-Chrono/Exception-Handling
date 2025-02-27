package exception_handling.exceptionProgramms;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionInterviewQues2 {

    public static void test() throws IOException, SQLException,FileNotFoundException {
        System.out.println("Inside Method");

    }
    public static void main(String[] args) {
         ExceptionInterviewQues2 e = new ExceptionInterviewQues2();
        try {
            e.test();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        catch (IOException ee){
            ee.printStackTrace();
        }
    }
}
