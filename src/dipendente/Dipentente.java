package dipendente;

public abstract class Dipentente {
	
	private String matricola;
	private String nomeCognome;
	private Boolean presente;
	
	public Dipentente(String matricola, String nomeCognome, Boolean presente) {
		super();
		this.matricola = matricola;
		this.nomeCognome = nomeCognome;
		this.presente = presente;
	}

	public Boolean getPresente() {
		return presente;
	}

	public void setPresente(Boolean presente) {
		this.presente = presente;
	}

	public String getMatricola() {
		return matricola;
	}

	public String getNomeCognome() {
		return nomeCognome;
	}
		
}
