package exception_handling;

public class Nested_TryBlock {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            try{
                System.out.println("Hello 1");
                int x = 10/0;
                System.out.println("Hello 2");
            }
            catch(ArithmeticException e){
                System.out.println("Inside catch Block");
            }
            int c = 10/0;
            System.out.println(c);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Insdie another catch Block");
        }
    }
}


 class FinallyReturn2 {
    int m1()
    {
        try {
            System.out.println("I am in try block");
            int x = 10/0;
            System.out.println("Result: " +x);
        }
        catch(ArithmeticException ae)
        {
            System.out.println("I am in catch block");
            return 30;
        }
        finally {
            System.out.println("I am in finally block");
            return 50;
        }
    }
    public static void main(String[] args)
    {
        FinallyReturn2 obj = new FinallyReturn2();
        System.out.println(obj.m1());
    }
}
