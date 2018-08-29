import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtusername;
    private JPasswordField pwdUserPassword;
    private JButton btnsubmit;
    private JButton btnclear;
    private JPanel MainPanel;

    public Login() {
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtusername.setText(null);
                pwdUserPassword.setText(null);
            }
        });
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtusername.getText()+" " +new String(pwdUserPassword.getPassword()));
            }
        });
    }
    public JPanel getmainPanel(){
        return MainPanel;
    }
}
