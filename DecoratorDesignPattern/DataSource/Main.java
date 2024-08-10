import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input file name with extension: ");
        String inputFile = sc.next();

        String data = "Let's start to learn Decorator Design Pattern";

        System.out.println("\nOriginal Data: " + data);

        DataSource encryptionDecorator = new EncryptionDecorator(new FileDataSource(inputFile));
        encryptionDecorator.writeData(data);
        String encryptionData = encryptionDecorator.readData();
        System.out.print("\nEncryption Data: ");
        System.out.println(encryptionData);

        DataSource decryptionDecorator = new DecryptionDecorator(new FileDataSource(inputFile));
        decryptionDecorator.writeData(encryptionData);
        String decryptionData = decryptionDecorator.readData();
        System.out.print("Decryption Data: ");
        System.out.println(decryptionData);

        System.out.print("\nEnter compressed file name with .zip extension: ");
        String compressedFile = sc.next();
        DataSource compressionDecorator = new CompressionDecorator(new FileDataSource(inputFile),
                inputFile,
                compressedFile);
        compressionDecorator.writeData(data);
        String compressionData = compressionDecorator.readData();
        System.out.print("\nCompressed Data: ");
        System.out.println(compressionData.length() + " byte\n");

        DataSource countWordDecorator = new CountWordDecorator(new FileDataSource(inputFile));
        countWordDecorator.writeData("");
        String countWordData = countWordDecorator.readData();
        System.out.print("Word Count: ");
        System.out.println(countWordData + "\n");
    }
}
