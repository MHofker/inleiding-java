package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.util.Random;
import java.net.URL;

public class KaartSpel extends Applet {
    double r;
    int random;

    private String[] speler1;
    private String[] speler2;
    private String[] speler3;
    private String[] speler4;
    private URL pad;
    private AudioClip sound;



    String kaart;
    String[] deck;

    int Random() {
        {
            random = (int) (Math.random() * 10);
        }
        return random;
//        pad = KaartSpel.class.getResource("/resources/");
//        sound = getAudioClip(pad, "applaus.wav");

    }

    //errors als Strings kleur 1-2 leeg zijn
    String kleur1 = "Niets";
    String kleur2 = "Alles";

    public void init() {

        String[] kleuren = {"Ruiten", "Klaver", "Harten", "Schoppen"};
        String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven",
                "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
        deck = new String[53];
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];
        r = Math.random();
        deelKaart();
        int index = 0;

        System.out.println(deck.length);
        for (int i = 0; i < kleuren.length; i++) {
            String kleur = kleuren[i];
            for (int j = 0; j < kaarten.length; j++) {
                String kaart = kaarten[j];

                deck[index] = kleur + " " + kaart;
                index++;
                System.out.println(index + "index");
            }
        }
        for (int i = 0; i < 13; i++) {

            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart(); // waarom OutOfBounds?
        }





    }

    public void paint(Graphics g) {

        g.drawString(kleur1, 50, 60);
        g.drawString(kleur2, 50, 80);
        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y = 70;
        g.drawString("Speler 1", x1, y);
        g.drawString("Speler 2", x2, y);
        g.drawString("Speler 3", x3, y);
        g.drawString("Speler 4", x4, y);
        y = 100;
        for (int i = 0; i < 13; i++) {
            System.out.println(speler1[i] + " speler 1");
            System.out.println(speler2[i] + " speler 2");
            System.out.println(speler3[i] + " speler 3");
            System.out.println(speler4[i] + " speler 4");
            g.drawString(speler1[i], x1, y);
            g.drawString(speler2[i], x2, y);
            g.drawString(speler3[i], x3, y);
            g.drawString(speler4[i], x4, y);
            y = y + 20;
        }
//        sound.play();
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                System.out.println("deck = " +deck[i] + " i =" + i);
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}









