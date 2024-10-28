package AdapterPackage;

/**
 * The AdapterAPI2toAPI1 class adapts an API2 instance to behave as an API1 instance,
 * allowing rectangles to be drawn using API2 coordinates but accessed via API1.
 */

public class AdapterAPI2toAPI1 implements API1 {
    private API2 api2;

    /**
     * Constructs an adapter for an API2 instance to be used as API1.
     *
     * @param api2 the API2 instance to adapt
     */

    public AdapterAPI2toAPI1(API2 api2) {
        this.api2 = api2;
    }

    /**
     * Converts the width, and height to corner points and
     * draws the rectangle using API2.
     *
     * @param x the x-coordinate of the top-left corner
     * @param y the y-coordinate of the top-left corner
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */

    @Override
    public void drawAPI1(int x, int y, int width, int height){
        System.out.println("AdapterAPI2toAPI1:");
        int x2 = x + width;
        int y2 = y + height;
        api2.drawAPI2(x, y, x2, y2);
    }
}
