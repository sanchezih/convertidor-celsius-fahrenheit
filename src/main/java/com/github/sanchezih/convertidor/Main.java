package com.github.sanchezih.convertidor;

public class Main {
	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("Se debe indicar la temperatura a convertir");
			System.exit(-1);
		}

		float c = Float.parseFloat(args[0]);
		float f = ((c * 9) / 5) + 32;
		System.out.println("La temperatura en Fahrenheit es: " + f);
	}
}
