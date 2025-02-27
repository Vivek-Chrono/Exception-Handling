package exception_handling.exceptionProgramms;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class OverridingByUsingUnchecked {
    void play()throws ArithmeticException{
        System.out.println("tired ,can't play");
    }
}

class Child2 extends OverridingByUsingUnchecked{
    @Override
    void play() throws NullPointerException {
       throw new NullPointerException("Lets play");
    }

    public static void main(String[] args) {
        OverridingByUsingUnchecked e = new Child2();
        e.play();
    }
}

