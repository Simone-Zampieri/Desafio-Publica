package modelo;

public class Jogo {

	// Atributos
	private int placar, minimoTemporada, maximoTemporada, minimoRecorde, maximoRecorde;

	// Construtor
	public Jogo(int placar, int minimoTemporada, int maximoTemporada, int minimoRecorde, int maximoRecorde) {
		this.placar = placar;
		this.minimoTemporada = minimoTemporada;
		this.maximoTemporada = maximoTemporada;
		this.minimoRecorde = minimoRecorde;
		this.maximoRecorde = maximoRecorde;
	}

	// Get e Set
	public int getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

	public int getMinimoTemporada() {
		return minimoTemporada;
	}

	public void setMinimoTemporada(int minimoTemporada) {
		this.minimoTemporada = minimoTemporada;
	}

	public int getMaximoTemporada() {
		return maximoTemporada;
	}

	public void setMaximoTemporada(int maximoTemporada) {
		this.maximoTemporada = maximoTemporada;
	}

	public int getMinimoRecorde() {
		return minimoRecorde;
	}

	public void setMinimoRecorde(int minimoRecorde) {
		this.minimoRecorde = minimoRecorde;
	}

	public int getMaximoRecorde() {
		return maximoRecorde;
	}

	public void setMaximoRecorde(int maximoRecorde) {
		this.maximoRecorde = maximoRecorde;
	}

}