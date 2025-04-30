

public class Main {
    public static void main(String[] args) throws Exception {
        Plane test = new Plane("test", 1, 10, 200.0, 0.5, 0, "ground");

        test.fly(10);

        test.ascend(100);

        test.fly(10);
    }
}
