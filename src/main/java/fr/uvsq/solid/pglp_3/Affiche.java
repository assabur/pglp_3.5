package fr.uvsq.solid.pglp_3;

import java.time.LocalDateTime;
 
public class Affiche implements Affichage {
	
	public void affiche(String chaine ) {
		System.out.println(LocalDateTime.now()+" "+chaine);	
	}
}
