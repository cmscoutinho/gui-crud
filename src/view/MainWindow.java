package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JPanel imagePanel;
    private JLabel mainLabel;
    private Button startButton;
    private Button creditsButton;

    public MainWindow(String title) throws HeadlessException {
        super(title);
        initComponents();
    }

    private void initComponents() {

        this.mainPanel = new JPanel();
        this.imagePanel = new JPanel();
        this.mainLabel = new JLabel("BEM-VINDO(A)!");
        this.startButton = new Button("Start");
        this.creditsButton = new Button("Credits");

        this.setLayout(new GridLayout(2, 1));
        this.mainPanel.setLayout(new FlowLayout());
        this.imagePanel.setLayout(new FlowLayout());

        imagePanel.add(mainLabel);
        mainPanel.add(startButton);
        mainPanel.add(creditsButton);

        this.add(imagePanel);
        this.add(mainPanel);

        mainPanel.setSize(new Dimension(200, 100));

        this.pack();
        this.setSize(new Dimension(300, 200));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }
}
