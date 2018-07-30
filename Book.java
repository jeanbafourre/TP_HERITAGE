package Model.BIBLIOTHEQUE;

import java.util.*;

public class Book {

    public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public Book() {
    }

    public String titre;

    public String auteur;

    public String editeur;

    public int annee;

    public String type;

    public boolean booked;

    public boolean isBooked() {
    	if(booked == true) {
    		System.out.println("Ce livre est emprunté");
    	}
    	else {
    		System.out.println("Ce livre n'est pas emprunté");
    	}
  
        return false;
    }

}