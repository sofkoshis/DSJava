import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Reverse {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 200;

    private JFrame frame;
    private JPanel panel;
    private JPanel pnlButtons;
    private JTextField txtDisplay;
    private GridBagConstraints constraints;
    private Stack stack;
    private boolean clearFlag;

    // constructor
    public Reverse() {
        //create the frame
        frame = new JFrame("RPN Calculator");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //place the frame in the center of the screen
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new BorderLayout());
        addDisplay(panel);
        addButtons(panel);

        frame.add(panel);
        //make the frame visible
        frame.setVisible(true);

        stack = new Stack();
        clearFlag = false;
    }

    private void addDisplay(JPanel panel) {
        txtDisplay = new JTextField("0");
        txtDisplay.setEditable(false);
        txtDisplay.setFont(new Font("Plain", Font.PLAIN, 24));
        txtDisplay.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(txtDisplay, BorderLayout.NORTH);
    }

    private void addButtons(JPanel panel) {
        pnlButtons = new JPanel(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;

        addDigitButton(0, 0, "7");
        addDigitButton(1, 0, "8");
        addDigitButton(2, 0, "9");
        addActionButton(3, 0, "/");

        addDigitButton(0, 1, "4");
        addDigitButton(1, 1, "5");
        addDigitButton(2, 1, "6");
        addActionButton(3, 1, "*");

        addDigitButton(0, 2, "1");
        addDigitButton(1, 2, "2");
        addDigitButton(2, 2, "3");
        addActionButton(3, 2, "-");

        addDigitButton(0, 3, "+/-");
        addDigitButton(1, 3, "0");
        addDigitButton(2, 3, ".");
        addActionButton(3, 3, "+");

        addActionButton(0, 4, "C");
        addActionButton(1, 4, "CE");
        constraints.gridwidth = 2;
        addActionButton(2, 4, "ENTER");
        constraints.gridwidth = 1;

        panel.add(pnlButtons, BorderLayout.CENTER);
    }

    private JButton addButton(int gridx, int gridy, String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 24));
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        pnlButtons.add(button, constraints);
        return button;
    }

    private void addDigitButton(int gridx, int gridy, String label) {
        JButton btn = addButton(gridx, gridy, label);
        btn.addActionListener(new DigitButtonListener(label));
    }

    private void addActionButton(int gridx, int gridy, String label) {
        JButton btn = addButton(gridx, gridy, label);
        btn.addActionListener(new ActionButtonListener(label));
    }

    private class DigitButtonListener implements ActionListener {
        private String label;

        public DigitButtonListener(String label) {
            this.label = label;
        }

        public void actionPerformed(ActionEvent e) {
            String current = txtDisplay.getText();
            if (label.equals("+/-")) {
                if (current.startsWith("-")) {
                    txtDisplay.setText(current.substring(1));
                } else if (current.length() > 0 && !current.equals("0")) {
                    txtDisplay.setText("-" + current);
                }
                clearFlag = false;
            } else if (label.equals(".")) {
                if (!current.contains(".")) {
                    txtDisplay.setText(current + ".");
                }
            } else {
                if (clearFlag || current.equals("0")) {
                    txtDisplay.setText(label);
                } else {
                    txtDisplay.setText(current + label);
                }
                clearFlag = false;
            }
        }
    }

    private class ActionButtonListener implements ActionListener {
        private String label;

        public ActionButtonListener(String label) {
            this.label = label;
        }

        public void actionPerformed(ActionEvent e) {
            try {
                if (label.equals("ENTER")) {
                    double value = Double.parseDouble(txtDisplay.getText());
                    stack.push(value);
                    clearFlag = true;
                } else if (label.equals("C")) {
                    txtDisplay.setText("0");
                    stack.clear();
                    clearFlag = false;
                } else if (label.equals("CE")) {
                    txtDisplay.setText("0");
                    clearFlag = false;
                } else if ("+-*/".contains(label)) {
                    if (stack.size() < 2)
                        return;

                    double d1 = stack.pop();
                    double d2 = stack.pop();
                    double result = 0;

                    switch (label) {
                        case "+":
                            result = d1 + d2;
                            break;
                        case "-":
                            result = d1 - d2;
                            break;
                        case "*":
                            result = d1 * d2;
                            break;
                        case "/":
                            if (d2 == 0) {
                                txtDisplay.setText("Divide by 0");
                                stack.push(d1);
                                stack.push(d2);
                                return;
                            }
                            result = d1 / d2;
                            break;
                    }

                    txtDisplay.setText(String.valueOf(result));
                    stack.push(result);
                    clearFlag = true;
                }
            } catch (NumberFormatException ex) {
                txtDisplay.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(Reverse::new);
    }
}