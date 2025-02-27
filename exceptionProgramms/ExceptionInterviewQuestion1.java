package exception_handling.exceptionProgramms;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionInterviewQuestion1 {

    public static void multiple() throws NullPointerException,FileNotFoundException,IOException{
        System.out.println("Hello World");

    }
    public static void main(String[] args){
        ExceptionInterviewQuestion1 e = new ExceptionInterviewQuestion1();
        //e.multiple();

       /* try{
            multiple();
        }
        catch (NullPointerException |  IOException ee){
            ee.printStackTrace();
        }*/

        try{
            multiple();
        } catch (NullPointerException ee){
            ee.printStackTrace();
        } catch (FileNotFoundException ee){
            ee.printStackTrace();
        } catch (IOException ee){
            ee.printStackTrace();
        }
    }
}
