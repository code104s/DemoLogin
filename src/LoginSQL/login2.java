package LoginSQL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login2 extends JFrame implements ActionListener {

    private JPanel panel1;
    private JTextField userName;
    private JButton loginButton;
    private JButton resetButton;
    private JCheckBox showPasswordCheckBox;
    private JButton exitButton;
    private JPasswordField passwordField1;
    private JLabel tf1;
    private JPanel tf2;

    public login2() {
        //hien thi panel
        setContentPane(panel1);

        Frame frame = new Frame(""); // them frame messagedialog

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String UserName;
                String PassWord;
                UserName = userName.getText();
                PassWord = passwordField1.getText();
                if(e.getSource() == loginButton) {

                    if (UserName.equalsIgnoreCase("toan") && PassWord.equalsIgnoreCase("123")) {
                        JOptionPane.showMessageDialog(frame, "Loggin Success","",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Wrong input","",JOptionPane.ERROR_MESSAGE);
                    }
                }



            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(e.getSource() == resetButton) {
                   userName.setText("");
                   passwordField1.setText("");
               }
            }
        });
        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == showPasswordCheckBox) {
                    if(showPasswordCheckBox.isSelected()) {
                        passwordField1.setEchoChar((char) 0);
                    } else {
                        passwordField1.setEchoChar('*');
                    }
                }
            }
        });
    }
    //public void addActionEvent() {
        //loginButton.addActionListener(this);
        //resetButton.addActionListener(this);
        //exitButton.addActionListener(this);
        //showPasswordCheckBox.addActionListener(this);
    //}

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    public static void main(String[] args) {
        login2 swing = new login2();

        swing.setTitle("Login Form Demo");
        swing.pack();
        swing.setVisible(true);
        swing.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        swing.setBounds(20,20,500,230);

    }
}
