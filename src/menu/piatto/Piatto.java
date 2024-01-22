package menu.piatto;

import menu.prodotto.Prodotto;

public class Piatto extends Prodotto{
	
	private String ingredienti;

	public Piatto(String nome, String ingredienti, Double costo) {
		super(nome, costo);
		this.ingredienti = ingredienti;
	}

	public String getIngredienti() {
		return ingredienti;
	}
	
}
