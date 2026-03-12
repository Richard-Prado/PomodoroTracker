package org.example.windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    int timeLeft = 25 * 60;

    public MainWindow() {
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel panel2 = new JPanel(new FlowLayout());
        JLabel label1 = new JLabel("25:00");
        JButton start_btn = new JButton("Start");
        JButton stop_btn = new JButton("Stop");
        JButton reset_btn = new JButton("Reset");

        //criando a janela
        setTitle("Pomodoro Tracker");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //instanciando o painel principal
        setContentPane(panel1);

        panel1.add(panel2, BorderLayout.SOUTH);

        //criando e instanciando o label principal
        label1.setFont(new Font("Arial", Font.BOLD, 28));
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(label1);

        Timer timer = new Timer(1000, e -> {
            int minutes = timeLeft / 60;
            int seconds = timeLeft % 60;

            label1.setText(String.format("%02d:%02d", minutes, seconds));

            timeLeft --;
            if (timeLeft <= 0) {

                ((Timer)e.getSource()).stop();
            }
        });



        //criando e instanciando o botão start
        panel2.add(start_btn);
        start_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        panel2.add(stop_btn);
        stop_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        panel2.add(reset_btn);
        reset_btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                timeLeft = 25 * 60;
                label1.setText("25:00");
            }
        });
    }
}
