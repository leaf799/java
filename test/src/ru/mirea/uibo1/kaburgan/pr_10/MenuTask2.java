package ru.mirea.uibo1.kaburgan.pr_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTask2 extends JFrame {

    JComboBox<String> box;
    JTextArea info = new JTextArea(5, 20);

    public MenuTask2() {
        super("Страны");
        setLayout(new FlowLayout());
        setSize(300, 200);

        String[] items = {"Россия", "США", "Франция", "Япония", "Китай"};
        box = new JComboBox<>(items);

        add(new JLabel("Выберите страну:"));
        add(box);
        add(info);

        info.setLineWrap(true);

        box.addActionListener(e -> {
            String c = (String) box.getSelectedItem();
            switch (c) {
                case "Россия": info.setText("Столица: Москва\nНаселение: 146 млн"); break;
                case "США": info.setText("Столица: Вашингтон\nНаселение: 331 млн"); break;
                case "Франция": info.setText("Столица: Париж\nНаселение: 67 млн"); break;
                case "Япония": info.setText("Столица: Токио\nНаселение: 125 млн"); break;
                case "Китай": info.setText("Столица: Пекин\nНаселение: 1.4 млрд"); break;
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuTask2();
    }
}
