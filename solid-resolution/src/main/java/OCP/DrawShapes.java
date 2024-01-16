package main.java.OCP;

import java.util.List;

public class DrawShapes {
    public void drawShapes(List<Drawable> drawableShapes){
        drawableShapes.forEach(shape -> shape.draw());
    }
}
