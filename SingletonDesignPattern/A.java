public class A {
    public A() {

    }

    private static int instanceCount = 0;
    private static A k1 = null;

    public static A getInstance() {
        if (instanceCount < 2) {
            k1 = new A();
            instanceCount++;
            return k1;
        }
        return k1;
    }
}
