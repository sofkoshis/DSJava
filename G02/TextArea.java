import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextArea {
    static final int FRAME_WIDTH = 400;
    static final int FRAME_HEIGHT = 250;
    static final int AREA_ROWS = 10;
    static final int AREA_COLUMNS = 30;

    private static double balance = 1000.00; 

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Interest Calculator");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();

       
        JTextField rateField = new JTextField("5.00", 10); 

        JTextArea textArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

 
        JButton calcButton = new JButton("Apply Interest");

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = rateField.getText();
                try {
                    double rate = Double.parseDouble(input);
                    double interest = balance * rate / 100.0;
                    balance += interest;
                    textArea.append(String.format("Applied %.2f%% interest: New Balance = $%.2f%n", rate, balance));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number for the interest rate.", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(new JLabel("Interest Rate (%):"));
        panel.add(rateField);
        panel.add(calcButton);
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);
    }
}
