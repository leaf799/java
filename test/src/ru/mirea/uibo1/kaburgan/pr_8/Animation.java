package ru.mirea.uibo1.kaburgan.pr_8;

import javax.swing.*;

public class Animation extends JFrame {
    private int currentFrame = 0;

    public Animation() {
        setTitle("Animation");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Массив кадров
        ImageIcon[] frames = {
                new ImageIcon("frame1.png"),
                new ImageIcon("frame2.png"),
                new ImageIcon("frame3.png"),
                new ImageIcon("frame4.png")
        };

        JLabel label = new JLabel(frames[0]);
        add(label);

        // Таймер 10 кадров в секунду
        Timer timer = new Timer(100, e -> {
            currentFrame = (currentFrame + 1) % frames.length;
            label.setIcon(frames[currentFrame]);
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Animation().setVisible(true);
    }
}

