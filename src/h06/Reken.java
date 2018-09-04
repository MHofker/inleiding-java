package h06;

import java.awt.*;
import java.applet.*;


public class Reken extends Applet {
    double a, b, c, d, e, f, h, H, uitkomst;
int g;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = (a + b + c);
        e =(d / 3); System.out.println(e);
        f = (e * 10);
        System.out.println(f+"F");
        g = (int)f; System.out.println(g+"G");
        h = (double)g; System.out.println(h+"H");
        H = (h / 10);
        uitkomst = H;

        System.out.println(uitkomst);

        System.out.println(f);

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}