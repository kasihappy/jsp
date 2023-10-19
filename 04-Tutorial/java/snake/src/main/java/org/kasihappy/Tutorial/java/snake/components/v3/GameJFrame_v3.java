/*使用Timer实现贪吃蛇小游戏 - v1
    在一个JFrame组件内呈现贪吃蛇
 */
package org.kasihappy.Tutorial.java.snake.components.v3;


import javax.swing.*;
import java.awt.*;

public class GameJFrame_v3 extends JFrame
{
    /*p1 - 定义窗体的布局参数*/
    public static final int FRAME_WIDTH=800;
    public static final int FRAME_HEIGHT=600;

    /*p2 - 定义画布面板组件变量*/
    GameJPanel_v3 gameJPanel;

    /*M1 - 构造方法*/
    public GameJFrame_v3(){}
    public void runGameJFrame()
    {
        /*设置窗体标题*/
        this.setTitle("贪吃蛇小游戏 v1");
        /*设置窗体尺寸*/
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        /*设置窗体尺寸不可调整*/
        this.setResizable(false);
        /*设置窗体关闭操作*/
        this.setDefaultCloseOperation(GameJFrame_v3.EXIT_ON_CLOSE);
        /*获取当前屏幕的宽度和高度*/
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        /*设置窗口默认位置，以在屏幕当中显示*/
        this.setLocation((width - FRAME_WIDTH) / 2, (height - FRAME_HEIGHT) / 2);
        /*设置窗体为关注焦点*/
        this.setFocusable(true);
        /*设置窗体可见性*/
        this.setVisible(true);
        GameJFrame_v3 gf = new GameJFrame_v3();
        gf.setVisible(true);

    }

}
