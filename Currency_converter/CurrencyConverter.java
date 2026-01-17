import javax.swing.*;
import java.awt.*;

public class CurrencyConverter {

    public static void main(String[] args) {

        // ---------- FRAME ----------
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(245, 248, 255));

        // ---------- AMOUNT LABEL ----------
        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(30, 30, 100, 30);
        frame.add(amountLabel);

        // ---------- AMOUNT FIELD ----------
        JTextField amountField = new JTextField();
        amountField.setBounds(120, 30, 150, 30);
        frame.add(amountField);

        // ---------- CURRENCY LIST ----------
        String[] currencies = {"USD", "BDT", "EUR", "INR", "GBP", "JPY"};

        // ---------- FROM CURRENCY ----------
        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(30, 80, 100, 30);
        frame.add(fromLabel);

        JComboBox<String> fromCurrency = new JComboBox<>(currencies);
        fromCurrency.setBounds(120, 80, 100, 30);
        frame.add(fromCurrency);

        // ---------- TO CURRENCY ----------
        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(30, 120, 100, 30);
        frame.add(toLabel);

        JComboBox<String> toCurrency = new JComboBox<>(currencies);
        toCurrency.setBounds(120, 120, 100, 30);
        frame.add(toCurrency);

        // ---------- CONVERT BUTTON ----------
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(120, 170, 100, 35);
        convertButton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        convertButton.setBackground(new Color(0, 102, 204));
        convertButton.setForeground(Color.WHITE);
        frame.add(convertButton);

        // ---------- RESULT LABEL ----------
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 220, 300, 30);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(resultLabel);

        // ---------- BUTTON ACTION ----------
        convertButton.addActionListener(e -> {

            try {
                double amount = Double.parseDouble(amountField.getText());
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();

                // STEP 1: FROM -> USD
                double amountInUSD = 0;

                if (from.equals("USD")) amountInUSD = amount;
                else if (from.equals("BDT")) amountInUSD = amount * 0.0091;
                else if (from.equals("EUR")) amountInUSD = amount * 1.08;
                else if (from.equals("INR")) amountInUSD = amount * 0.012;
                else if (from.equals("GBP")) amountInUSD = amount * 1.27;
                else if (from.equals("JPY")) amountInUSD = amount * 0.0068;

                // STEP 2: USD -> TO
                double result = 0;

                if (to.equals("USD")) result = amountInUSD;
                else if (to.equals("BDT")) result = amountInUSD * 109.5;
                else if (to.equals("EUR")) result = amountInUSD * 0.93;
                else if (to.equals("INR")) result = amountInUSD * 83;
                else if (to.equals("GBP")) result = amountInUSD * 0.79;
                else if (to.equals("JPY")) result = amountInUSD * 147;

                resultLabel.setText("Result: " + String.format("%.2f", result));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
            }
        });

        // ---------- SHOW FRAME ----------
        frame.setVisible(true);
    }
}
