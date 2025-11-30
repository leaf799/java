package ru.mirea.uibo1.kaburgan.pr_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcTask4 extends JFrame implements ActionListener {

    JTextField display = new JTextField(15);

    double num1 = 0, num2 = 0;
    String op = "";

    public CalcTask4() {
        super("Калькулятор");
        setSize(300, 400);
        setLayout(new BorderLayout());

        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] btns = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0","C","=","+"
        };

        for (String s : btns) {
            JButton b = new JButton(s);
            b.setFont(new Font("Arial", Font.BOLD, 20));
            b.addActionListener(this);
            grid.add(b);
        }

        add(grid, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String c = e.getActionCommand();

        if (c.matches("[0-9]"))
            display.setText(display.getText() + c);
        else if (c.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            op = c;
            display.setText("");
        } else if (c.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double r = 0;
            switch (op) {
                case "+": r = num1 + num2; break;
                case "-": r = num1 - num2; break;
                case "*": r = num1 * num2; break;
                case "/": r = num1 / num2; break;
            }
            display.setText(String.valueOf(r));
        } else if (c.equals("C"))
            display.setText("");
    }

    public static void main(String[] args) {
        new CalcTask4();
    }
}

