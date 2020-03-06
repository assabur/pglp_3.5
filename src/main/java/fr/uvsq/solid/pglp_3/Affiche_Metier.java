package fr.uvsq.solid.pglp_3;

public class Affiche_Metier 
{
	private final String chaine1="debut d'une methode metier";
	private final String chaine2="fin d'une methode metier";

	private Affiche affichage ;
	
	public void une_methode_metier()
	{
		affichage.affiche(chaine1);
		affichage.affiche("chaine2");
   	}
}
