package telas;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;

public class Menu extends Tela {
    private JButton startButton;
    private JPanel painel;
    private Image fundo;

    public Menu(){
        this.painel = new JPanel();
        this.startButton = new JButton();

        this.setTitle("MENU");
        this.startButton.setText("Start");
        this.startButton.setBackground(Color.WHITE);
        this.startButton.setBounds(700, 60, 110, 33);
        //ImageIcon icon = new ImageIcon("src/res/background.jpg");
        //this.fundo = icon.getImage();
        //fundo = Toolkit.getDefaultToolkit().getImage("src/res/background.jpg");
        ImageIcon ref = new ImageIcon("src//res//background.jpg");
		fundo = ref.getImage();
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        fundo = fundo.getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
         
   

        this.add(painel);
        painel.add(this.startButton);
        painel.setLayout(new BorderLayout());
        
        //this.add(startButton);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tela.telaAtual = 1;
            }
        });
        
        /*this.setContentPane(new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
               super.paintComponent(g);
               g.drawImage(fundo, 0, 0, this);
            }
         });*/
        
    }
    
    public void paint(Graphics g) {
    	super.paint(g);
    	g.drawImage(fundo, 0, 0, this);
    	
    	
    }


    
    

}

