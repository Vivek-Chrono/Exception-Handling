package exception_handling.exceptionProgramms;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;

public class OverridingRuleOfExce {
    void play() throws IOException{
        throw new IOException("tired,can't play");
    }
}

class Child extends OverridingRuleOfExce{
    @Override
    void play() throws IOException {
        try {
            throw new IOException("Lets play");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("hello");
        }
    }

    public static void main(String[] args) throws IOException {
        Child c = new Child();
        c.play();
    }
}
