import javax.swing.*;

public class Main {
    public static void main (String[]args){
        JFrame frame = new JFrame();
        Login LoginPanel = new Login();
        frame.setContentPane(LoginPanel.getmainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
