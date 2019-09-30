import javax.swing.*;
import java.awt.*;

public class MYFrame extends JFrame {

    public MYFrame(){

        setSize(500,300);
        setVisible(true);
        setTitle("First GUI");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MYFrame();

    }
}
