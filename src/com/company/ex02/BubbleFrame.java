package com.company.ex02;

import javax.swing.*;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        setVisible(true);
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        player = new Player();
        add(player);
//        backgroundMap.setSize(1000, 600);
//        backgroundMap.setLocation(300, 300);
//        add(backgroundMap); // JFrame에 JLabel이 그려진다.
    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null); // 자유롭게 그림을 그릴수 있다.
        setLocationRelativeTo(null); // JFrame 가운데 배치하기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌때 JVM도 같이 종료
        setVisible(true);
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
