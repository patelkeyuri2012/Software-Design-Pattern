public class UpperCaseDecorator extends IODecorator {
    public UpperCaseDecorator(IO io) {
        super(io);
    }

    @Override
    public void write(String data) {
        io.write(data.toUpperCase());
    }

    @Override
    public String read() {
        return io.read().toUpperCase();
    }
}
