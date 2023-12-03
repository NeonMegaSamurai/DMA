import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI(){
        setSize(500,500);
        setLocation(500,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel ButtonMenu = new JPanel(new GridLayout(3,1,5,5));
        ButtonMenu.add(new JButton("1"));
        ButtonMenu.add(new JButton("2"));
        ButtonMenu.add(new JButton("3"));

        JPanel front = new JPanel(new FlowLayout(FlowLayout.CENTER));
        front.add(ButtonMenu);

        Container container = getContentPane();
        container.add(front, BorderLayout.SOUTH);
        setVisible(true);
    }
}
