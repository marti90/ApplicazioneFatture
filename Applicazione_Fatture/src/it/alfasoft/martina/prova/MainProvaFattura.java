package it.alfasoft.martina.prova;

import it.alfasoft.martina.FatturaService;

import javax.xml.ws.Endpoint;

public class MainProvaFattura {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1324/ApplicazioneFatture",  
		         new FatturaService());

	}

}
