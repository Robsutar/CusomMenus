package com.robsutar.menus.Handlers;

import com.robsutar.menus.ImageBuffer.ImageManager;
import com.robsutar.menus.Main;
import com.robsutar.menus.RenderableObjects.Menus.StartMenu;

public class MenuHandler extends Handlers{
    public  MenuHandler(){
        StartMenu box = new StartMenu(50,50,100,100);
        addRenderableObject(box);
    }
    @Override
    protected void tick() {
    }
}
