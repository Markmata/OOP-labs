package shapes;
import java.lang.Math;


public class Circle extends Shape {
    int radius;

    /**
     * Constructs a Circle with center on (x, y) with radius r
     *
     * @param x x coordinate of center
     * @param y y coordinate of center
     * @param r circle radius
     */
    public Circle(int x, int y, int r){
        pos_x = x;
        pos_y = y;
        radius = r;
    }

    /**
     * Checks if any point in the circle has y coordinate equal to given y
     * Unfortunately, when printed, circles look like Diamonds instead of actual circles.
     * The problem lies in the implementation of this function.
     *
     * @param y y coordinate to check
     */
    public int[] intersection(int y){
        //TODO circle intersection
        int[] a;
        if (y >= pos_y - radius && y <= pos_y + radius){
            int shift = Math.abs(pos_y - y);
            a = new int[1 + (radius - shift)*2];
            for (int i = 0; i < a.length; i++){
                a[i] = pos_x + shift + i;
            }
            return a;
        }
        a = new int[0];
        return a;
    }
}
