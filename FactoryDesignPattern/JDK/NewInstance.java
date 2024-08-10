public class NewInstance {
    public static void main(String[] args) throws Exception {
        Object object = String.class.newInstance();
        System.out.println("New instance of String created: " + object);
    }
}
