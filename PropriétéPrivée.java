package tp8;

public class PropriétéPrivée extends Propriété{
	protected int nbPièces;
	public PropriétéPrivée (int id,Personne responsable,String adresse,double surface ,int nbPièces) {
		super(id,responsable,adresse,surface);
		this.nbPièces=nbPièces;
	}
    public int getNbPieces() { 
    	return nbPièces; }
	@Override
	public String toString() {
		return super.toString()+nbPièces;
	}
	public double calculImpot() {
		return 50*(surface/100) + 10*nbPièces;
	}
	

}
