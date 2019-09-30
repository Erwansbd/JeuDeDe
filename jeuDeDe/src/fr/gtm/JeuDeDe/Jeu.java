package fr.gtm.JeuDeDe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Jeu {
	De d1 = new De();
	De d2 = new De();
	// Joueur[] joueurs;
	ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

	public void addJoueur(Joueur j) {
		joueurs.add(j);
	}

	public Joueur vainqueur() {

		while (true) {
			Joueur vainqueur = null;

//			for (int i = 0; i < joueurs.size(); i++) {
//
//				joueurs.get(i).jouer(d1, d2);
//				if (d1.resultat == d2.resultat) {
//					vainqueur = joueurs.get(i);
//					System.out.println(vainqueur.nom + " gagne la partie");
//					return vainqueur;

					for (Joueur j : joueurs) {

						j.jouer(d1, d2);
						if (d1.resultat == d2.resultat) {
							vainqueur = j;
							System.out.println(vainqueur.nom + " gagne la partie");
							return vainqueur;

						}
					}
//					Iterator<Joueur> j = joueurs.iterator();
//					while (j.hasNext()) {
//						Joueur a = j.next();
//						a.jouer(d1, d2);
//						if (d1.resultat == d2.resultat) {
//							vainqueur = a;
//							return vainqueur;
//						}
//					}
//				}
//			}
		}
	}
}
