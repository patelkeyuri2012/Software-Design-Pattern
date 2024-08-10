public class LowerCaseDecorator extends IODecorator {
    public LowerCaseDecorator(IO io) {
        super(io);
    }

    @Override
    public void write(String data) {
        io.write(data.toLowerCase());
    }

    @Override
    public String read() {
        return io.read().toLowerCase();
    }
}
