package com.company.ex06;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// 메인스레드는 키보드 이벤트를 처리하기 바쁨
// 백그라운드에서 계속 관찰
public class BackgroundPlayerService implements Runnable {

    private BufferedImage image;

    public BackgroundPlayerService(BufferedImage image) {
        try {
            image = ImageIO.read(new File("image/test.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void run() {

    }
}
