package tp8;

abstract public class Propriété {
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface;
	public Propriété(int id, Personne responsable, String adresse, double surface) {
		this.id = id;
		this.responsable = responsable;
		this.adresse = adresse;
		this.surface = surface;
	}
	public String toString() {
        return "Id: " + id + ", Responsable: (" + responsable.toString() + 
                "), Adresse: " + adresse + ", Surface: " + surface + " m²";
    }
	abstract double calculImpot();

}
