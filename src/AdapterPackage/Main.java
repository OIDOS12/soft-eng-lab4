package AdapterPackage;

/**
 * Main class that represents a client-side application, demonstrates the use of adapters.
 */
public class Main {
    /**
     * The entry point of the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        API1 rectangle = new API1Class();
        rectangle.drawAPI1(10, 5, 10, 5);

        API2 rectangle2 = new AdapterAPI1toAPI2(rectangle);
        rectangle2.drawAPI2(10, 5, 20, 10);

        API2 rectangle3 = new API2Class();
        rectangle3.drawAPI2(25, 35, 45, 45);

        API1 rectangle4 = new AdapterAPI2toAPI1(rectangle3);
        rectangle4.drawAPI1(25, 35, 20, 10);
    }
}