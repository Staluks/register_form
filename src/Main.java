import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame layoutFrame =new JFrame("Log in");
        layoutFrame.setBounds(1000, 1000, 1000 , 1000);
        layoutFrame.setLocation(0, 0);


        layoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layoutFrame.setContentPane(new test().getPanel1());
        layoutFrame.setVisible(true);

    }
}