import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class GUIWindow extends JFrame {

    private JTextArea textArea;

    public GUIWindow() {
        super("Tax Evaluation"); // Set the title of the window
        JPanel panel = new JPanel(); // Create a panel to hold components

        textArea = new JTextArea();// Create a JTextArea to display text
        panel.add(textArea);

        add(panel, BorderLayout.CENTER);// Add the panel to the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stop running when window is closed
        setSize(400, 300);// window dimensions
        setVisible(true);// make window visible to user

        textArea.setText("Total Tax: ");
    }}