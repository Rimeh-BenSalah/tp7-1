package tp8;

public class Villa extends  PropriétéPrivée{
	private boolean avecPiscine;
	public Villa(int id,Personne responsable,String adresse,double surface ,int nbPièces,boolean avecPiscine) {
		super(id,responsable,adresse,surface,nbPièces);
		this.avecPiscine=avecPiscine;
	}
	public String toString() {
		return super.toString()+avecPiscine;
	}
	public double calculImpot(){
		if(avecPiscine) {
			return super.calculImpot()+200;}
		else {
			return 0;
		}
	}

}
