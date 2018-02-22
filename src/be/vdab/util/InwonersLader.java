package be.vdab.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import be.vdab.entities.Inwoner;

public class InwonersLader {
	private List<Inwoner> inwoners;
	
	public InwonersLader() {
		inwoners = new ArrayList<>();
	}
	
	public InwonersLader(String bestandNaam) {
		inwoners = laadInwoners(bestandNaam);
	}

	public List<Inwoner> laadInwoners(String bestandNaam) {
		try (BufferedReader reader = new BufferedReader(new FileReader(bestandNaam));) {
			String bestandLijn = reader.readLine();
			while (bestandLijn != null) {
				inwoners.add(maakInwoner(bestandLijn.substring(0, 1), bestandLijn.substring(1)));
				bestandLijn = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Bestand niet gevonden");

		} catch (IOException e) {
			System.out.println("Er loopte iets fout tijdens het lezen van het bestand");

		} catch (InwonerException e) {
			System.out.println("Er loopte iets fout bij het maken van de Inwoner");

		}

		return inwoners;
	}

	private Inwoner maakInwoner(String inwonerTeken, String inwonerNaam) throws InwonerException {
		try {
			String classNaam = InwonerTekens.valueOf(inwonerTeken).getClassNaam();
			Inwoner inwoner = (Inwoner) Class.forName(classNaam)
					.getDeclaredConstructor(String.class)
					.newInstance(inwonerNaam);
			return inwoner;

		} catch (Exception e) {
			System.out.println(e);
			throw new InwonerException(e);
		}
	}
}
