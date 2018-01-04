package be.vdab.util;

public enum InwonerTekens {
	V("be.vdab.inwoners.Vogel"), Z("be.vdab.inwoners.Zoogdier");

	private String classNaam;

	private InwonerTekens(String classNaam) {
		this.classNaam = classNaam;
	}
	
	public String getClassNaam() {
		return classNaam;
	}
	
}
