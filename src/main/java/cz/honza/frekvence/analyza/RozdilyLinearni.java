package cz.honza.frekvence.analyza;

public class RozdilyLinearni {
	public static double[] rozdily(double[] funkce) {
		double[] rozdily = new double[funkce.length - 1];
		
		for (int delkaRozdilu = 0; delkaRozdilu < rozdily.length - 1; delkaRozdilu++) {
			double suma = 0;
			for (int start = 0; start + delkaRozdilu < rozdily.length - 1; start++) {
				suma += rozdil(funkce, start, start + delkaRozdilu + 1);
			}
			rozdily[delkaRozdilu] = suma / (delkaRozdilu + 1);
		}
		return rozdily;
	}
	
	private static double rozdil(double[] pole, int odkud, int kam) {
		double min = pole[odkud];
		double max = min;
		
		for (int i = odkud + 1; i <= kam; i++) {
			if (pole[i] < min) {
				min = pole[i];
			}
			if (pole[i] > max) {
				max = pole[i];
			}
		}
		return max - min;
	}

}
