package org.kasihappy.Tutorial.java.snake.components.v3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private int snakeLength = 3;
    private int snakeUnit = 10;
    private Direction direction;
    private List<Location> location = new ArrayList<Location>();

    public Snake()
    {
        direction = Direction.EAST;
        location.add(new Location(3*snakeUnit, 250));
        location.add(new Location(2*snakeUnit, 250));
        location.add(new Location(snakeUnit, 250));
    }

    public int length()
    {
        return location.size();
    }

    public Direction getDirection()
    {
        return direction;
    }

    public int getSnakeUnit()
    {
        return snakeUnit;
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        for (int i = 0; i < location.size(); i++)
        {
            g.fillRect(location.get(i).getX(), location.get(i).getY(), snakeUnit, snakeUnit);
        }
    }

    private Location adjustHeadLocation()
    {
        Location tLoc = new Location();
        int tx = location.get(0).getX();
        int ty = location.get(0).getY();

        switch (direction) {
            case NORTH:
                ty = ty - snakeUnit;
                if (ty < GameJPanel_v3.PANEL_TIPS)
                {
                    ty = GameJPanel_v3.PANEL_HEIGHT + GameJPanel_v3.PANEL_TIPS;
                }
                break;
            case SOUTH:
                ty = ty + snakeUnit;
                if (ty > GameJPanel_v3.PANEL_HEIGHT + GameJPanel_v3.PANEL_TIPS)
                {
                    ty = GameJPanel_v3.PANEL_TIPS;
                }
                break;
            case WEST:
                tx = tx - snakeUnit;
                if(tx < 0)
                {
                    tx = GameJPanel_v3.PANEL_WIDTH;
                }
                break;
            case EAST:
                tx = tx + snakeUnit;
                if (tx > GameJPanel_v3.PANEL_WIDTH)
                {
                    tx = snakeUnit;
                }
                break;
            case NONE:
            default:
                ;
        }
        tLoc.setX(tx);
        tLoc.setY(ty);
        return tLoc;
    }

    public void move()
    {
        Location head = adjustHeadLocation();

        for (int i = location.size() - 1; i > 0; i--)
        {
            location.set(i, location.get(i - 1));
        }

        location.set(0, head);
        /*v3*/
        if(Math.abs(head.getX() - GameJPanel_v3.food.getX()) < snakeUnit && Math.abs(head.getY() - GameJPanel_v3.food.getY()) < snakeUnit)
        {
            snakeLength++;
            GameJPanel_v3.score++;
            GameJPanel_v3.speed += 5;
            GameJPanel_v3.food.resetLocation();
            Location newLocation = new Location();
            location.add(newLocation);
        }

        if (kill())
        {
            JOptionPane.showMessageDialog(null, "贪吃蛇已死亡",
                    "消息", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public void changeDirection(Direction dir)
    {
        direction = dir;
    }

    public boolean kill()
    {
        return false;
    }
}
