package shapes;

import java.lang.Math;


public class Triangle extends Shape {
    int base;
    int height;

    /**
     * Constructs a Triangle with the bottom left point on (x, y) with base b and height h
     *
     * @param x x coordinate of bottom left point
     * @param y y coordinate of bottom left point
     * @param b base length
     * @param h height
     */
    public Triangle(int x, int y, int b, int h){
        pos_x = x;
        pos_y = y;
        base = b;
        height = h;
    }

    /**
     * Checks if any point in the triangle has y coordinate equal to given y
     * Unfortunately, when printed, triangles look like the typical right angle
     * triangle instead of an isosceles one, which is what I assume is being asked for.
     * They also look smaller than expected. The problem lies in the implementation of this function
     *
     * @param y y coordinate to check
     */
    public int[] intersection(int y){

        //TODO triangle intersection
        int[] a;
        float proportion;
        float intersect_base;
        if (y <= pos_y && y >= pos_y - height + 1){
            proportion = ((float)(y - (pos_y - height + 1)) / (float)(height));
            intersect_base = (float)(base) * proportion;
            a = new int[(int)Math.ceil(intersect_base)];
            //System.out.println(proportion + " " + intersect_base + " " + a.length);
            for (int i = 0; i < a.length; i++){
                a[i] = pos_x + i;
            }
            return a;
        }
        a = new int[0];
        return a;
    }
}
