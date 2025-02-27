//Programm 1;
package exception_handling;
/*
class NumSmallOrBig{
    public static void main(String[] args) {
        try{
            int a = 11;
            if(a<10)
            throw new RuntimeException("Initial a Value is less than 10");
            else{
                System.out.println("Initial a Value is greater than 10");
            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
    }
}*/

//Programm 2
/*
class Test{
    public static void main(String[] args) {
        for(int i = 1;i<=10;i++){
            System.out.println(" "+i);
        }
        try{
            int a = 20;
            int b = 0;
            int c  = a/b;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}*/


//Programm 3
/*
class Test{
    public static void main(String[] args) {
        System.out.println("111");
        try {
            int a = 10 / 0;
            System.out.println(" "+a);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}*/
//Programm 4

class Test1{
    int a = 10,b = 0;

    void show(){
        System.out.println("Instance Method");
        try{
            System.out.println("Try block");
            int c = a/b;
            System.out.println(" "+c);
        }
        catch(NullPointerException e){
            System.out.println("Catch Block");
        }
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.show();
    }
}


//Throws keyword

/*class Test{
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
    }
}*/
/*
class Test{
    public static void main(String[] args) throws InterruptedException{
        dostuff();
    }

    public static void dostuff(){
        doMoreStuff();
    }

    public static void doMoreStuff() {
        Thread.sleep(1000);
    }
}*/

/*
class Test{
    public static void main(String[] args) {
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println();
        }
    }
}*/