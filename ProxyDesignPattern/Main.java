import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.next();
        System.out.print("Enter your password: ");
        String password = sc.next();

        User user = new User(username, password);
        FolderProxy folderProxy = new FolderProxy(user);

        String role = UserAuthentication.authenticate(username, password);
        if (role == null) {
            System.out.println("Authentication failed. Access denied");
            return;
        }

        System.out.println("\nWelcome, " + username + "!");

        while (true) {
            System.out.println("\nEnter the operation you want to perform on folder:");
            System.out.println("1. Create folder");
            System.out.println("2. Copy folder");
            System.out.println("3. Rename folder");
            System.out.println("4. Delete folder");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (folderProxy.isAdmin() || folderProxy.isUser()) {
                        System.out.print("\nEnter folder name to create: ");
                        String createFolderName = sc.next();
                        folderProxy.createFolder(createFolderName);
                    } else {
                        System.out.println("You don't have permission to create folders");
                    }
                    break;
                case 2:
                    if (folderProxy.isAdmin() || folderProxy.isUser()) {
                        System.out.print("\nEnter source folder: ");
                        String sourceFolder = sc.next();
                        System.out.print("Enter destination folder: ");
                        String destinationFolder = sc.next();
                        folderProxy.copyFolder(sourceFolder, destinationFolder);
                    } else {
                        System.out.println("You don't have permission to copy folders");
                    }
                    break;
                case 3:
                    if (folderProxy.isAdmin()) {
                        System.out.print("\nEnter old folder name: ");
                        String oldFolderName = sc.next();
                        System.out.print("Enter new folder name: ");
                        String newFolderName = sc.next();
                        folderProxy.renameFolder(oldFolderName, newFolderName);
                    } else {
                        System.out.println("You don't have permission to rename folders");
                    }
                    break;
                case 4:
                    if (folderProxy.isAdmin()) {
                        System.out.print("\nEnter folder name to delete: ");
                        String deleteFolderName = sc.next();
                        folderProxy.deleteFolder(deleteFolderName);
                    } else {
                        System.out.println("You don't have permission to delete folders");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice");
            }
        }
    }
}
