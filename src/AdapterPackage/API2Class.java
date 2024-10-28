package AdapterPackage;

/**
 * The API2Class class implements the API2 interface and provides a way to
 * draw a rectangle by specifying two opposite corner points.
 */

public class API2Class implements API2 {
    /**
     * Draws a rectangle using two corner points and prints the details to the console.
     * If x1-x2 = 0 or y1-y2 = 0, print error message.
     *
     * @param x1 the x-coordinate of the first corner point
     * @param y1 the y-coordinate of the first corner point
     * @param x2 the x-coordinate of the second corner point
     * @param y2 the y-coordinate of the second corner point
     */
    @Override
    public void drawAPI2(int x1, int y1, int x2, int y2) {
        if(x1 - x2 != 0 && y1 - y2 != 0) {
            System.out.println("Drawing rectangle using API2 from point 1 (" + x1 +", "+ y1 + ") to point 2 (" + x2 +", "+ y2 + ") \n");
        }
        else {
            System.out.println("Wrong points \n");
        }
    }
}