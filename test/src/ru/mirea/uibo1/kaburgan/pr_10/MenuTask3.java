package ru.mirea.uibo1.kaburgan.pr_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTask3 extends JFrame {

    JTextArea area = new JTextArea(10, 25);
    JButton b1 = new JButton("Кнопка 1");
    JButton b2 = new JButton("Кнопка 2");

    public MenuTask3() {
        super("Меню");
        setSize(400, 300);
        setLayout(new BorderLayout());

        // Панель текста
        add(new JScrollPane(area), BorderLayout.CENTER);

        // Нижняя панель
        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        add(panel, BorderLayout.SOUTH);

        // Меню
        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("Файл");
        JMenu edit = new JMenu("Правка");
        JMenu help = new JMenu("Справка");

        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");

        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");

        file.add(save);
        file.add(exit);

        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        bar.add(file);
        bar.add(edit);
        bar.add(help);

        setJMenuBar(bar);

        exit.addActionListener(e -> System.exit(0));
        copy.addActionListener(e -> area.copy());
        cut.addActionListener(e -> area.cut());
        paste.addActionListener(e -> area.paste());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuTask3();
    }
}
