package com.company.ex03;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    // 위치 상태
    private int x;
    private int y;

    // 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

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

        left = false;
        right = false;
        up = false;
        down = false;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }

    @Override
    public void left() {
        setIcon(playerL);
        x = x - 10;
        setLocation(x, y);
    }

    @Override
    public void right() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setIcon(playerR);
        x = x + 10;
        setLocation(x, y);
    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }
}
