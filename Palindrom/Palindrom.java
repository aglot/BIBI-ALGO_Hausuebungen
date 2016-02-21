package Primzahlen_berechnen;

import java.util.Scanner;

public class Palindrom {

	public Palindrom() {
		
	}
	
	public static boolean istPalindrom(String s)
	{
		if(s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length()-1))
		{
			return istPalindrom(s.substring(1, s.length()-1));
		}
		return false;
	}

	public static void main(String[] args) {
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte geben Sie ein Wort ein!");
			String s = sc.nextLine();
			if(istPalindrom(s))
			{
				System.out.println(s + " ist Palindrom!");
			}
			else{
				System.out.println(s + " ist nicht Palindrom!");
			}

		}
	}

}
