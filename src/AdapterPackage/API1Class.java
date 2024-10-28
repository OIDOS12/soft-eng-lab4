package AdapterPackage;

/**
 * The API1Class class implements the API1 interface and provides a way to
 * draw a rectangle by specifying its position and dimensions.
 */

public class API1Class implements API1 {
    /**
     * Draws a rectangle based on corner, width, and height,
     * and prints the details to the console.
     * If width = 0 or height = 0, print error message.
     *
     * @param x the x-coordinate of the corner
     * @param y the y-coordinate of the corner
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    @Override
    public void drawAPI1(int x, int y, int width, int height){
        if(width != 0 && height != 0){
            System.out.println("Drawing rectangle using API1 on (" + x + ", " + y + "), " + "with width " + width + ", " + "and height " + height + "\n");
        }
        else{
            System.out.println("Wrong height or width \n");
        }
    }
}
