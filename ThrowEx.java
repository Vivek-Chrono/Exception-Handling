package exception_handling;

/*
public class ThrowEx extends RuntimeException{
    public static void main(String[] args) {
        throw new ArithmeticException("/by zero");//In this case Creating the exception object hand over to the jvm by manually.
        //Programmer creating exception object explicitly and hand over to the jvm manually.
    }

    {
        System.out.println(10/0);//Here creation of exception object hand over to the jvm it is handled internally.
    }
 //In this case main method is responsible to create exception object and hand over to the jvm.
            throw new ThrowEx();
    }
}
*/

import java.io.FileNotFoundException;

class ThrowExa{
    public static void main(String[] args) {
        try{
            ArithmeticException a = new ArithmeticException("Hello Java");
            throw a;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmethicException = \n"+e);
            System.out.println(e.getMessage());
        }
    }
}

class ThrowExam{
    public static void main(String[] args) {
        try{
            int x = 10/2;
            System.out.println(x);
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("Hello");
        }
    }
}

