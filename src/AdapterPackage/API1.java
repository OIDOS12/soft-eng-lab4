package AdapterPackage;

/**
 * API1 interface provides a method for drawing a rectangle by specifying
 * its position and dimensions.
 */
public interface API1 {
    /**
     * Draws a rectangle based on its top-left corner, width, and height.
     *
     * @param x the x-coordinate of the corner
     * @param y the y-coordinate of the corner
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    void drawAPI1(int x, int y, int width, int height);
}