import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    private JPanel panel1;
    public JPanel getPanel1(){
        return panel1;
    }
    private JTextField userTextField;

    private JTextField cityTextField;
    private JTextField passwordTextField;
    private JTextField streetTextField;
    private JButton submitButton;
    private JTextField emailTextField;
    private JTextField phoneTextField;
    private JTextField countryTextField;
    private JLabel emailOut;
    private JLabel phoneOut;
    private JLabel countryOut;
    private JLabel cityOut;
    private JLabel streetOut;
    private JLabel genderOut;
    private JLabel paaswordOut;

    private JLabel userOut;
    private JComboBox comboBox1;

    public test() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userOut.setText("User: " + userTextField.getText().toString());
                userTextField.setText("");
                cityOut.setText("City: " + cityTextField.getText().toString());
                cityTextField.setText("");
                phoneOut.setText("Phone: " + phoneTextField.getText().toString());
                phoneTextField.setText("");
                emailOut.setText("Email: " + emailTextField.getText().toString());
                emailTextField.setText("");
                countryOut.setText("Country: " + countryTextField.getText().toString());
                countryTextField.setText("");
                streetOut.setText("Street: " + streetTextField.getText().toString());
                streetTextField.setText("");
                genderOut.setText("Gender: " + comboBox1.getSelectedItem().toString());
                comboBox1.setSelectedIndex(0);
                paaswordOut.setText("Password: " + passwordTextField.getText().toString());
                passwordTextField.setText("");
            }
        });
    }
}
