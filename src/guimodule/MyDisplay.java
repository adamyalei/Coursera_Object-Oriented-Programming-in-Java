package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

import java.time.LocalTime;

public class MyDisplay extends PApplet {
    public void setup() {
        size(400, 400);
//        background(65, 80, 101); //黛蓝
        PImage webImg;
        String url = "https://images.unsplash.com/photo-1529420705456-5c7e04dd043d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1300&q=80";
        webImg = loadImage(url, "jpg");
        webImg.resize(width, height);
        background(webImg);


    }

    public void draw() {
        // set sun color according to the time
        LocalTime now = LocalTime.now();
        if (now.getHour() >= 18 | now.getHour() <= 6) {
            fill(0, 0, 0);
        } else {
            fill(255, 255, 0);
        }

        ellipse(height / 5, width / 5, height / 5, width / 5);

    }

}
