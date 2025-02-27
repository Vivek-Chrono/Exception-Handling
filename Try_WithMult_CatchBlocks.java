package exception_handling;


public class Try_WithMult_CatchBlocks {
    public static void main(String[] args) {

        try {
            //System.out.println(1/0.0);
           /* double p = 1;
            System.out.println(p/0);*/
            System.out.println("HII");
            System.out.println(10/0);
            System.out.println("Hello");
            int d = 1;
            System.out.println(d/0);
            System.out.println("Hiii 2");
        }catch (ArithmeticException e) {
            System.out.println("Hello 1");
        } catch (ArrayIndexOutOfBoundsException v) {
            System.out.println("Hello 2");
        } catch (StringIndexOutOfBoundsException B) {
            System.out.println("Hello 3");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("Hello 4");
        } catch (RuntimeException e) {
            System.out.println("Hello 5");
        } catch (Exception e) {
            System.out.println("Hello 6");
        } catch (Throwable e) {
            System.out.println("Hello 7");
        }
    }
}



/*
class A{
    void show(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       try{
           int x = 10/0;
       }
       catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
        A a = null;
       try{
           a.show();
       }
       catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
    }
}
*/

class TryReturnTest4
{
    int m1()
    {
        try {
            System.out.println("I am in try block");
            int x = 10/0;
            return 50;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("I am in catch block");

        }
        finally{
            System.out.println("Hello");
        }
        return 20;
    }
    public static void main(String[] args)
    {
        TryReturnTest4 ft = new TryReturnTest4();
        System.out.println(ft.m1());
    }
}
