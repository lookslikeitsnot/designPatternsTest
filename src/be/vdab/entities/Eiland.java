package be.vdab.entities;

import java.util.List;
import java.util.Observable;

public class Eiland extends Observable{
	List<Inwoner> inwoners;
	
	public Eiland(List<Inwoner> inwoners) {
		this.inwoners = inwoners;
		for(Inwoner inwoner : inwoners) {
			addObserver(inwoner);
		}
	}

	public void vulkaanuitbarsting() {
		setChanged();
		notifyObservers(true);
	}
	
	public void eindeVulkaanuitbarsting() {
		setChanged();
		notifyObservers(false);
	}

	public List<Inwoner> getInwoners() {
		return inwoners;
	}
	
}
