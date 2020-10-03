package validar;

import modelo.Jogo;

public class ValidaCadastro {

	// Atributo
	Jogo j;

	// Construtor
	public ValidaCadastro(Jogo j) {
		this.j = j;
	}

	// Validar se os valores são negativos
	public boolean valoresNegativos() {

		// Valida
		boolean valida = true;

		// Condicional
		if (j.getPlacar() < 0 || j.getMinimoTemporada() < 0 || j.getMaximoTemporada() < 0 || j.getMinimoRecorde() < 0
				|| j.getMaximoRecorde() < 0) {
			valida = false;
		}

		// Retorno
		return valida;

	}

	// Validar se os valores são maiores ou iguais a 1000
	public boolean valoresMaioresOuIguaisA1000() {

		// Valida
		boolean valida = true;

		// Condicional
		if (j.getPlacar() >= 1000 || j.getMinimoTemporada() >= 1000 || j.getMaximoTemporada() >= 1000
				|| j.getMinimoRecorde() >= 1000 || j.getMaximoRecorde() >= 1000) {
			valida = false;
		}

		// Retorno
		return valida;

	}

}