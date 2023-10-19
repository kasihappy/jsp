package org.kasihappy.Tutorial.java.snake.components.v3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameJPanel_v3 extends JPanel
            implements ActionListener, KeyListener {
    /*p1 - 定义画布的宽度和高度*/
    public static final int PANEL_WIDTH=800;
    public static final int PANEL_HEIGHT=520;
    public static final int PANEL_TIPS=80;
    Direction direction = Direction.EAST;
    static int gameState = 0;
    JButton startButton, stopButton, quitButton;
    Snake snake;
    /*v3增加*/
    static Food food;
    static int score = 0;
    static int speed = 0;
    public GameJPanel_v3()
    {
        snake = new Snake();
        food = new Food();

        startButton = new JButton("开始");
        stopButton = new JButton("暂停");
        quitButton = new JButton("退出");

        setLayout(new FlowLayout(FlowLayout.LEFT));

        this.add(startButton);
        this.add(stopButton);
        this.add(quitButton);

        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        quitButton.addActionListener(this);

        this.addKeyListener(this);
        new Thread(new SnakeThread(this)).start();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, PANEL_TIPS, PANEL_WIDTH, PANEL_HEIGHT);
        g.drawString("分数：" + score + "  速度：" + speed + " 速度最大为100", 250, 25);
        snake.draw(g);
        food.draw(g);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == startButton)
        {
            gameState = 1;
            startButton.setEnabled(false);
            stopButton.setEnabled(true);
        }
        if (e.getSource() == stopButton)
        {
            gameState = 0;
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
        }
        if (e.getSource() == quitButton)
        {
            System.exit(0);
        }

        /*设置关注当前面板*/
        this.requestFocus();
    }
    public void keyPressed(KeyEvent e){
        if (gameState == 0)
        {
            return;
        }
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_UP:
                if (snake.getDirection() == (Direction.SOUTH))
                {
                    break;
                }
                snake.changeDirection(Direction.NORTH);
                break;
            case KeyEvent.VK_DOWN:
                if (snake.getDirection() == (Direction.NORTH))
                {
                    break;
                }
                snake.changeDirection(Direction.SOUTH);
                break;
            case KeyEvent.VK_LEFT:
                if (snake.getDirection() == (Direction.EAST))
                {
                    break;
                }
                snake.changeDirection(Direction.WEST);
                break;
            case KeyEvent.VK_RIGHT:
                if (snake.getDirection() == (Direction.WEST))
                {
                    break;
                }
                snake.changeDirection(Direction.EAST);
                break;
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
