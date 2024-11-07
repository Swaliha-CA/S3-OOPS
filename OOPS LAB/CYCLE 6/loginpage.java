import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginUI implements ActionListener {
    JFrame frame;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton submitButton, clearButton;

    LoginUI() {
        frame = new JFrame("Login");

        JLabel usernameLabel = new JLabel("USERNAME:");
        usernameField = new JTextField(15);
        
        JLabel passwordLabel = new JLabel("PASSWORD:");
        passwordField = new JPasswordField(15);
        
        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(clearButton);
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            usernameField.setText("");
            passwordField.setText("");
        } else if (e.getSource() == submitButton) {
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();
            
            if (validateCredentials(username, password)) {
                showWelcomePage();
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean validateCredentials(String username, char[] password) {
        
        return username.equals("Swaliha") && String.valueOf(password).equals("password");
        
    }

    private void showWelcomePage() {
        frame.getContentPane().removeAll();
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();

        JLabel welcomeLabel = new JLabel("Welcome!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(welcomeLabel);
        
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginUI();
    }
}
