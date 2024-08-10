public class MyThread {

    static Thread t = null;

    public static synchronized Thread getThread() {
        if (t == null) {
            t = new Thread();
            return t;
        }
        return t;
    }
}
