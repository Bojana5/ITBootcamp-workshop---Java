package zadatak;

public class Main {
	
	/*
	 U glavnoj klasi kreirati niz pića (minimum dva koktela i dve kafe) dodati nekoliko sastojaka u svako piće, 
	 istestirati svake metodu (ne racunajuci getere i setere), i izracunati i ispisati ukupnu cenu svih pića.
	 */

	public static void main(String[] args) {

		Pice koktel1 = new Koktel("Pina kolada");
		Pice koktel2 = new Koktel("Plava laguna");
		
		Pice kafa1 = new Kafa("Domaca", 5);
		Pice kafa2 = new Kafa("Nescafe", 9);
		
		Sastojak sastojak1 = new Sastojak("beli rum", 5, 25);
		Sastojak sastojak2 = new Sastojak("sok od ananasa", 15, 10);
		Sastojak sastojak3 = new Sastojak("vodka", 7, 35);
		Sastojak sastojak4 = new Sastojak("sok od paradajza", 7, 8);
		Sastojak sastojak5 = new Sastojak("kafa", 2, 15);
		Sastojak sastojak6 = new Sastojak("voda", 2, 0);
		Sastojak sastojak8 = new Sastojak("mleko", 7,13);
		
		koktel1.dodajSastojak(sastojak1);
		koktel1.dodajSastojak(sastojak2);
		koktel2.dodajSastojak(sastojak3);
		koktel2.dodajSastojak(sastojak4);
		kafa1.dodajSastojak(sastojak5);
		kafa1.dodajSastojak(sastojak6);
		kafa2.dodajSastojak(sastojak5);
		kafa2.dodajSastojak(sastojak8);
				
		koktel1.ukupnaCenaPica();
		koktel1.stampaj();
		System.out.println("---------------------------------------------");
		kafa2.ukupnaCenaPica();
		kafa2.stampaj();
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("     Ukupna cena svih pica");
		System.out.println("--------------------------------------------------");
		Pice[] pica = {koktel1, koktel2, kafa1, kafa2};
		double suma = 0;
		for (int i = 0; i < pica.length; i++) {
			suma += pica[i].ukupnaCenaPica();
			pica[i].stampaj();
			System.out.println("--------------------------------------------------");
		}
		System.out.println(suma + " dinara");
		
		
		
	}

}
