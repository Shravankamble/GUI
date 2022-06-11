import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class name implements ActionListener {

    private static JLabel label;
    private static JTextField userChar;
    private static JButton button;
    private static JLabel asciiValue;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("Enter a char : ");
        label.setBounds(10,20,80,25);
        panel.add(label);

        userChar = new JTextField(1);
        userChar.setBounds(100,20,165,25);
        panel.add(userChar);

        button = new JButton("submit");
        button.setBounds(100,80,80,25);
        button.addActionListener(new name());
        panel.add(button);

        asciiValue = new JLabel("");
        asciiValue.setBounds(15,110,300,25);
        panel.add(asciiValue);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userChar.getText();
        System.out.println("char = " + user);
        for (int i = '!'; i < '~'; i++) {
            if (i == user.charAt(0)) {
                asciiValue.setText("the ascii value of the given char is : " + i);
            }
        }
    }
}

