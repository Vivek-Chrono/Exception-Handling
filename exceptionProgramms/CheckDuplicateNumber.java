package exception_handling.exceptionProgramms;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Integer.parseInt;

class DuplicateNumberException extends RuntimeException{
    public DuplicateNumberException(String message) {
        super(message);
    }
}

class UniqueNumberChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        LinkedList<Integer> l = new LinkedList<>();

        for(String s : sc.nextLine().split(" ")){
            int num  = Integer.parseInt(s);
            if(l.contains(num)){
                throw new DuplicateNumberException("Duplicate Occurs "+num);
            }
            l.add(num);
        }
        System.out.println("All the numbers are unique");
    }
}