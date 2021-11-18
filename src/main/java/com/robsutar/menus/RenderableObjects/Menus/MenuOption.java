package com.robsutar.menus.RenderableObjects.Menus;

import java.awt.image.BufferedImage;

public abstract class MenuOption extends Box {

    public MenuOption(int x, int y, int width, int height, BufferedImage image) {
        super(x, y, width, height, image);
    }

    public void checkMouseAbove(){
    }

    public abstract void onMouseAbove();
    public abstract void onClick();

    public void renderer(){

    }
}
