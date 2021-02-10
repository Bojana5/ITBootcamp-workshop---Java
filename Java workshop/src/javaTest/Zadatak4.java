package javaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		//NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
		//Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
		//1 evro je 0,0085 dinara
		//1 franak je 0,0093 dinara
		//1 dolar je 0,010 dinara
		//Ispise vrsiti iskljucivo iz main metode
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite iznos u dinarima: 
		//1200
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//evro
		//1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti
		//Primer ispisa u konzoli kad se unese pogresna valuta
		        
		//Molim vas unesite iznos u dinarima: 
		//123
		//Molim vas da unesete valutu u koju da konvertujemo dinare: 
		//zlato
		//Niste uneli dobru valutu
		
		Scanner sc = new Scanner(System.in);
		double iznos;
		String valuta;
		
		System.out.println("Molim vas unesite iznos u dinarima:");
		iznos = sc.nextDouble();
		System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare (evro, franak, dolar):");
		valuta = sc.next();
		
		double konverzija = konverzija(iznos, valuta);
		
		if (konverzija > 0) {
			System.out.println(iznos + " dinara, kad se prebaci u " + valuta + ", iznosi " + konverzija + " u toj valuti.");
		} else {
			System.out.println("Niste uneli dobru valutu.");
		}
		

	}
	
	public static double konverzija(double iznos, String valuta) {
		
		double konverzija;
		
		switch (valuta) {
		case "evro":{
			konverzija = iznos*0.0085;
			return konverzija;
		}
		case "franak":{
			konverzija = iznos*0.0093;
			return konverzija;
		}
		case "dolar":{
			konverzija = iznos*0.010;
			return konverzija;
		}
		default:{
			return 0;
			
		}
		}
	}

}
