package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Graphics;

public class JIntro extends JFrame {

    public JIntro(){
        setTitle("JKalango Splash");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String texto = "<html><body style='width: 460px; color: white; font-family: Arial; font-size: 16px;'>"
                + "Em um mundo esquecido e sombrio, Jkalango é um calango do cerrado amaldiçoado, "
                + "lutando desesperadamente para preservar sua espécie e seus companheiros amalditos, "
                + "as JFormigas e JAbelhinhas. Para isso, ele deve enfrentar horrores indescritíveis, "
                + "sombras que sussurram segredos macabros e missões que testarão sua sanidade e coragem diante do abismo."
                + "</body></html>";

        JLabel label = new JLabel(texto);
        label.setOpaque(false); 

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(label);

        JButton startButton = new JButton("Iniciar Primeira Missão");
        panel.add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JIntro.this, "Primeira Missão Iniciada");
                dispose();
            }
        });

        setContentPane(panel);
        setVisible(true);
        
    }
}