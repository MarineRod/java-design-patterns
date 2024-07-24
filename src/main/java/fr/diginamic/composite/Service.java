package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
	private String nom;
	private List<IElement> elements;


    public Service(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

	public void ajouterElement(IElement element) {
		elements.add(element);
	}

	public double calculerSalaire() {
		double totalSalaire = 0.0;

		// Calculer la somme des salaires des employés et des sous-services
		for (IElement element : elements) {
			totalSalaire += element.calculerSalaire();
		}

		return totalSalaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IElement> getElements() {
		return elements;
	}

	public void setElements(List<IElement> elements) {
		this.elements = elements;
	}

	
}
