package main;
import lab3.Complex;

public class Main {
    public static void main(String[] args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 1);
        Complex c3 = new Complex(1, 2);

        System.out.println("c1: " + c1 + " // c2: " + c2);
        System.out.println("c1 + c2: " + c1.add(c2));
        System.out.println("c1 - c2: " + c1.subtract(c2));
        System.out.println("c1 * c2: " + c1.multiply(c2));

        System.out.println(c3.equals(c1));
    }
}
