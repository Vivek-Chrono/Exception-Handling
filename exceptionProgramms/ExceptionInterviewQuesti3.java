package exception_handling.exceptionProgramms;

import java.io.FileNotFoundException;

public class ExceptionInterviewQuesti3 {
    public static void main(String[] args) {
        try{
            bar();
        }
        catch (NullPointerException ee){
           ee.printStackTrace();
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
        foo();

    }

    public static void bar(){
        System.out.println("Inside bar method");

    }

    static void foo()throws NullPointerException {
        System.out.println("Indise foo method");

    }
}

//if a method (foo) declares the unchecked exception in the throws clause,
// it is not mandatory to handle that in the program.

//if a method (foo) declares the checked exception in the throws clause,
// it is mandatory to handle that in the program.
