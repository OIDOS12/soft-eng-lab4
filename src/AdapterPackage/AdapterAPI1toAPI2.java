package AdapterPackage;

/**
 * The AdapterAPI1toAPI2 class adapts an API1 instance to behave as an API2 instance,
 * allowing rectangles to be drawn using API1 coordinates but accessed via API2.
 */

public class AdapterAPI1toAPI2 implements API2{
    private API1 api1;

    /**
     * Constructs an adapter for an API1 instance to be used as API2.
     *
     * @param api1 the API1 instance to adapt
     */

    public AdapterAPI1toAPI2(API1 api1) {
        this.api1 = api1;
    }
    /**
     * Converts corner points to width and height and draws the rectangle using API1.
     *
     * @param x1 the x-coordinate of the first corner point
     * @param y1 the y-coordinate of the first corner point
     * @param x2 the x-coordinate of the second corner point
     * @param y2 the y-coordinate of the second corner point
     */
    @Override
    public void drawAPI2(int x1, int y1, int x2, int y2){
        System.out.println("AdapterAPI1toAPI2:");
        int width = x2 - x1;
        int height = y2 - y1;
        api1.drawAPI1(x1, y1, width, height);
    }
}

