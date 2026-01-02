package cz.honza.frekvence;

import cz.honza.frekvence.generovane.IPosloupnost;
import cz.honza.frekvence.generovane.NahodnaProchazka;

public class Main {

	public static void main(String[] args) {
		IPosloupnost prochazka = new NahodnaProchazka(0);
		for (int i = 0; i < 1000000; i++) {
			System.out.println(prochazka.next());
		}

	}

}
