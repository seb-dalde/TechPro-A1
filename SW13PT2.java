public class SW13PT2 {
    public static void sayHello(int count) {
        if (count == 0) {
            System.out.println("Done!");
        } else {
            System.out.println("Hello");
            sayHello(count - 1);
        }
    }

    public static void main(String[] args) {
        sayHello(3);
    }
}
