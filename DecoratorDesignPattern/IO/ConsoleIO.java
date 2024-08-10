import java.io.*;

public class ConsoleIO implements IO {
    @Override
    public void write(String data) {
        System.out.print(data);
    }

    @Override
    public String read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
