package exception_handling.exceptionProgramms;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionInterviewQues4 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (IOException |SQLException e) {
           // e=new Exception("Hello");
            e.printStackTrace();
        } catch (Exception e) {
            e=new Exception("Hello");
            e.printStackTrace();
        }
    }

    static void foo() throws IOException, SQLException {
        System.out.println("Inside Method");
    }
}

//This Java program won’t compile because the exception object in the multi-catch block is final and we can’t change its value.
// You will get a compile-time error as “The parameter e of a multi-catch block cannot be assigned”
