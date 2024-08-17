package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel buttonPanel;
    private JPanel imagePanel;
    private JLabel mainLabel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public MainWindow(String title) {
        this.setTitle(title);
        this.buttonPanel = new JPanel();
        this.imagePanel = new JPanel();
        this.mainLabel = new JLabel(new ImageIcon(MainWindow.class.getResource("/java_crud_logo_small.png")));

        this.loginField = new JTextField(15);
        this.passwordField = new JPasswordField(15);
        this.loginButton = new JButton("Login");

        this.setLayout(new BorderLayout(10, 10));
        this.buttonPanel.setLayout(new GridLayout(3, 2, 5, 5));  // Arrange login, password, and button in a grid layout
        this.imagePanel.setLayout(new FlowLayout());

        imagePanel.add(mainLabel);

        buttonPanel.add(new JLabel("Login:"));
        buttonPanel.add(loginField);
        buttonPanel.add(new JLabel("Password:"));
        buttonPanel.add(passwordField);
        buttonPanel.add(new JLabel()); // Empty cell for layout adjustment
        buttonPanel.add(loginButton);

        this.add(imagePanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.CENTER);

        this.pack();
        this.setSize(new Dimension(400, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow("GUI Crud"));
    }
}
