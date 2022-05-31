package shapes;

public abstract class Shape {
    int pos_x;
    int pos_y;

    /* Constructor */
    public Shape(int x, int y){
        pos_x = x;
        pos_y = y;
    }

    public Shape(){
        //IntelliJ kept complaining the Shape class did not have a default Constructor
    }

    public abstract int[] intersection(int y);
}
