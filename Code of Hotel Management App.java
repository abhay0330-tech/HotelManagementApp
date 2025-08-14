import javax.swing.*;
import java.awt.*;

public class HotelManagementApp {
    private JFrame mainFrame;
    private JPanel currentPanel;

    public HotelManagementApp() {
        mainFrame = new JFrame("Welcome To Ramada");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600, 400);
        mainFrame.setLocationRelativeTo(null); // Center the frame

        showLoginWindow(); // Show login window by default
    }

    // Method to switch to different panels
    private void switchPanel(JPanel panel) {
        mainFrame.getContentPane().removeAll();
        currentPanel = panel;
        currentPanel.setBackground(new Color(173, 216, 230)); // Light Blue color
        mainFrame.add(currentPanel);
        mainFrame.revalidate();
        mainFrame.repaint();
        mainFrame.setVisible(true);
    }

    // Method to show the login window
    private void showLoginWindow() {
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(new Color(173, 216, 230)); // Light Blue color

        JLabel mobileLabel = new JLabel("Mobile Number:");
        mobileLabel.setBounds(50, 50, 120, 25);
        loginPanel.add(mobileLabel);

        JTextField mobileField = new JTextField();
        mobileField.setBounds(180, 50, 200, 25);
        loginPanel.add(mobileField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 120, 25);
        loginPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(180, 100, 200, 25);
        loginPanel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250, 150, 100, 30);
        loginButton.addActionListener(e -> {
            // Placeholder logic for successful login (validation not implemented)
            JOptionPane.showMessageDialog(mainFrame, "Login Successful!");
            showRoomsWindow();
        });
        loginPanel.add(loginButton);

        mainFrame.getContentPane().add(loginPanel);
        mainFrame.setVisible(true);
    }

    // Method to show the rooms selection window
    private void showRoomsWindow() {
        JPanel roomsPanel = new JPanel();
        roomsPanel.setLayout(null);
        roomsPanel.setBackground(new Color(173, 216, 230)); // Light Blue color

        JLabel roomTypeLabel = new JLabel("Type of Room:");
        roomTypeLabel.setBounds(50, 50, 120, 25);
        roomsPanel.add(roomTypeLabel);

        String[] roomTypes = {"Low", "Medium", "Luxury"};
        JComboBox<String> roomTypeComboBox = new JComboBox<>(roomTypes);
        roomTypeComboBox.setBounds(180, 50, 200, 25);
        roomsPanel.add(roomTypeComboBox);

        JLabel bedTypeLabel = new JLabel("Type of Bed:");
        bedTypeLabel.setBounds(50, 100, 120, 25);
        roomsPanel.add(bedTypeLabel);

        String[] bedTypes = {"Single ($50)", "Double ($60)", "King ($70)"};
        JComboBox<String> bedTypeComboBox = new JComboBox<>(bedTypes);
        bedTypeComboBox.setBounds(180, 100, 200, 25);
        roomsPanel.add(bedTypeComboBox);

        JLabel checkinLabel = new JLabel("Check-in Time:");
        checkinLabel.setBounds(50, 150, 120, 25);
        roomsPanel.add(checkinLabel);

        JComboBox<String> checkinHourComboBox = new JComboBox<>(new String[]{"12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM"});
        checkinHourComboBox.setBounds(180, 150, 80, 25);
        roomsPanel.add(checkinHourComboBox);

        JComboBox<String> checkinMinuteComboBox = new JComboBox<>(new String[]{"00", "15", "30", "45"});
        checkinMinuteComboBox.setBounds(270, 150, 60, 25);
        roomsPanel.add(checkinMinuteComboBox);

        JLabel checkoutLabel = new JLabel("Check-out Time:");
        checkoutLabel.setBounds(50, 200, 120, 25);
        roomsPanel.add(checkoutLabel);

        JComboBox<String> checkoutHourComboBox = new JComboBox<>(new String[]{"12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM"});
        checkoutHourComboBox.setBounds(180, 200, 80, 25);
        roomsPanel.add(checkoutHourComboBox);

        JComboBox<String> checkoutMinuteComboBox = new JComboBox<>(new String[]{"00", "15", "30", "45"});
        checkoutMinuteComboBox.setBounds(270, 200, 60, 25);
        roomsPanel.add(checkoutMinuteComboBox);

        JButton bookButton = new JButton("Book");
        bookButton.setBounds(250, 250, 100, 30);
        bookButton.addActionListener(e -> {
            // Placeholder logic for booking (validation not implemented)
            JOptionPane.showMessageDialog(mainFrame, "Room Booked Successfully!");
            showPaymentWindow();
        });
        roomsPanel.add(bookButton);

        JButton backButton = new JButton("Back to Login");
        backButton.setBounds(50, 250, 150, 30);
        backButton.addActionListener(e -> showLoginWindow());
        roomsPanel.add(backButton);

        switchPanel(roomsPanel);
    }

    // Method to show the payment window
    private void showPaymentWindow() {
        JPanel paymentPanel = new JPanel();
        paymentPanel.setLayout(null);
        paymentPanel.setBackground(new Color(173, 216, 230)); // Light Blue color

        JLabel cardDetailsLabel = new JLabel("Enter Card Details:");
        cardDetailsLabel.setBounds(50, 50, 150, 25);
        paymentPanel.add(cardDetailsLabel);

        JTextField cardDetailsField = new JTextField();
        cardDetailsField.setBounds(200, 50, 200, 25);
        paymentPanel.add(cardDetailsField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(50, 100, 120, 25);
        paymentPanel.add(amountLabel);

        JTextField amountField = new JTextField();
        amountField.setBounds(200, 100, 200, 25);
        paymentPanel.add(amountField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 120, 25);
        paymentPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 150, 200, 25);
        paymentPanel.add(passwordField);

        JButton buyButton = new JButton("Buy");
        buyButton.setBounds(250, 200, 100, 30);
        buyButton.addActionListener(e -> {
            // Placeholder logic for payment (validation not implemented)
            JOptionPane.showMessageDialog(mainFrame, "Payment Successful!");
            showLoginWindow();
        });
        paymentPanel.add(buyButton);

        JButton backButton = new JButton("Back to Rooms");
        backButton.setBounds(50, 200, 150, 30);
        backButton.addActionListener(e -> showRoomsWindow());
        paymentPanel.add(backButton);

        switchPanel(paymentPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HotelManagementApp::new);
    }
}
