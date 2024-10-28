package AdapterPackage;

/**
 * The API2 interface provides a method for drawing a rectangle by specifying
 * two corner points.
 */
public interface API2 {
    /**
     * Draws a rectangle using two opposite corner points.
     *
     * @param x1 the x-coordinate of the first corner point
     * @param y1 the y-coordinate of the first corner point
     * @param x2 the x-coordinate of the second corner point
     * @param y2 the y-coordinate of the second corner point
     */
    void drawAPI2(int x1, int y1, int x2, int y2);
}