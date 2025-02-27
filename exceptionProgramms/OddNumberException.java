package exception_handling.exceptionProgramms;

public class OddNumberException {
    public static void main(String[] args) {
        int n = 28;
        trynumber(n);
        n = 7;
        trynumber(n);
    }
    public static void trynumber(int n){
        try{
            checkevennum(n);
            System.out.println(n+" Even number");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void checkevennum(int num){
        if(num % 2 != 0){
            throw new IllegalArgumentException(num +" is odd");
        }
    }
}
