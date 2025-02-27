package exception_handling;

/*
class Test{
    public static void main(String[] args) {
        int x = 10,y = 0;

        System.out.println("123");
        try{
            System.out.println("123e");
            System.out.println("fFads");
            try{
                int c = 10/0;
                System.out.println(c);
            } catch (RuntimeException e) {
                System.out.println("Inside catch block");
            }
        }
        catch (RuntimeException d){
            System.out.println("Another");
        }
        */
/*catch (ArithmeticException ee){
            System.out.println("Inside another catch block");
        }*//*

        System.out.println("Executed");
    }
}*/

/*class Test{
    public static void main(String[] args) {
        System.out.println("111");
        try{
            System.out.println("213");
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Inside Catch Block");
        }
        finally {
            System.out.println("This is finally Block");
            try{
                System.out.println("Vivek");
                int b = 20/0;

            }
            catch(ArithmeticException b){
                System.out.println("21e1");
            }
        }
    }
}
*/

class Test{
    public static void main(String[] args) {
        try{
            Class c = Class.forName("CustomImmutable");
        }
        catch (Exception e){
            System.out.println("Hello");
        }
    }
}