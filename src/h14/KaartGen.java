package h14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KaartGen extends Applet {
    double r;
    int random;
    int random2;
    Button button1;
    String[] deck;
    String[] buitenkleur = {"Rood","Blauw","Wit","Zwart","Groen","Geel","Cyaan","Magenta","Alpha","Beta"};
    String[] binnenkleur = {"Rood","Blauw","Wit","Zwart","Groen","Geel","Cyaan","Magenta","Alpha","Beta"};
    //errors als Strings kleur 1-2 leeg zijn
String kleur1 = "Null";
String kleur2 = "Null";
    public void init() {
        r = Math.random();
//        String[] buitenkleur = {"Rood","Blauw","Wit","Zwart","Groen"};
//        String[] binnenkleur = {"Rood","Blauw","Wit","Zwart","Groen"};

        button1 = new Button("Speel");
        button1.addActionListener(new Mixer());
        add(button1);


    }

    public String getKleur1() {
        return kleur1;
    }

    public String getKleur2() {
        return kleur2;
    }

    public void paint(Graphics g) {

        g.drawString(kleur1,50,60);
        g.drawString(kleur2,50,80);


    }
  public class Mixer implements ActionListener {
      public void actionPerformed(ActionEvent e) {

          random = (int) (Math.random() * 10);
          System.out.println(r + " " + random);
          kleur1 = binnenkleur[random];
          random2 = (int) (Math.random() * 10);
          kleur2 = binnenkleur[random2];

          System.out.println(kleur1 + " en " + kleur2);
          repaint();


      }}

          {
//              random = (int) (Math.random() * 10);
//              System.out.println(r + " " + random);
//              kleur1 = binnenkleur[random];
//              random2 = (int) (Math.random() * 10);
//              kleur2 = binnenkleur[random2];
//              System.out.println(kleur1 + " en " + kleur2);
//              repaint();
          }


//    private String deelKaart() {
//        int random = new Random().nextInt(deck.length);
//        String kaart = deck[random];
//
//        //vervang de inhoud van deck
//        String[] hulpLijst = new String[deck.length - 1];
//        int hulpindex = 0;
//        for (int i = 0; i < deck.length; i++) {
//            if (i != random) {
//                hulpLijst[hulpindex] = deck[i];
//                hulpindex++;
//            }
//        }
//        deck = hulpLijst;
//        return kaart;
      }

