import telas.Creditos;
import telas.Fase;
import telas.Gameover;
import telas.Menu;
import telas.Tela;
import java.awt.Graphics;

public class Jogo {		//lucas.sousa@ifce.edu.br
    private static Tela[] arrTelas;
    public static void main( String[] args) {
      
    	public void paint(Graphics g)
        {
            // Draws the img to the BackgroundPanel.
            g.drawImage(, 0, 0, null);
        }
    	
        arrTelas = new Tela[] {
            new Menu(), new Fase(), new Creditos(), new Gameover()
        };

        while(Tela.telaAtual != -1) {
            System.out.print("");
        	int j = verificarTelaAtividada();
            if (j != Tela.telaAtual) {
                trocarTela(j, Tela.telaAtual);
            }
        }

    }

    public static void trocarTela(int k, int i) {
        if (k >= 0)
            arrTelas[k].setVisible(false);

        arrTelas[i].setVisible(true);
    }

    public static int verificarTelaAtividada() {
        int j = -1;

        for (int i = 0; i < arrTelas.length; i++) {
        	
            if (arrTelas[i].isVisible() == true) {
                j = i;
                break;
            }
        }

        return j;
    }

}
 //falta o looping do orquestrador na main, botar os actio