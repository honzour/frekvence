package cz.honza.frekvence;

import cz.honza.frekvence.analyza.RozdilyLinearni;
import cz.honza.frekvence.generovane.IPosloupnost;
import cz.honza.frekvence.generovane.NahodnaProchazka;

public class Main {

	public static void main(String[] args) {
		IPosloupnost prochazka = new NahodnaProchazka(0);
		double[] funkce = new double[3];
		for (int i = 0; i < funkce.length; i++) {
			funkce[i] = prochazka.next();
		}

		double[] rozdily = RozdilyLinearni.rozdily(funkce);
		
		System.out.println("Pole:");
		
		for (int i = 0; i < funkce.length; i++) {
			System.out.println(funkce[i]);
		}
		
		System.out.println("Rozdily:");
		
		for (int i = 0; i < rozdily.length; i++) {
			System.out.println(rozdily[i]);
		}
	}

}
