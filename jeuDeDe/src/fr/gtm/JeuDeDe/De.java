package fr.gtm.JeuDeDe;

import java.util.Random;

public class De {
	final int faces=6;
	static final Random random = new Random(); /* <-- this is a constructor */
	
	public int resultat =0;
	public  int deRoule() {
		
		resultat=random.nextInt(faces) + 1;
//		System.out.println (resultat); /* <-- look at the API doc for nextInt() to see why we give it 6 as and argument, and why we need to add 1 to the result */
        return resultat;
		
		
	}
	public int getResultat() {
		return resultat;

	}

}
