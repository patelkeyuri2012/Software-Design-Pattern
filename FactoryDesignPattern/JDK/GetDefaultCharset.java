import java.nio.charset.Charset;

public class GetDefaultCharset {
    public static void main(String[] args) {
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("Default Charset: " + defaultCharset);
    }
}
