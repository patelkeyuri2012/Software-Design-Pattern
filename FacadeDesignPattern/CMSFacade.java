public class CMSFacade {
    private FileManager fileManager;
    private Authenticator authenticator;

    public CMSFacade(FileManager fileManager, Authenticator authenticator) {
        this.fileManager = fileManager;
        this.authenticator = authenticator;
    }

    public void readFile(String filename) {
        fileManager.readFile(filename);
    }

    public void writeFile(String filename, String content) {
        fileManager.writeFile(filename, content);
    }

    public boolean login(String username, String password) {
        return authenticator.authenticate(username, password);
    }
}
