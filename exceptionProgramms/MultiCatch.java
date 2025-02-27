package exception_handling.exceptionProgramms;

public class MultiCatch {
    public static void main(String[] args) {
        String s = "Vivek patil";
        int[] a ={1,2,3,4,5};

        try {
            int b = 6;
            System.out.println(a[b]);
            s = null;
            int alength = s.length();
            System.out.println(alength);
        }
        catch (ArrayIndexOutOfBoundsException ep){
            System.out.println("Exception caught "+ep.toString());
        }
        catch (NullPointerException e){
            System.out.println("Exception caught "+e.toString());
        }
    }
}
