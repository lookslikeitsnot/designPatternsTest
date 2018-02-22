package be.vdab.entities;

import java.util.Observable;
import java.util.Observer;

public abstract class Inwoner implements Observer{
	private String naam;
	private final String reactie;
	private final String eindReactie;
	
	protected Inwoner(String naam, String reactie, String eindReactie) {
		this.naam = naam;
		this.reactie = reactie;
		this.eindReactie = eindReactie;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public String getReactie(){
		return reactie;
	}
	
	public String getEindReactie(){
		return eindReactie;
	}
	
	@Override
	public void update(Observable obs, Object obj) {
		if (!(obs instanceof Eiland) || !(obj instanceof Boolean)) {
			throw new IllegalArgumentException();
		}
		StringBuilder str = new StringBuilder();
		str.append(this.getClass().getSimpleName());
		str.append(" ");
		str.append(naam);
		str.append(" ");
		if ((Boolean) obj) {
			str.append("reageerd op de vulkaanuitbarsting en ");
			str.append(this.getReactie());
		} else {
			str.append("reageerd op het einde van de vulkaanuitbarsting en ");
			str.append(this.getEindReactie());
		}
		System.out.println(str.toString());

	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.getClass().getSimpleName());
		str.append(" ");
		str.append(naam);
		return str.toString();
	}
	
	
}
