public class ReverseDecorator extends IODecorator {
    public ReverseDecorator(IO io) {
        super(io);
    }

    @Override
    public void write(String data) {
        StringBuilder reversedData = new StringBuilder(data);
        io.write(reversedData.reverse().toString());
    }

    @Override
    public String read() {
        String data = io.read();
        StringBuilder reversedData = new StringBuilder(data);
        return reversedData.reverse().toString();
    }
}
