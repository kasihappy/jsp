package org.kasihappy.Tutorial.java.snake.components.v3;

public class Location {
    private  int x;
    private int y;

    public Location(){

    }

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Location(Location location)
    {
        this.x = location.x;
        this.y = location.y;
    }

    public int getX(){return x;}
    public void setX(int x){this.x = x;}
    public int getY(){return y;}
    public void setY(int y){this.y = y;}
}
