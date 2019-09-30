import javax.swing.*;
import java.awt.*;

public class GUIFrame extends JFrame {
    public GUIFrame(){
        setSize(500,300);
        setTitle("GUI Frame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GUIFrame();
    }
}
