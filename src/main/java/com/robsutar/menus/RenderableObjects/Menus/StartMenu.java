package com.robsutar.menus.RenderableObjects.Menus;

import com.robsutar.menus.Main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class StartMenu extends Box{
    public StartMenu(int x, int y, int width, int height, BufferedImage image) {
        super(x, y, width, height, image);
    }

    @Override
    protected void renderer(Graphics2D g2d) {
        if (isMouseAbove()){
            g2d.setColor(Color.cyan);
            g2d.drawImage(getImage(),getX(),getY(),null);
        } else{
            g2d.setColor(Color.red);
        }
        g2d.fillRect(getX(),getY(),getWidth()/2,getHeight()/2);
        g2d.drawString((Main.getxMouse()+"  "+Main.getyMouse()),Main.getxMouse(),Main.getyMouse());
    }
}
