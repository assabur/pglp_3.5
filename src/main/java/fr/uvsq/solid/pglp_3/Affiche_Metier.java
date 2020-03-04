package fr.uvsq.solid.pglp_3;

import java.time.LocalDateTime;

public class Affiche_Metier {
	private Affiche mon_affichage;
	public Affiche_Metier(Affiche affichage)
	{
		this.mon_affichage=affichage;
	}
	public void une_methode_metier()
	{
		mon_affichage.affiche(LocalDateTime.now()+"Debut d'une methode metier");
		mon_affichage.affiche(LocalDateTime.now()+"fin d'une methode metier");
	}
	
}
