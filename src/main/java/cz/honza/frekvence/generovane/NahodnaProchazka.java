package cz.honza.frekvence.generovane;

public class NahodnaProchazka implements IPosloupnost {
	
	private double hodnota;
	
	public NahodnaProchazka(double start) {
		hodnota = start;
	}

	@Override
	public double next() {
		hodnota += (Math.random() - 0.5);
		return hodnota;
	}
	
}
