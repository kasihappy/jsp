package org.kasihappy.Tutorial.java.snake.components.v2;

public class SnakeThread implements Runnable{
    GameJPanel_v2 gp;
    public SnakeThread(GameJPanel_v2 gp)
    {
        this.gp = gp;
    }

    public void run() {
        while (true)
        {
            try {
                Thread.sleep(100);
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
