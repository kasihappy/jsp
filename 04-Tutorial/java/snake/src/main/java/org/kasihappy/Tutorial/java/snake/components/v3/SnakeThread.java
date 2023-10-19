package org.kasihappy.Tutorial.java.snake.components.v3;

public class SnakeThread implements Runnable{
    GameJPanel_v3 gp;
    public SnakeThread(GameJPanel_v3 gp)
    {
        this.gp = gp;
    }

    public void run() {
        while (true)
        {
            try {
                Thread.sleep(100 - GameJPanel_v3.speed >= 0 ? 100 - GameJPanel_v3.speed : 1);
                gp.repaint();
                if (gp.gameState == 1)
                {
                    gp.snake.move();
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
