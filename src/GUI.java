import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI(){
        setSize(500,200);
        setLocation(500,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel ButtonMenu = new JPanel(new GridLayout(3,1,5,5));
        ButtonMenu.add(new JButton("Products"));
        ButtonMenu.add(new JButton("Availability of products"));
        ButtonMenu.add(new JButton("Sales statistics"));

        JPanel TextMenu = new JPanel(new GridLayout(2,1,5,5));
        TextMenu.add(new JLabel("Hello!"));
        TextMenu.add(new JLabel("Successful work. Select the one you need"));

        JPanel front = new JPanel(new FlowLayout(FlowLayout.CENTER));
        front.add(ButtonMenu);
        JPanel front1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        front1.add(TextMenu);

        Container container = getContentPane();
        container.add(front, BorderLayout.SOUTH);
        container.add(front1, BorderLayout.NORTH);

        setVisible(true);
    }
}
