import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field, resultField;
    JButton calculateButton;

    public SimpleCalculator() {
        // Frame title
        setTitle("Simple Calculator");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components
        JLabel num1Label = new JLabel("Enter Number 1:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter Number 2:");
        num2Field = new JTextField();

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        // Add to frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(calculateButton);
        add(resultLabel);
        add(resultField);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double sum = n1 + n2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
