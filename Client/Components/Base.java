package Client.Components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Base {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set the look and feel to Nimbus for a modern appearance
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame("Login Page");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new GridLayout(4, 2));

            JLabel usernameLabel = new JLabel("Username:");
            JTextField usernameField = new JTextField();

            JLabel passwordLabel = new JLabel("Password:");
            JPasswordField passwordField = new JPasswordField();

            JButton loginButton = new JButton("Login");

            JButton registerButton = new JButton("Don't have an account? Register");
            registerButton.setForeground(Color.BLUE);
            registerButton.setBorderPainted(false);
            registerButton.setContentAreaFilled(false);
            registerButton.setFocusPainted(false);
            registerButton.setOpaque(false);
            registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // Add action listener to the login button for a basic animation
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    loginButton.setEnabled(false);
                    loginButton.setText("Logging in...");
                    // Simulate some login process
                    SwingUtilities.invokeLater(() -> {
                        // Your login logic goes here
                        // For simplicity, we'll just simulate a delay
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        // Reset button after login attempt
                        loginButton.setEnabled(true);
                        loginButton.setText("Login");
                    });
                }
            });

            // Add action listener to the register button
            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Your registration logic goes here
                    JOptionPane.showMessageDialog(frame, "Redirect to registration page");
                }
            });

            frame.add(usernameLabel);
            frame.add(usernameField);
            frame.add(passwordLabel);
            frame.add(passwordField);
            frame.add(loginButton);
            frame.add(registerButton);

            frame.setVisible(true);
        });
    }
}
