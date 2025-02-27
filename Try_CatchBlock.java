package exception_handling;

import java.sql.SQLOutput;

public class Try_CatchBlock {

    String name= "Vivek";
    void show(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        Try_CatchBlock ex = new Try_CatchBlock();
        ex.show();
        System.out.println("Hello1");
        try{
            ex=null;
            System.out.println("Value of string is "+ex.name);
        }
        catch (NullPointerException e){
            System.out.println("This is catch block"+e.getMessage());
        }
    }
    void display(){
        System.out.println("Hello2");
    }
}
