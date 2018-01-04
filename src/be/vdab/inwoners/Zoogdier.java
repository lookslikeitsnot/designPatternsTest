package be.vdab.inwoners;

import be.vdab.Inwoner;

public class Zoogdier extends Inwoner{
	private static String reactie = "schuilt in zijn hol";
	private static String eindReactie = "kruipt uit zijn hol";

	public Zoogdier(String naam) {
		super(naam, reactie, eindReactie);
	}
}
