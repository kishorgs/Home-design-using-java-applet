package home;

import java.applet.Applet;

import java.awt.*;
import java.applet.*;

public class AppletHome extends Applet {

    public void paint(Graphics g) {
       
        g.setColor(Color.blue);
        //house
        g.fillRect(250, 300, 700, 400);
        //door part
        g.fillRect(250, 300, 200, 400);
        g.setColor(Color.gray);
        g.drawLine(470, 300, 470, 700);
        g.setColor(Color.orange);
        //door
        g.fillRect(300,450,120,250);
        //window
        g.fillRect(620,430,200,120);
        
        //roogh
        
        g.setColor(Color.orange);
        
        int[] a = {250,370,470};
        int[] b = {300,150,300};
        int l = a.length;
        
        g.fillPolygon(a, b, l);
        g.setColor(Color.red);
        g.drawLine(250,300,370,150);
        g.drawLine(250,300,470,300);
        
        g.setColor(Color.red);
        
        int[] x = {470,370,890,950};
        int[] y = {300,150,150,300};
        int n = x.length;
        
        g.fillPolygon(x, y, n);
        
        
       //window bars
        g.setColor(Color.black);
        
        g.drawLine(660,430,660,550);
        g.drawLine(700,430,700,550);
        g.drawLine(740,430,740,550);
        g.drawLine(780,430,780,550);
        
        
        g.drawLine(620,460,820,460);
        g.drawLine(620,490,820,490);
        g.drawLine(620,520,820,520);
        
    }

    
}
