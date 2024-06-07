package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(String title) throws HeadlessException {
        super(title);
        this.setSize(new Dimension(500, 400));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
