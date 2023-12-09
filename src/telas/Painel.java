package telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Painel extends JPanel implements Runnable{
    public Painel () {
        setPreferredSize(new Dimension(1920, 1080));
        setBackground(Color.BLACK);
        setVisible(true);
        setDoubleBuffered(true);
    }
    Thread gameThread;

    public void startGameThread(){
        gameThread = new Thread(this);
    }

    @Override
    public void run(){
        while(gameThread != null){

        }
    }

    public void update(){
        update();

        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }


}
