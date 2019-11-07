package Service;

import java.util.List;

import Metier.Produit;

public interface Iservice {

	public void AjouterProduit(Produit p);
	public void ModifierProduit(Produit p);
	public void SupprimerProduit(int idProduit);
	public List<Produit> ListerTousLesProduits();
	
	public Produit ListerUnProduit(int idProduit);
	
	
}
