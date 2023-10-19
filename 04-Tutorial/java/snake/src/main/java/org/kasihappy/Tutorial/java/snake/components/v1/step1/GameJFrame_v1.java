/*使用Timer实现贪吃蛇小游戏 - v1
    在一个JFrame组件内呈现贪吃蛇
 */
package org.kasihappy.Tutorial.java.snake.components.v1.step1;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameJFrame_v1 extends JFrame
     implements KeyListener,ActionListener
{
    /*p1 - 定义窗体的布局参数*/
    public static final int FRAME_WIDTH=800;
    public static final int FRAME_HEIGHT=600;
    public static final int FRAME_TIPS=80;

    /*p2 - 定义面板的高度和宽度*/
    public static final int PANEL_WIDTH=800;
    public static final int PANEL_HEIGHT=520;

    /*p3 - 声明贪吃蛇的长度*/
    int snakeLength = 3;
    /*p4 - 声明贪吃蛇单元像素数*/
    int snakeUnit = 10;

    /*p5 - 声明贪吃蛇的20*20矩形块的坐标值，最长100块申请空间*/
    Point[] snakePoint = new Point[100];
    /*p6 - 贪吃蛇的方向, 0-ip, 1-down, 2-left, 3-right*/
    int direction = 3;
    /*p7 - 设置游戏状态 0-未开始， 1-开始, 2-结束*/
    int gameState = 0;
    /*p8 - 设置游戏开始y坐标值*/
    int initPointY = 200;
    /*p9 - 设置计时器， 每100毫秒一次*/
    Timer timer = new Timer(100, this);

    /*M1 - 建立布局窗体*/
    public void runGameJFrame()
    {
        /*设置窗体标题*/
        this.setTitle("贪吃蛇小游戏 v1");
        /*设置窗体尺寸*/
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        /*设置窗体尺寸不可调整*/
        this.setResizable(false);
        /*设置窗体关闭操作*/
        this.setDefaultCloseOperation(GameJFrame_v1.EXIT_ON_CLOSE);
        /*获取当前屏幕的宽度和高度*/
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        /*设置窗口默认位置，以在屏幕当中显示*/
        this.setLocation((width - FRAME_WIDTH) / 2, (height - FRAME_HEIGHT) / 2);
        /*设置窗体为关注焦点*/
        this.setFocusable(true);
        /*设置键盘事件监听器*/
        this.addKeyListener(this);
        /*设置窗体可见性*/
        this.setVisible(true);

        //设置贪吃蛇初始位置
        snakePoint[0] = new Point(3*snakeUnit, initPointY);
        snakePoint[1] = new Point(2*snakeUnit, initPointY);
        snakePoint[2] = new Point(snakeUnit, initPointY);
    }

    public void paint(Graphics g)
    {
        /*绘制窗体背景*/
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        /*绘制画布（游戏）区域*/
        g.setColor(Color.BLACK);
        /*前两个参数是游戏区域左上角位置坐标*/
        g.fillRect(0, FRAME_TIPS, PANEL_WIDTH, PANEL_HEIGHT);

        /*绘制贪吃蛇*/
        for (int i = 0; i < snakeLength; i++)
        {
            g.setColor(Color.white);
            g.fillRect(snakePoint[i].x, snakePoint[i].y, snakeUnit, snakeUnit);
        }

        /*显示提示信息*/
        g.setColor(Color.BLACK);
        g.setFont(new Font("宋体", 10, 20));
        g.drawString("按下<空格>开始游戏", 300, 65);

    }

    /*undo M-3 监听处理方法，控制贪吃蛇的移动*/
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }

    /*undo M-5 键盘输入的处理方法*/
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /*undo M-4 获取键盘输入值的处理方法*/
    @Override
    public void keyPressed(KeyEvent e) {

    }

    /*undo M-6 键盘释放处理方法*/
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
