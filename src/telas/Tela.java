package telas;

import javax.swing.JFrame;

public class Tela extends JFrame{
	public static int telaAtual = 0;

	public Tela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1920, 1080);
		setVisible(false);
	}
}
