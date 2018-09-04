package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Spel extends Applet {
    TextField tekst1;
    Button button1;
    private Image afbeelding;
    private URL pad;
    int punten = 23;
    int b;
    int f;
    int v;

    int turns;


    public void init() {
        tekst1 = new TextField("", 10);
        button1 = new Button("Speel");
        tekst1.addActionListener(new Game());
        button1.addActionListener(new Game());
        add(tekst1);
        add(button1);


    }

    public void paint(Graphics g) {

        g.drawString("Punten over:" + punten, 50, 80);
        if (turns >0){g.drawString("computer verwijdert"+v,50,60);}

        if (punten <= 0) {
            g.drawString("END", 200, 100);

          System.out.println("Painted");
        }
        }

    class Game implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String b = tekst1.getText();
            f = Integer.parseInt(b);

            if (punten <= 0) {
                System.out.println("Game end");

                repaint();
            } else if ((f > 0) && (f < 4)) {
                System.out.println("Valid input");
                punten = (punten - f);
                System.out.println(f + " verwijdert");
                System.out.println(punten + " Over");
                if (punten >21){ v=(punten-21);punten=(punten-v);System.out.println("A");}
                else if (punten >17){v=(punten-17);punten=(punten-v);System.out.println("B");}
                else if (punten >13){v=(punten-13);punten=(punten-v);System.out.println("C");}//bug kiest 4
                else if (punten >9){v=(punten-9);punten=(punten-v);System.out.println("D");}
                else if (punten >5){v=(punten-5);punten=(punten-v);System.out.println("E");}
                else if (punten >1){v=(punten-1);punten=(punten-v);System.out.println("F");}
                System.out.println("Computer verwijdert" +v+ "punten");
                System.out.println(punten + " Over");
                turns++;

                repaint();
// 1, 5, 9, 13, 17, 21.

            } else {
                System.out.println("Invalid input");
                System.out.println("Nothing happened");

                repaint();

            }


        }
    }
}