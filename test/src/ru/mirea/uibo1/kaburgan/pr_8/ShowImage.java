package ru.mirea.uibo1.kaburgan.pr_8;

import javax.swing.*;

public class ShowImage {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Передайте путь к изображению!");
            return;
        }

        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon(args[0]);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }
}

