package exception_handling;

import java.io.File;
import java.io.FileInputStream;

public class WhichExceptionThrows {
    public static void main(String[] args) {
       /*
        int a = 10;
        int b = 0;           // Throws an ArithmeticException
        int c = a/b;
        System.out.println(c);
        */

        /*
        double x[] = {32.3,34,4};
        int a = 4;                      //Throws and Infinity.
        double e = x[0]/(a-x[2]);
        System.out.println(e);
        */

       /*
       String str = "Vivek";
        System.out.println(str.charAt(6));         //StringIndexOutOfBoundsException
        */


       /* Object obj = new Object();
        String str = (String)obj;           //ClassCastException
        System.out.println(str);
        */

        /*
        System.out.println("Hello");
        Object obj = null;                    //NullPointerException
        System.out.println(obj.toString());
         */

       /*
       int[] list = {1,23,4,5,6,};
        System.out.println(list[8]);         //ArrayIndexOutOfBoundsException
        */


        /*
        String str = "Vivek Patil ";
        int a  =Integer.parseInt(str);      //NumberFormatException
        System.out.println("  "+a);
        */

        /*
        byte num;
        System.out.println("b cahb");
        num = Byte.parseByte("jdscn");       //NumberFormatException
        System.out.println(" "+num);
        */

        /*
        for(int i = 1;i<=10;i++){
            Thread.sleep(1000);             //InterruptedException
            System.out.println("wjefn");
        }
        */


      /*
       File file = new File("fWJAIJGFN");             //FileNotFoundException.
       FileInputStream stream = new FileInputStream(file);
       */


    }
}
