package teste_unitario;

import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import controle.Controle;
import modelo.Jogo;

public class TesteControle {

	@Test
	@RepeatedTest(99)
	void test() {
		Jogo j1 = new Jogo(0, 0, 0, 0, 0);

		Controle.cadastrar(j1);

		Controle.listar();

		Controle.recordesQuebrados();
	}
}
