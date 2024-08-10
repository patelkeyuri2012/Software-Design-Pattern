import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Folder implements IFolder {

    private boolean isExists(String folderName) {
        File folder = new File(folderName);
        return folder.exists();
    }

    @Override
    public boolean createFolder(String folderName) {
        File newFolder = new File(folderName);
        if (!isExists(folderName)) {
            if (newFolder.mkdir()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean renameFolder(String oldName, String newName) {
        File oldFolder = new File(oldName);
        File newFolder = new File(newName);
        if (isExists(oldName)) {
            if (oldFolder.renameTo(newFolder)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean copyFolder(String sourceFolder, String destinationFolder) {
        File source = new File(sourceFolder);
        File destination = new File(destinationFolder);

        if (!isExists(sourceFolder)) {
            return false;
        }

        if (!destination.exists()) {
            destination.mkdir();
        }

        try {
            Files.walk(source.toPath())
                    .forEach(sourcePath -> {
                        try {
                            Path destinationPath = destination.toPath().resolve(source.toPath().relativize(sourcePath));
                            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                        } catch (IOException e) {
                            // Do nothing, just ignore the exception
                        }
                    });
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean deleteFolder(String folderName) {
        File folderToDelete = new File(folderName);
        if (isExists(folderName)) {
            if (folderToDelete.isDirectory()) {
                return deleteRecursive(folderToDelete);
            }
        } else {
            return false;
        }
        return false;
    }

    private boolean deleteRecursive(File file) {
        File[] contents = file.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (!deleteRecursive(f)) {
                    return false;
                }
            }
        }
        return file.delete();
    }
}
