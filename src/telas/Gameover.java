package telas;

import javax.swing.JButton;
import java.awt.Color;

public class Gameover extends Tela{
    private JButton startButton;
    
    public Gameover(){
        new Painel();
        this.startButton = new JButton();

        this.startButton.setText("Voltar ao Menu");
        this.startButton.setBackground(Color.WHITE);
        this.startButton.setBounds(32, 60, 110, 33);
    }
}

