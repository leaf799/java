package ru.mirea.uibo1.kaburgan.pr_10;

import java.awt.*;
import java.awt.event.*;

public class CalcTask1 extends Frame {

    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);

    Button add = new Button("+");
    Button sub = new Button("-");
    Button mul = new Button("*");
    Button div = new Button("/");

    public CalcTask1() {
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(new Label("1 число:"));
        add(t1);
        add(new Label("2 число:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        ActionListener listener = e -> {
            try {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                double r = 0;

                if (e.getSource() == add) r = a + b;
                if (e.getSource() == sub) r = a - b;
                if (e.getSource() == mul) r = a * b;
                if (e.getSource() == div) r = a / b;

                showDialog("Результат = " + r);

            } catch (Exception ex) {
                showDialog("Ошибка ввода!");
            }
        };

        add.addActionListener(listener);
        sub.addActionListener(listener);
        mul.addActionListener(listener);
        div.addActionListener(listener);

        setVisible(true);
    }

    private void showDialog(String msg) {
        Dialog d = new Dialog(this, "Сообщение", true);
        d.setLayout(new FlowLayout());
        d.setSize(200, 120);
        d.add(new Label(msg));
        Button ok = new Button("OK");
        ok.addActionListener(e -> d.setVisible(false));
        d.add(ok);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new CalcTask1();
    }
}

