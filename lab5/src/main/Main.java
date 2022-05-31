package main;

import shapes.*;

public class Main {
    public static void main(String[] args){
        Image im = new Image(20, 25);
        Circle r1 = new Circle(2, 6, 4);
        Rectangle r2 = new Rectangle(6, 6, 4, 5);
        Rectangle r3 = new Rectangle(4, 16, 4, 5);
        Triangle t1 = new Triangle(15, 8, 8, 6);

        Aggregate a1 = new Aggregate(0, 0);
        a1.addShape(r1);
        a1.addShape(r2);

        im.addShape(a1);
        im.addShape(r3);
        im.addShape(t1);

        /*int[] a = a1.intersection(2);

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }*/

        System.out.println(im);
    }
}
