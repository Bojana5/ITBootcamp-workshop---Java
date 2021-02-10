package testKlase;

public class Main {

	public static void main(String[] args) {
		
		Planina planina = new Planina("Kopaonik", "Srbija", 2017);
		
		Planinar r1 = new RekreativniPlaninar(123, "Petar", "Petrovic", 2, "Sumadijski", 3000);
		Planinar r2 = new RekreativniPlaninar(321, "Marko", "Markovic", 0, "Pomoravski", 1200);
		Planinar r3 = new RekreativniPlaninar(456, "Janko", "Jankovic", 5, "Sumadijski", 2020);
		
		Planinar a1 = new Alpinista(987, "Ivan", "Ivanovic", 20);
		Planinar a2 = new Alpinista(618, "Ana", "Ivanovic", 3);
		Planinar a3 = new Alpinista(379, "Mara", "Maric", 0);
		
		Planinar[] planinari = {r1, r2, r3, a1, a2, a3};
		
		double zbirClanarina = 0;
		for (int i = 0; i < planinari.length; i++) {
			planinari[i].stampaj();
			System.out.println("Planinar ce se popeti n planinu: " + planinari[i].uspesanUspon(planina));
			System.out.println("------------------------------------------------------------------------------");
			
			zbirClanarina = zbirClanarina + planinari[i].clanarina();
		}
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Zbir clanarina svih planinara je: " + zbirClanarina);
	}

}

/*
 Kreirati glavnu klasu I u njoj: 
instancirati jednu planinu
napraviti niz koji ce sadrzati tri rekrativna planinara I tri alpiniste
ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti na instanciranu planinu
ispisati kolika je zbir svih clanarina planinara iz niza 
 */


