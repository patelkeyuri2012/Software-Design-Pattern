public interface IFolder {

    public boolean createFolder(String folderName);

    public boolean renameFolder(String oldName, String newName);

    public boolean copyFolder(String sourceFolder, String destinationFolder);

    public boolean deleteFolder(String folderName);
}
