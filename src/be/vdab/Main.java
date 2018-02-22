package be.vdab;

import be.vdab.entities.EilandSpel;

public class Main {

	public static void main(String[] args) {
		
		EilandSpel es =  new EilandSpel();
		EilandSpel esm =  new EilandSpel("inwoners.txt");
		
		es.setEilandBestand("inwoners.txt");
		es.startSpel();
		es.toonInwoners();
		es.vulkaanUitbarsting();
		es.eindVulkaanUitbarsting();
				
		esm.startSpel();

		esm.toonInwoners();

	}

}
