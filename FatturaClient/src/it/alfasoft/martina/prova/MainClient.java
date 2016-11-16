package it.alfasoft.martina.prova;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import it.alfasoft.martina.Fattura;
import it.alfasoft.martina.FatturaService;
import it.alfasoft.martina.FatturaServiceServiceLocator;

public class MainClient {

	public static void main(String[] args) {
		
		FatturaServiceServiceLocator locator = new FatturaServiceServiceLocator();
		
		try {
			FatturaService fs = locator.getFatturaService();
			Fattura fattura= fs.getFatturaConCodice("MRT020190");
			System.out.println(fattura.getCodiceCliente()+" "+fattura.getRagioneSociale()+" "+fattura.getImporto());
			
			Fattura[] arrayFatture= fs.prendiTutteFatture(); 
			for(int i=0;i<5;i++){
				System.out.println(arrayFatture[i].getCodiceCliente()+
						" "+arrayFatture[i].getRagioneSociale()+" "+arrayFatture[i].getImporto());
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
