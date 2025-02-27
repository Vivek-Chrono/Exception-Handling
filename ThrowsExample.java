package exception_handling;

public class ThrowsExample {

    void Show(ThrowsExample a){
        a.display();
        System.out.println("This is first method");
    }

    public static void main(String[] args) {
        ThrowsExample obb = new ThrowsExample();
        obb = null ;
        System.out.println("This is main Method");
    }

    void display(){
        System.out.println("This is display method");
    }
}


class A{
    int a = 100;

    void test(){
        System.out.println("Called method");
    }
    public static void main(String[] args) {
        A a = null;

        if(a == null){
            a = new A();
            System.out.println(a.a);
        }
        a.test();
    }
}