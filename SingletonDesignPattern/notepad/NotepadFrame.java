import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NotepadFrame extends JFrame {

    private static NotepadFrame notepad = null;
    private JTextArea textArea;

    private NotepadFrame() {
        setTitle("Notepad");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new SaveActionListener());
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }

    public static synchronized NotepadFrame getInstance() {

        if (notepad == null) {
            notepad = new NotepadFrame();
        }
        return notepad;
    }

    private class SaveActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(NotepadFrame.this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                // String content = textArea.getText();
                JOptionPane.showMessageDialog(NotepadFrame.this, "Content saved successfully!");
            }
        }
    }

}
