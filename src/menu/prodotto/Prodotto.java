package menu.prodotto;

public class Prodotto{
	
	private String nome;
	private Double costo;
	
	public Prodotto(String nome, Double costo) {
		this.nome = nome;
		this.costo = costo;
	}

	public String getNome() {
		return nome;
	}

	public Double getCosto() {
		return costo;
	}
	
}
