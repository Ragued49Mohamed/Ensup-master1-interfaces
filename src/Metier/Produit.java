package Metier;

public class Produit {

	private int idProduit;
	private String NomProduit;
	private int quantite;
	private int prix ;
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return NomProduit;
	}
	public void setNomProduit(String nomProduit) {
		NomProduit = nomProduit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", NomProduit=" + NomProduit + ", quantite=" + quantite + ", prix="
				+ prix + "]";
	}
}
