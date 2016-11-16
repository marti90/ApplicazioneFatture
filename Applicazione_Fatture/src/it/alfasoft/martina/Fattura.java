package it.alfasoft.martina;

public class Fattura {
	
	private String codiceCliente;
	private String ragioneSociale;
	private double importo;
	
	public Fattura(){
		
	}

	public Fattura(String codiceCliente, String ragioneSociale, double importo) {
		
		this.codiceCliente = codiceCliente;
		this.ragioneSociale = ragioneSociale;
		this.importo = importo;
	}

	public String getCodiceCliente() {
		return codiceCliente;
	}

	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	

}
