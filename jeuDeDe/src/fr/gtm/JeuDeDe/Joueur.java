package fr.gtm.JeuDeDe;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class Joueur {

	String nom;
	int[] score;

	public Joueur(String string) {
		// TODO Auto-generated constructor stub
		nom = string;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + "]";
	}

	// int d1, d2;
	public int[] jouer(De d1, De d2) {
		d1.deRoule();
		System.out.println("Le resultat du premier lancé de " + nom + " est " + d1.resultat);
		d2.deRoule();
		System.out.println("Le resultat du deuxième lancé de " + nom + " est " + d2.resultat);
		return score;
	}

}
