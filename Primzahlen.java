package Primzahlen_berechnen;

import java.util.ArrayList;
import java.util.Scanner;

public class Primzahlen {

	public Primzahlen() {
	}

	public void berechnen() {
		int anzprim = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Obergrenze ein: ");
		long obergrenze = sc.nextLong();
		long start = System.currentTimeMillis();
		System.out.println(obergrenze);

		ArrayList<Boolean> arr = new ArrayList<Boolean>();

		for (int i = 0; i <= obergrenze; i++) {
			arr.add(i, true);
		}

		for (int i = 2; i <= obergrenze; i++) {
			if (arr.get(i) == true) {
				int j = i;
				do {
					j = j + i;
					if (j <= obergrenze) {
						arr.set(j, false);
					}
				} 
				while (j <= obergrenze);
			}
		}
		for (int i = 0; i <= obergrenze - 1; i++) {
			if (arr.get(i) == true && i > 1) {
				anzprim++;
				// System.out.println(i);
			}
		}
		long stopp = System.currentTimeMillis() - start;
		System.out.println("Anzahl Primzahlen: " + anzprim);
		System.out.println("benötigte Zeit: " + stopp + " Millisekunden \t" + (double) stopp / 1000 + " Sekunden");
		sc.close();
	}
	
	public void berechnen2() {
		int anzprim = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Obergrenze ein: ");
		int obergrenze = sc.nextInt();
		sc.close();
		long start = System.currentTimeMillis();
		System.out.println(obergrenze);

		boolean arr[] = new boolean[obergrenze];

		for (int i = 0; i < obergrenze; i++) {
			arr[i] = true;
		}
		System.out.println("Hat geklappt!");

		for (int i = 2; i < obergrenze; i++) {
			if (arr[i] == true) {
				int j = i;
				do {
					j = j + i;
					if (j < obergrenze) {
						arr[j] = false;
					}
				} 
				while (j < obergrenze);
			}
		}
		for (int i = 0; i < obergrenze -1; i++) {
			if (arr[i] == true && i > 1) {
				anzprim++;
				// System.out.println(i);
			}
		}
		long stopp = System.currentTimeMillis() - start;
		System.out.println("Anzahl Primzahlen: " + anzprim);
		System.out.println("benötigte Zeit: " + stopp + " Millisekunden \t" + (double) stopp / 1000 + " Sekunden");

	}

}
