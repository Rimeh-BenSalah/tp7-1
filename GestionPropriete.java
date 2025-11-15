package tp8;

public interface GestionPropriete {
	final int MAX_PROPRIETES=100;
	void afficherPropriétés();
	boolean ajouter(Propriété p);
	boolean supprimer(Propriété p);
}
