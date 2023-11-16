package nhlstenden.oopsubstitute23.ui;

import nhlstenden.oopsubstitute23.arithmatic.TaxCalculator;
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

        add(panel, BorderLayout.WEST);// Add the panel to the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stop running when window is closed
        setSize(600, TaxCalculator.windowHeight());// window dimensions
        setVisible(true);// make window visible to user

        textArea.setText(TaxCalculator.calculateTaxes()); //add text to window
    }}