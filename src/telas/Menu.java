package telas;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;

public class Menu extends Tela {
    private JButton startButton;
    private Painel painel;
    private Image fundo;

    public Menu(){
        this.painel = new Painel();
        this.startButton = new JButton();

        this.setTitle("MENU");
        this.startButton.setText("Start");
        this.startButton.setBackground(Color.WHITE);
        this.startButton.setBounds(32, 60, 110, 33);
        Image fundo = Toolkit.getDefaultToolkit().createImage("background.jpg");
   

        //this.add(painel);
        //painel.add(this.startButton);
        
        this.add(startButton);


        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tela.telaAtual = 1;
            }
        });
        
    }

    
    

}

