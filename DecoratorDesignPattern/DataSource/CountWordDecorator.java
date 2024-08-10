public class CountWordDecorator extends DataSourceDecorator {
    public CountWordDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        String data = super.readData();
        int wordCount = countWords(data);
        return "" + wordCount;
    }

    private int countWords(String data) {
        String[] words = data.split("\\s+");
        return words.length;
    }
}
