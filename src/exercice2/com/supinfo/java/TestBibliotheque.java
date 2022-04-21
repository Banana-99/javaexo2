package exercice2.com.supinfo.java;

public class TestBibliotheque {
	
	public static void main(String[] args) {
		Dictionnaire dictionnaire = new Dictionnaire(1, "Encyclopédie d'Éditions Larousse", "Français");
		System.out.println(dictionnaire);
		
		Livre livre = new Livre(2, "Le vieux nègre et la médaille", "Ferdinand OYONO", 701);
		System.out.println(livre);
		
		Manuel manuel = new Manuel(3, "JAVA COMME PREMIER LANGUAGE ", "JISKAR", 230, 1);
		System.out.println(manuel);

		Revue revue = new Revue(4, "la Revue d’histoire des sciences", 2, 2022);
		System.out.println(revue);

		Roman roman = new Roman(5, "L'enchanteur ", "RENE BARJAVEL", 433, PrixLitteraire.GONCOURT  );
		System.out.println(roman);

	}
}