package exception_handling;

class NumberFormatExceptio {
    public static void main(String[] args) {
        try{
            String s1 = "Java";
            System.out.println(s1);
            int a = Integer.parseInt(s1);
            System.out.println("Value of a "+a);
        }
        catch(NumberFormatException e ){
            System.out.println("Hello");
        }
    }
}

