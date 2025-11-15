package tp8;

public class LotissementPrivée extends Lotissement {
	public LotissementPrivée(int capacité) {
        super(capacité);
    }
    public boolean ajouter(Propriété p) {
        if (!(p instanceof PropriétéPrivée)) {
        	return false;
        }
        return super.ajouter(p);
    }
    public PropriétéPrivée getpropriétéByIndex(int i) {
    	Propriété p = super.getpropriétéByIndex(i);
    	if (p instanceof PropriétéPrivée) {
    	    return (PropriétéPrivée) p;
    	}
    	return null;    
    	}
    public int getnbPièces(){
        return super.getnbPièces();
    }
}
