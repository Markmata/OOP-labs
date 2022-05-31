package shapes;

import java.util.ArrayList;
import java.util.List;

public class Aggregate extends Shape {
    List<Shape> shapes;

    /**
     * Constructs an Aggregate of shapes with the top left point on (x, y). Initially contains no shapes.
     *
     * @param x x coordinate of top left point
     * @param y y coordinate of top left point
     */
    public Aggregate(int x, int y){
        pos_x = x;
        pos_y = y;
        shapes = new ArrayList<Shape>();
    }

    /**
     * Checks if any shape part of the Aggregate has points with vertical coordinate equal to y
     * Features int Array to ArrayList of Integers conversion
     *
     * @param y y coordinate of the intersection line
     */
    public int[] intersection(int y){
        ArrayList<Integer> t = new ArrayList<Integer>();
        int[] tempArray;
        for (Shape s: shapes){
            tempArray = s.intersection(y);
            for (int i = 0; i<tempArray.length; i++){
                t.add(Integer.valueOf(tempArray[i]));
            }
        }
        return t.stream().mapToInt(i -> i).toArray();
    }
    /**
     * Adds Shape s to the Aggregate
     *
     * @param s Shape to add
     */
    public void addShape(Shape s){
        shapes.add(s);
    }


}
