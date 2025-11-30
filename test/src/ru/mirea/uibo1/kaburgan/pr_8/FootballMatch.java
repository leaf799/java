package ru.mirea.uibo1.kaburgan.pr_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FootballMatch {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Match Simulator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton milanBtn = new JButton("AC Milan");
        JButton madridBtn = new JButton("Real Madrid");

        JLabel result = new JLabel("Result: 0 X 0", JLabel.CENTER);
        JLabel last = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel winner = new JLabel("Winner: DRAW", JLabel.CENTER);

        int[] score = {0, 0};

        milanBtn.addActionListener((ActionEvent e) -> {
            score[0]++;
            result.setText("Result: " + score[0] + " X " + score[1]);
            last.setText("Last Scorer: AC Milan");
            winner.setText(score[0] > score[1] ? "Winner: AC Milan" :
                    score[1] > score[0] ? "Winner: Real Madrid" : "Winner: DRAW");
        });

        madridBtn.addActionListener((ActionEvent e) -> {
            score[1]++;
            result.setText("Result: " + score[0] + " X " + score[1]);
            last.setText("Last Scorer: Real Madrid");
            winner.setText(score[0] > score[1] ? "Winner: AC Milan" :
                    score[1] > score[0] ? "Winner: Real Madrid" : "Winner: DRAW");
        });

        frame.setLayout(new GridLayout(5, 1));
        frame.add(milanBtn);
        frame.add(madridBtn);
        frame.add(result);
        frame.add(last);
        frame.add(winner);

        frame.setVisible(true);
    }
}

