package org.kasihappy.Tutorial.java.snake.components.v3;

import java.awt.*;
import java.util.Random;

public class Food {
    private int x;
    private int y;
    private int FOOD_SIZE = 20;
    private Random r = new Random();
    private Color color = Color.RED;

    public Food()
    {
        resetLocation();
    }

    public Food(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void resetLocation()
    {
        this.x = (r.nextInt(GameJPanel_v3.PANEL_WIDTH - FOOD_SIZE + 1)) + FOOD_SIZE;
        this.y = (r.nextInt(GameJPanel_v3.PANEL_HEIGHT - GameJPanel_v3.PANEL_TIPS + 1)) + GameJPanel_v3.PANEL_TIPS;

    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, FOOD_SIZE, FOOD_SIZE);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
