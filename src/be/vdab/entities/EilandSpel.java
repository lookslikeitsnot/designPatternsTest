package be.vdab.entities;

import be.vdab.util.InwonersLader;

public class EilandSpel {
	private Eiland eiland;
	private String bestandNaam;
	

	public EilandSpel() {
	}	
	
	public EilandSpel(String bestandNaam) {
		this.bestandNaam = bestandNaam;
	}

	public void setEilandBestand(String bestandNaam) {
		this.bestandNaam = bestandNaam;
	}
	
	public void startSpel() {
		if(bestandNaam == null) {
			System.out.println("Geef eerst een bestand met alle inwoners");
		}
		else {
			this.eiland = new Eiland(new InwonersLader().laadInwoners(bestandNaam));
		}
	}
	
	public void toonInwoners() {
		if(eiland != null && !eiland.getInwoners().isEmpty()) {
			System.out.println("Op het eiland wonen nu deze inwoners: ");
			for(Inwoner inwoner: eiland.getInwoners()) {
				System.out.println(inwoner);
			}
		}
		else {
			System.out.println("Start eerst het spel!");
		}
	}
	
	public void vulkaanUitbarsting() {
		System.out.println("Er gebeurt plots een vulkaanuitbarsting!");
		this.eiland.vulkaanuitbarsting();
	}
	
	public void eindVulkaanUitbarsting() {
		System.out.println("Alles word weer rustig...");
		this.eiland.eindeVulkaanuitbarsting();
	}
	
}
