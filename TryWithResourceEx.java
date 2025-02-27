package exception_handling;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class TryWithResourcesExample {
    public static void main(String[] args) {
        // File path (Make sure the file exists)
        String filePath = "sample.txt";

        // Try-with-resources ensures automatic resource closure
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}*/


import java.sql.Connection;

/*class MyResource  {
    public MyResource() {
        System.out.println("Resource Opened");
    }

    public void doSomething() {
        System.out.println("Using Resource");
    }


    @Override
    public void close() {
        System.out.println("");
    }
}

class TryWithResourcesCustomExample {
    public static void main(String[] args) {
        // Try-with-resources block
        try (MyResource resource = new MyResource()) {

           try {

           } catch (Exception e) {
               throw new RuntimeException(e);
           }
            MyResource r1 = null;
            r1.doSomething();
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}*/
