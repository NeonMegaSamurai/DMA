import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public GUI(){
        setSize(500,200); //Set icon
        setLocation(500,250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        JPanel ButtonMenu = new JPanel(new GridLayout(3,1,5,5)); //Set Button table
        JButton Prod = new JButton("Products");
        JButton Availability = new JButton("Availability of products");
        JButton Sales = new JButton("Sales statistics");
        ButtonMenu.add(Prod);
        ButtonMenu.add(Availability);
        ButtonMenu.add(Sales);



        JPanel TextMenu = new JPanel(new GridLayout(2,1,5,5)); //Set Menu Text
        TextMenu.add(new JLabel("Hello!"));
        TextMenu.add(new JLabel("Successful work. Select the one you need"));

        JPanel front = new JPanel(new FlowLayout(FlowLayout.CENTER));//Placing elements in a window
        front.add(ButtonMenu);
        JPanel front1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        front1.add(TextMenu);

        Container container = getContentPane();//Displaying containers in a window
        container.add(front, BorderLayout.SOUTH);
        container.add(front1, BorderLayout.NORTH);

        setVisible(true);
    }
}
