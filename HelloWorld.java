public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World!");
        try {
            int i = 1 / 0;
            System.out.println(i);
        } catch (Exception e) {
        }
    }

}
