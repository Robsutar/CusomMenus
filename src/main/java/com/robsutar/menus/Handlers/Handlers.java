package com.robsutar.menus.Handlers;

import com.robsutar.menus.RenderableObjects.Menus.Box;
import com.robsutar.menus.RenderableObjects.RenderableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public abstract class Handlers extends RenderableObject{
    LinkedList<RenderableObject> renderableObjects = new LinkedList<>();
    LinkedList<Box> boxes = new LinkedList<>();

    public void addRenderableObject(RenderableObject object){renderableObjects.add(object);}

    public void addRenderableObject(Box object){boxes.add(object);}

    @Override
    public void renderer(Graphics2D g2d) {
        for (RenderableObject r:renderableObjects
             ) {
            r.onRenderer(g2d);
        }
        for (Box b:boxes
        ) {
            b.onRenderer(g2d);
        }
    }

    public void onMouseClick(MouseEvent e){
        for (Box b:boxes
        ) {
            b.onClicked(e);
        }
    }
}
