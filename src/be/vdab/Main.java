package be.vdab;

public class Main {

	public static void main(String[] args) {
		
		EilandSpel es =  new EilandSpel();
		EilandSpel esm =  new EilandSpel("C:/TestFles/inwoners.txt");
		
		es.setEilandBestand("C:/TestFiles/inwoners.txt");
		es.startSpel();
		es.toonInwoners();
		es.vulkaanUitbarsting();
		es.eindVulkaanUitbarsting();
				
		esm.startSpel();

		esm.toonInwoners();

	}

}
