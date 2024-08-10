public class X {
    private X() {

    }

    static X k = null;

    public static X getInstance() {
        if (k == null) {
            k = new X();
        }
        return k;
    }

    public String getText() {
        return "class x";
    }
}
