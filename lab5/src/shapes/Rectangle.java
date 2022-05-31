package shapes;



public class Rectangle extends Shape {
    int height;
    int width;

    /**
     * Constructs a Rectangle with the top left point on (x, y) with width w and height h
     *
     * @param x x coordinate of top left point
     * @param y y coordinate of top left point
     * @param w width
     * @param h height
     */
    public Rectangle(int x, int y, int w, int h){
        pos_x = x;
        pos_y = y;
        width = w;
        height = h;
    }

    /**
     * Checks if any point in the rectangle has y coordinate equal to given y
     * Unlike the circle and triangle intersection method, this one is pretty simple
     * and works as expected.
     *
     * @param y y coordinate to check
     */
    public int[] intersection(int y){
        int[] a;
        if (y >= pos_y && y <= pos_y + height - 1){
            a = new int[width];
            for (int i = 0; i < a.length; i++){
                a[i] = pos_x + i;
            }
            return a;
        }
        a = new int[0];
        return a;
    }
}
