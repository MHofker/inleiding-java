package h04;

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek

import java.applet.Applet;
import java.awt.*;

//een klasse met de naam Show van het type Applet
public class Main extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("Lijn",100,65);
        g.drawString("Rechthoek",80,180);
        g.drawString("Afgeronde Rechthoek",60,300);
        g.drawString("gevulde rechthoek met ovaal",210,170);
        g.drawString("gevulde ovaal",240,270);
        g.drawString("taartpunt met ovaal eromheen",380,170);
        g.drawString("cirkel",380,310);
//lijn
g.drawLine(50,50,200,50);
//rechthoek
g.drawRect(50,80,120,80);
//afgerondrechthoek
g.drawRoundRect(50,200,130,80,30,30);
//gevulde rechthoek
g.setColor(Color.magenta);
g.fillRect(200,100,120,60);
g.setColor(Color.black);
g.drawOval(200,100,120,60);
g.setColor(Color.magenta);
//gevulde ovaal
        g.fillOval(200,200,120,60);
        g.setColor(Color.black);
//taartpunt
        g.drawOval(350,100,120,60);
        g.setColor(Color.magenta);
        g.fillArc(350,100,120,60,0,45);
        g.setColor(Color.black);
//cirkel
        g.drawOval(350,200,100,100);
    }

}