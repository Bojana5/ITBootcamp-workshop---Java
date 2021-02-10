package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		//Napisati program koji racuna potrosnju goriva
		//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
		//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
		//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
		        
		//Primeri ispisa u konzoli:
		        
		//Molim vas unesite distancu u kilometrima:
		//134
		//Molim vas unesite tip vozila: 
		//Kombi
		//Kombi na 134.0 km potrosi 14.74 litara goriva
		//Primer ispisa kad se unese pogresno vozilo
		        
		//Molim vas unesite distancu u kilometrima:
		//133
		//Molim vas unesite tip vozila: 
		//Tenk
		//Uneli ste pogresan tip vozila
		
		Scanner sc = new Scanner(System.in);
		double distanca;
		String tipVozila;
		double potrosnja;
		
		System.out.println("Molim vas unesite distancu u kilometrima:");
		distanca = sc.nextDouble();
		System.out.println("Molim vas unesite tip vozila (motor, automobil, kombi, kamion):");
		tipVozila = sc.next();
		
		switch (tipVozila) {
		case "motor":{
			potrosnja = distanca*0.05;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnja +" litara goriva");
			break;
		}
		case "automobil":{
			potrosnja = distanca*0.07;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnja +" litara goriva");
			break;
		}
		case "kombi":{
			potrosnja = distanca*0.11;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnja +" litara goriva");
			break;
		}
		case "kamion":{
			potrosnja = distanca*0.15;
			System.out.println(tipVozila + " na " + distanca + " km potrosi " + potrosnja +" litara goriva");
			break;
		}
		default:{
			System.out.println("Uneli ste pogresan tip vozila.");
			break;
		}
		}

	}

}
