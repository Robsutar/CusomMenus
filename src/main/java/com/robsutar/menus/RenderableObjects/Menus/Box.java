package com.robsutar.menus.RenderableObjects.Menus;

import com.robsutar.menus.ImageBuffer.ImageManager;
import com.robsutar.menus.Main;
import com.robsutar.menus.RenderableObjects.RenderableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public abstract class Box extends RenderableObject{
    private int width=0,height=0;

    private BufferedImage image;

    public Box(int x, int y, int width, int height, BufferedImage image){
        setX(x);setY(y);setWidth(width);setHeight(height);
        this.image= ImageManager.cropImage(image,0,0,width,height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getImage() {
        return image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isInto(int x,int y){
        if (x>=this.getX()&&x<=width&&y>=this.getY()&&y<=height){
            return true;
        }
        return false;
    }

    public boolean isInto(){
        int x=Main.getxMouse(), y = Main.getyMouse();
        if (x>=this.getX()&&x<=width&&y>=this.getY()&&y<=height){
            return true;
        }
        return false;
    }

    public boolean isMouseAbove(){
        if (isInto()){
            return true;
        } else return false;
    }

    public void onClicked(MouseEvent e){
        if (isInto()) {
            clicked(e);
        }
    }

    public  void clicked(MouseEvent e){
        System.out.println("no action for this button");
    }

    @Override
    protected void renderer(Graphics2D g2d) {
        if (isMouseAbove()){
            g2d.setColor(Color.cyan);
            g2d.drawImage(image,getX(),getY(),null);
        } else{
            g2d.setColor(Color.yellow);
        }
        g2d.fillRect(getX(),getY(),getWidth()/2,getHeight()/2);
        g2d.drawString((Main.getxMouse()+"  "+Main.getyMouse()),Main.getxMouse(),Main.getyMouse());
    }

    @Override
    protected void tick() {
    }
}
