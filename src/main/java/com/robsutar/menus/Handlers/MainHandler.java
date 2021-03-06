package com.robsutar.menus.Handlers;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

public class MainHandler{
    LinkedList<Handlers> handlers = new LinkedList<>();

    public void addHandler(Handlers handler){handlers.add(handler);}

    public void onRenderer(Graphics2D g2d){
        for (Handlers h:handlers
             ) {
            h.onRenderer(g2d);
        }
    }

    public void onMousePressed(MouseEvent e ){
        for (Handlers h:handlers
        ) {
            h.onMousePressed(e);
        }
    }

    public void onMouseReleased(MouseEvent e) {
        for (Handlers h:handlers
        ) {
            h.onMouseReleased(e);
        }
    }
}
