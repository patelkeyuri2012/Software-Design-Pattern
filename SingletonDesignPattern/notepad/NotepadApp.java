import java.util.Scanner;

public class NotepadApp {
    public static void main(String[] args) {

        NotepadFrame frame = null;
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.print("1. Open Notepad   2. Exit  :   ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    frame = NotepadFrame.getInstance();
                    frame.setVisible(true);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    return;
            }
        }
    }
}