import java.io.*;
import java.util.zip.*;

public class CompressionDecorator extends DataSourceDecorator {

    private String inputFile;
    private String compressedFile;

    public CompressionDecorator(DataSource dataSource, String inputFile, String compressedFile) {
        super(dataSource);
        this.inputFile = inputFile;
        this.compressedFile = compressedFile;
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
        compress();
    }

    private void compress() {
        try (FileInputStream inputStream = new FileInputStream(inputFile);
                FileOutputStream outputStream = new FileOutputStream(compressedFile);
                ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream)) {

            zipOutputStream.putNextEntry(new ZipEntry(new File(inputFile).getName()));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }

            zipOutputStream.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
