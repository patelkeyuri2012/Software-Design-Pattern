public class Y {
    public static void main(String[] args) {

        X x1, x2;
        x1 = X.getInstance();
        x2 = X.getInstance();
        System.out.println(x1);
        System.out.println(x2);

    }

}
