package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private Button startButton;
    private Button creditsButton;

    public MainWindow(String title) throws HeadlessException {
        super(title);
        initComponents();
    }

    private void initComponents() {
        this.setSize(new Dimension(500, 400));
        this.setLayout(new GridLayout(2,2,100,100));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        this.startButton = new Button("Start");
        this.creditsButton = new Button("Credits");

        this.add(startButton, 0);
        this.add(creditsButton, 1);

//        this.pack();

    }
}
