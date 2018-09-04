package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Reken extends Applet {
    TextField tekst1;
    TextField tekst2;
    Label label;
    double getal;
    double getal2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
 double resultaat;
    public void init() {
        tekst1 = new TextField("", 10);
        tekst2 = new TextField("", 10);
        //label voegt naam toe
        tekst1.addActionListener(new TekstListener1());
        tekst2.addActionListener(new TekstListener2());
        button1 = new Button("+");
        button2 = new Button("-");
        button3 = new Button("*");
        button4 = new Button("/");
        button1.addActionListener(new Add());
        button2.addActionListener(new Subtract());
        button3.addActionListener(new Multiply());
        button4.addActionListener(new Divide());

        add(tekst1); //interactieve tekstfield
        add(tekst2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    public void paint(Graphics g) {
        g.drawString("Getal 1 is " + getal, 50, 60);
        g.drawString("Getal 2 is " + getal2, 50, 80);
        g.drawString("Resultaat is " + resultaat, 50, 100);
    }

    class TekstListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekst1.getText();

            getal = Double.parseDouble(s);

            System.out.println(getal + "");

            repaint();
        }
    }
    class TekstListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String f = tekst2.getText();

            getal2 = Double.parseDouble(f);
            System.out.println(getal + "");

            repaint();
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = getal + getal2;
            System.out.println(resultaat);
        }
    }
    class Subtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = getal - getal2;
            System.out.println(resultaat);
        }
    }
    class Divide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = getal / getal2;
            System.out.println(resultaat);
        }

    }
    class Multiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            resultaat = getal * getal2;
            System.out.println(resultaat);
        }
}}
