package exercice2.com.supinfo.java;

public class Revue extends Document {
	private int mois;
	private int annee;
	
	public Revue(int enregistement, String titre, int mois, int annee) {
		super(enregistement, titre);
		this.mois = mois;
		this.annee = annee;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return super.toString() + "Revue [mois=" + mois + ", annee=" + annee + "]";
	}
	
}