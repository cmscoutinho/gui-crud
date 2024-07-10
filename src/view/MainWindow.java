package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel buttonPanel;
    private JPanel imagePanel;
    private JLabel mainLabel;
    private Button startButton;
    private Button creditsButton;

    public MainWindow(String title) throws HeadlessException {
        super(title);
        initComponents();
    }

    private void initComponents() {

        this.buttonPanel = new JPanel();
        this.imagePanel = new JPanel();
        this.mainLabel = new JLabel(new ImageIcon(MainWindow.class.getResource("/java_crud_logo_small.png")));

        this.startButton = new Button("Start");
        this.creditsButton = new Button("Credits");

//        this.setLayout(new FlowLayout(FlowLayout.LEFT)); // TODO: check new layouts, such as GridLayout
        this.setLayout(new BorderLayout(10,10));
        this.buttonPanel.setLayout(new FlowLayout());
        this.imagePanel.setLayout(new FlowLayout());

        imagePanel.add(mainLabel);
        buttonPanel.add(startButton);
        buttonPanel.add(creditsButton);

        this.imagePanel.setSize(200, 200);
        this.buttonPanel.setSize(10, 10);

        this.add(imagePanel);
        this.add(buttonPanel);

        this.pack();
        this.setSize(new Dimension(300, 200));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
