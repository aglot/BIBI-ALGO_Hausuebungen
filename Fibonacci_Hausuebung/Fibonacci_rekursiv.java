package Primzahlen_berechnen;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci_rekursiv {
	
	ArrayList<Integer> fibon = new ArrayList<Integer>();

	public Fibonacci_rekursiv() {
	}
		
	public int rechneFibo(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			return rechneFibo(n-1) + rechneFibo(n-2);
		}
		
	}

	public static void main(String[] args) {
		Fibonacci_rekursiv fr = new Fibonacci_rekursiv();
		System.out.println("Geben Sie die Anzahl der zu berechnenden Fibonacci-Zahlen ein: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 1; i < n+1; i++)
		{
			System.out.println(fr.rechneFibo(i));
		}
		s.close();
		

	}

}
