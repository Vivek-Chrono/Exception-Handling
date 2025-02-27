package exception_handling;

import java.util.Scanner;

public class ExceptionExampes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two integers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a/b);
    }

}
 class ExceptionExampess{
    public static void main(String args[]){
        int[] arr = new int[4];
        try{
            int i = arr[4];
            System.out.println("Exception ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.getMessage();

            System.out.println("Exception is  handled");
        }
        finally {
            System.out.println("Print finally block");
        }
    }

}
/*
class Test{
    public static void main(String[] args) {
        try{
            int a = 19;
            int b =0;
            int c =a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}*/
/*
class Test{
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3,4};
            System.out.println(a[6]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}*/


