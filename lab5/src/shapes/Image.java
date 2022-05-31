package shapes;

import java.util.ArrayList;
import java.util.List;

public class Image {
    int width;
    int height;

    List<Shape> shapes;

    /**
     * Constructs an Image with width w and height h
     *
     * @param w width
     * @param h height
     */
    public Image(int w, int h){
        width = w;
        height = h;
        shapes = new ArrayList<Shape>();
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i < height; i++){
            s = s + line(i);
        }
        return s;
    }

    /**
     * Adds Shape s to the Image
     *
     * @param s Shape to add
     */
    public void addShape(Shape s){
        shapes.add(s);
    }

    /**
     * Returns a string of points belonging to shapes that intersect with a line with y = given y
     * Features int Array to ArrayList of Integers conversion
     *
     * @param y y coordinate of the line being checked
     */
    public String line(int y){
        String l = "";
        ArrayList<Integer> intersections = new ArrayList<Integer>();
        int[] tempArray;
        for (Shape s: shapes){
            tempArray = s.intersection(y);
            for (int i = 0; i < tempArray.length; i++){
                intersections.add(Integer.valueOf(tempArray[i]));
            }
        }
        for (int i = 0; i < width; i++){
            if (intersections.contains(i)){
                l = l + "*";
            }
            else{
                l = l + " ";
            }
        }
        return l + "\n";
    }
}
