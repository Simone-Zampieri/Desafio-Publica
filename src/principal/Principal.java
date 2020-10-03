package principal;

import java.awt.EventQueue;

import lista.ListaJogos;
import modelo.Jogo;
import visao.Formulario;

public class Principal {

	public static void main(String[] args) {

		// Criar lista de jogos
		ListaJogos.lista.add(new Jogo(12, 12, 12, 0, 0));
		ListaJogos.lista.add(new Jogo(24, 12, 24, 0, 1));
		ListaJogos.lista.add(new Jogo(10, 10, 24, 1, 1));
		ListaJogos.lista.add(new Jogo(24, 10, 24, 1, 1));

		// Formulário
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}