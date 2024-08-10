public class DecryptionDecorator extends DataSourceDecorator {
    public DecryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(decrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String decrypt(String data) {
        StringBuilder decryptedData = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            decryptedData.append((char) (c - 1));
        }
        return decryptedData.toString();
    }
}
