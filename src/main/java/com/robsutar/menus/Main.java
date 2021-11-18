package com.robsutar.menus;

import com.robsutar.menus.Frame.GameFrame;
import com.robsutar.menus.ImageBuffer.ImageManager;
import com.robsutar.menus.RenderableObjects.Menus.Box;
import com.robsutar.menus.RenderableObjects.Menus.StartMenu;

import java.awt.*;
import java.io.File;

public class Main {

    public static String resourcesPath = new File("").getAbsolutePath()+"/resources/";
    public static String assetsPath = resourcesPath+"assets/";

    public static int xMouse;
    public static int yMouse;
    public static char state;

    public static StartMenu box = new StartMenu(50,50,100,100, ImageManager.loadImage(assetsPath+"box.png"));

    public static void main(String[] args){
        new GameFrame();

    }

    public static void renderer(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        box.onRenderer(g2d);
    }

    public static void tick() {
    }

    public static int getxMouse() {
        return xMouse;
    }

    public static int getyMouse() {
        return yMouse;
    }
}
