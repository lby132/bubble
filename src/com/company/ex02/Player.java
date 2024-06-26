package com.company.ex02;

import javax.swing.*;

public class Player extends JLabel {

    private int x;
    private int y;

    private ImageIcon playerR, playerL;

    public Player() {
        initObject();
        initSetting();
    }

    private void initSetting() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void initObject() {
        x = 55;
        y = 535;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }
}
