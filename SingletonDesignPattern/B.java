public class B {
    public static void main(String[] args) {
        A a1, a2, a3;

        a1 = A.getInstance();
        a2 = A.getInstance();
        a3 = A.getInstance();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
