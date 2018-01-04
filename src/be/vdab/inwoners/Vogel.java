package be.vdab.inwoners;

import be.vdab.Inwoner;

public class Vogel extends Inwoner{
	private static String reactie = "vliegt hoger";
	private static String eindReactie = "vliegt lager";

	public Vogel(String naam) {
		super(naam, reactie, eindReactie);
	}
}
