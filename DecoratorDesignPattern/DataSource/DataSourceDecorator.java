public abstract class DataSourceDecorator implements DataSource {
    private DataSource file;

    public DataSourceDecorator(DataSource source) {
        this.file = source;
    }

    @Override
    public void writeData(String data) {
        file.writeData(data);
    }

    @Override
    public String readData() {
        return file.readData();
    }
}
