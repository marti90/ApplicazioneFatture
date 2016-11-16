package it.alfasoft.martina;

public interface iFatturaService {

	public abstract Fattura[] prendiTutteFatture();

	public abstract Fattura getFatturaConCodice(String codice);

}
