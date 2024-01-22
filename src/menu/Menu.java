package menu;

import menu.piatto.Piatto;
import menu.prodotto.Prodotto;

/**
 * 
 * @author Daniel
 * 
 * @class che contiene le @collections di piatti e prodotti in vendita.
 * (meglio evitare di aggiungere @methods implementati in questa @class siccome non dovrà 
 * mai essere istanziata)
 *
 */

public abstract class Menu {
	
	private static Piatto[] piatti = {
			new Piatto("Margherita", "Pane, mozzarella, Succo di pomodoro, Origano", 5.00),
			new Piatto("Patatine", "Patatine fritte, Sale", 3.00),
			new Piatto("Porzione Piccola Pulled Pork", "Pulled pork, Cheddar", 4.00)
	};
	private static Prodotto[] prodotto = {
			new Prodotto("Acqua", 1.50),
			new Prodotto("Birra", 3.00)
	};
	
	public static Piatto[] getPiatti() {
		return piatti;
	}
	public static Prodotto[] getProdotto() {
		return prodotto;
	}
	
}
