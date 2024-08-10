import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        String csvFilePath = "userdata.txt";
        FileManager fileManager = new FileManager();
        Authenticator authenticator = new Authenticator(csvFilePath);
        CMSFacade cms = new CMSFacade(fileManager, authenticator);

        if (!cms.login(username, password)) {
            System.out.println("\nLogin failed\n");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\n1. Read data");
            System.out.println("2. Write data");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nEnter file name to read content: ");
                    String readFile = scanner.next();
                    File fileToRead = new File(readFile);

                    if (!fileToRead.exists()) {
                        System.out.println("File does not exist.");
                    } else {
                        System.out.print("File content is: ");
                        cms.readFile(readFile);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter file name to write content: ");
                    String writeFile = scanner.next();

                    try {
                        File fileToWrite = new File(writeFile);
                        if (!fileToWrite.exists()) {
                            fileToWrite.createNewFile();
                        }

                        System.out.print("Enter content to write to file: ");
                        String content = scanner.next();
                        cms.writeFile(writeFile, content);
                        System.out.println("Content written into file");
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}
