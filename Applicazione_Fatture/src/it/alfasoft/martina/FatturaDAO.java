package it.alfasoft.martina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FatturaDAO {
	
    private Map<String,Fattura> fatture;
    Fattura[] array = new Fattura[5];
	
	public FatturaDAO(){
		
		fatture= new HashMap<String,Fattura>();
		Fattura f1= new Fattura("MRT020190","Ing", 200);
		Fattura f2= new Fattura("LCA060390","Mecc", 1500);
		Fattura f3= new Fattura("IRN260390","Vet", 58);
		Fattura f4= new Fattura("RTA310190","Inf", 60);
		Fattura f5= new Fattura("GLA","Psi", 900);
		
		fatture.put(f1.getCodiceCliente(), f1);
		fatture.put(f2.getCodiceCliente(), f2);
		fatture.put(f3.getCodiceCliente(), f3);
		fatture.put(f4.getCodiceCliente(), f4);
		fatture.put(f5.getCodiceCliente(), f5);
	}

	public Map<String, Fattura> getFatture() {
		return fatture;
	}
	
    public Fattura[] prendiTutteFatture(){
		
		List<Fattura> listaFatture = new ArrayList<Fattura>(fatture.values());
		for(int i=0;i<5;i++){
			array[i]= listaFatture.get(i);
		}
		return array;
	}
	
	public Fattura getFatturaConCodice(String codice){
		return fatture.get(codice);
	}

}
