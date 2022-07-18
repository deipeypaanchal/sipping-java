import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingBasics extends JFrame {
    private JPanel panelMain;
    private JTextField textField1;
    private JButton clickMeButton;


    public SwingBasics() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickMeButton, "Hello, " + textField1.getText().toUpperCase() + "!!!");
            }
        });
    }

    public static void main(String[] args) {
        SwingBasics s = new SwingBasics();

        s.setContentPane(s.panelMain);
        s.setTitle("Get Lucky");
        s.setBounds(400,400,400,400);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
