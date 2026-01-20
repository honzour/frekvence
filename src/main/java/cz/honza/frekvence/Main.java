package cz.honza.frekvence;

import cz.honza.frekvence.analyza.RozdilyLinearni;
import cz.honza.frekvence.generovane.IPosloupnost;
import cz.honza.frekvence.generovane.NahodnaProchazka;

public class Main {

	public static void main(String[] args) {
		IPosloupnost prochazka = new NahodnaProchazka(0);
		double[] funkce = new double[1000];
		for (int i = 0; i < funkce.length; i++) {
			funkce[i] = prochazka.next() /*Math.sin(i / 100.0)*/;
		}

		double[] rozdily = RozdilyLinearni.rozdily(funkce);
		
		System.out.println("Pole:");
		
		for (int i = 0; i < funkce.length; i++) {
			System.out.println("Pole " + i + " " + funkce[i]);
		}
		
		System.out.println("Rozdily:");
		
		for (int i = 0; i < rozdily.length; i++) {
			System.out.println("Rozdíl " + i + " " + rozdily[i] + " tj. " + rozdily[i] / (i + 1));
		}
	}

}
