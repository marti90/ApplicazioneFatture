package it.alfasoft.martina;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FatturaService implements iFatturaService {
	
	FatturaDAO fDao = new FatturaDAO();
	
	@Override
	@WebMethod
	public Fattura[] prendiTutteFatture(){
		
		return fDao.prendiTutteFatture();
	}
	
	@Override
	@WebMethod
	public Fattura getFatturaConCodice(String codice){
		
		return fDao.getFatturaConCodice(codice);
	}

}
