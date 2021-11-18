package com.robsutar.menus.Frame;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        GamePanel panel = new GamePanel();

        this.add(panel);
        this.setTitle("Robsutar FNF engine! 0.03");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
