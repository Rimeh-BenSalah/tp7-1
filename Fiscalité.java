package tp8; 

public class Fiscalité { 
	public static void main(String[] args) { 
		Personne p1 = new Personne(100, "salah", "Ali");
		Personne p2 = new Personne(200, "bob", "sarah"); 
		Personne p3 = new Personne(300, "ali", "sami"); 
		
		Lotissement lt = new Lotissement(10); 
		
		PropriétéPrivée propPrivee = new PropriétéPrivée(1, p1, "Corniche", 350, 4);
		lt.ajouter(propPrivee);
		Villa villa = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
		lt.ajouter(villa);
		Appartement appartementHammamet = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
		lt.ajouter(appartementHammamet); 
		PropriétéProfessionnelle propProEtatique = new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true);
		lt.ajouter(propProEtatique); 
		PropriétéProfessionnelle propProPrive = new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);
		lt.ajouter(propProPrive);
		
		System.out.println("Liste des propriétés"); 
		lt.afficherPropriétés();
		
		System.out.println("\nNombre global de pièces: " + lt.getnbPièces()); 
		
		PropriétéPrivée resultat = null;
		double min = 999999999;
		for (int i = 0; i < lt.nombre; i++) { 
			Propriété p = lt.getpropriétéByIndex(i); 
			if (p instanceof PropriétéPrivée) { 
				double imp = p.calculImpot(); 
				if (imp < min) { 
					min = imp; 
					resultat = (PropriétéPrivée) p; 
				} 
			} 
		} 
		
		System.out.println("\n--- Propriété Privée payant le moins d'impôts ---");
		if (resultat != null) {
		    System.out.println("Montant des impôts: " + min + " DT");
            System.out.println("Détails de la propriété: " + resultat.toString());
		} else {
		    System.out.println("Aucune propriété privée trouvée.");
		}
        System.out.println("-------------------------------------------------");
		
		System.out.println("\nSuppression de l'appartement"); 
		lt.supprimer(appartementHammamet); 
		System.out.println("Après suppression");
		lt.afficherPropriétés();
		
		System.out.println("\n--- Test LotissementPrivée ---");
		Lotissement ltPrive = new LotissementPrivée(10); 
		
		boolean a = ltPrive.ajouter(new Villa(10, p1, "TestVille", 200, 5, false));
		boolean a1 = ltPrive.ajouter(new PropriétéProfessionnelle(11, p2, "Usine", 500, 10, false));
		
		System.out.println("Ajout villa dans LotissementPrivee: " + a);
		System.out.println("Ajout propriete pro dans LotissementPrivee: " + a1);
		
		System.out.println("Contenu LotissementPrivee:");
		ltPrive.afficherPropriétés(); 
	} 
}