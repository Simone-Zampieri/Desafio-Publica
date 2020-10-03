package controle;

import javax.swing.table.DefaultTableModel;

import lista.ListaJogos;
import modelo.Jogo;

public class Controle {
	
	// Efetuar Cadastro
	public static void cadastrar(Jogo j) {
		ListaJogos.lista.add(j);
	}
	
	// Listar jogos
	public static DefaultTableModel listar() {
		
		// Objeto DefaultTableModel
		DefaultTableModel dtm = new DefaultTableModel();
		
		// Colunas
		dtm.addColumn("Jogo");
		dtm.addColumn("Placar");
		dtm.addColumn("Mínimo de temporada");
		dtm.addColumn("Máximo de temporada");
		dtm.addColumn("Mínimo de Recorde");
		dtm.addColumn("Máximo de Recorde");
		
		// Índice que será exibido na tabela
		int indiceJogo = 1;
		
		// Adicionar os dados dos jogos
		for(int indice=0; indice<ListaJogos.lista.size(); indice++) {
		
			dtm.addRow(new Object[] {
				indiceJogo++,
				ListaJogos.lista.get(indice).getPlacar(),
				ListaJogos.lista.get(indice).getMinimoTemporada(),
				ListaJogos.lista.get(indice).getMaximoTemporada(),
				ListaJogos.lista.get(indice).getMinimoRecorde(),
				ListaJogos.lista.get(indice).getMaximoRecorde(),
			});
		}
		
		// Retornar DefaultTableModel
		return dtm;
		
	}
	
	// Retornar a quantidade de recordes quebrados
	public static int recordesQuebrados() {
		
		// Quantidade
		int quantidade = 0;
		
		// Laço
		for(int indice=0; indice<ListaJogos.lista.size(); indice++) {
			quantidade += ListaJogos.lista.get(indice).getMaximoRecorde();
		}
		
		
		// Retorno
		return quantidade;
		
	}
	
	public static int calculoMaximoTemporada() {
		
		int quantidade = 0;
		
		for(int indice=0; indice<ListaJogos.lista.size(); indice++) {
			quantidade += ListaJogos.lista.get(indice).getMaximoTemporada();
		}
		
		return quantidade;
		
	}

	public static int calculoMinimoTemporada() {

		int quantidade = 0;
		
		for (int indice=0; indice<ListaJogos.lista.size(); indice++) {
			quantidade += ListaJogos.lista.get(indice).getMinimoTemporada();
		}
		
		return quantidade;
}
	
}



