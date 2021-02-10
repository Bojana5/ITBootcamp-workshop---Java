package javaTest;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
		//Proizvoljno napravite niz od 10 brojeva
		//korisnik unosi broj koji zeli da prebroji u nizu
		        
		//Primer niza {2, 12, 432, 21, 2, 7, 12, 2, 21, -2}
		//Primeri ispisa u konzoli
		        
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//2
		//Broj 2 se pojavljuje 3. puta u nasem nizu brojeva
		//Primer ispisa kad se unese broj koji ne postoji u nizu brojeva
		        
		//Unesite broj koji zelite da prbrojimo u nizu brojeva:
		//8
		//Broj 8 se ne pojavljuje u nasem nizu
		Scanner sc = new Scanner(System.in);
		
		int[] niz = {2, 12, 432, 21, 2, 7, 12, 2, 21, -2};
		int broj;
		
		System.out.println("Unesite broj koji zelite da prbrojimo u nizu brojeva:");
		broj = sc.nextInt();
		
		int pojavljivanje = pojavljivanje(niz, broj);
		
		if (pojavljivanje>0) {
			System.out.println("Broj " + broj + " se pojavljuje " + pojavljivanje + ". puta u nasem nizu brojeva.");
		} else {
			System.out.println("Broj " + broj + " se ne pojavljuje u nasem nizu.");
		}
		

	}
	
	public static int pojavljivanje (int[] niz, int broj) {
		
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			
			if (niz[i] == broj) {
				brojac++;
			}
		}
		
		return brojac;
	}

}
