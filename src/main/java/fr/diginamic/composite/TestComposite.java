package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		Employe directeur = new Employe("RASPEY", "Cécile", 10000);
        Employe architecte = new Employe("BECHKAR", "Bilel", 8000);
        Employe chefBigData = new Employe("JB", "RANMEY", 7500);
        Employe concepteur = new Employe("Jane", "DOE", 3500);
        Employe chefDeService = new Employe("Kevin", "GUINEAU", 7500);
        Employe leadDev = new Employe("Paul", "MARTIN", 3500);

        // Créer les services
        Service dsin = new Service("DSIN");
        Service bigData = new Service("BigData");
        Service javaDev = new Service("Java Dev");

        // Ajouter les employés aux services
        dsin.ajouterElement(directeur);
        dsin.ajouterElement(architecte);
        bigData.ajouterElement(chefBigData);
        bigData.ajouterElement(concepteur);
        javaDev.ajouterElement(chefDeService);
        javaDev.ajouterElement(leadDev);

        // Ajouter les sous-services au service DSIN
        dsin.ajouterElement(bigData);
        dsin.ajouterElement(javaDev);

        // Calculer et afficher le salaire total
        System.out.println("Salaire total DSIN: " + dsin.calculerSalaire() + " euros");
        System.out.println("Salaire total BigData: " + bigData.calculerSalaire() + " euros");
        System.out.println("Salaire total Java Dev: " + javaDev.calculerSalaire() + " euros");
    }
}
