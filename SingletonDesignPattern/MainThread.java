public class MainThread {
    public static void main(String[] args) {

        Thread t1, t2;

        t1 = MyThread.getThread();
        t2 = MyThread.getThread();
        System.out.println(t1);
        System.out.println(t2);
    }
}