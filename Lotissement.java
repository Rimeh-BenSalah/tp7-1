package tp8;

public class Lotissement implements GestionPropriete{
	protected Propriété [] tabProp;
	protected int nombre;
	public Lotissement(int capacité){
		tabProp=new Propriété [capacité];
	}
	
	public void afficherPropriétés() {
		for (int i = 0; i < nombre; i++) {
			Propriété p = tabProp[i];
	            System.out.printf( p.toString());
	        }
	    }
    public boolean ajouter(Propriété p) {
        if (p == null) return false;
        if (nombre > tabProp.length) return false;
        tabProp[nombre] = p;
        nombre++;
        return true;
    }
    public boolean supprimer(Propriété p) {
        if (p == null) return false;
        for (int i = 0; i < nombre; i++) {
                for (int j = i; j < nombre - 1; j++) {
                	tabProp[j] = tabProp[j + 1];
                }
                tabProp[nombre] = null;
                nombre--;
                return true;
            }
        return false;
    }

	
	public Propriété getpropriétéByIndex(int i) {
		if(i<nombre) {
			return tabProp[i];}
		return null;
}
	public int getnbPièces() {
		int s=0;
		for(int i=0;i<nombre;i++) {
			if(tabProp[i] instanceof PropriétéPrivée) {
				s+=((PropriétéPrivée) tabProp[i]).getNbPieces();
			}
		}
		return s;}
}