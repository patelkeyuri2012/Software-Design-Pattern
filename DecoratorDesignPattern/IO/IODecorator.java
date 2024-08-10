public abstract class IODecorator implements IO {
    protected IO io;

    public IODecorator(IO io) {
        this.io = io;
    }

    @Override
    public void write(String data) {
        io.write(data);
    }

    @Override
    public String read() {
        return io.read();
    }
}
