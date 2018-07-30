package Model.BIBLIOTHEQUE;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roman monRoman = new Roman();
		monRoman.setTitre("L'œil émerveillé");
		monRoman.setAuteur("Samivel");
		monRoman.setEditeur("Nanabozzo le Lapin");
		monRoman.setAnnee(1975);
		monRoman.setType("Essai");	
		monRoman.setBooked(true);
		System.out.println(monRoman.getTitre() + "; écrit par " + monRoman.getAuteur() + "; aux éditions " + monRoman.getEditeur() + "; publié en " + monRoman.getAnnee() + "; " + monRoman.getType() + "; " + monRoman.isBooked());

		Magasine monMagasine = new Magasine();
		monMagasine.setTitre("Batteur magazine");
		monMagasine.setAuteur("La baguetterie");
		monMagasine.setEditeur("Drums Editions");
		monMagasine.setAnnee(1995);
		monMagasine.setType("magasine");
		monMagasine.setBooked(true);
		System.out.println(monMagasine.getTitre() + "; écrit par " + monMagasine.getAuteur() + "; aux éditions " + monMagasine.getEditeur() + "; publié en " + monMagasine.getAnnee() + "; " + monMagasine.isBooked()); 
		
		ChildBook monChilBook = new ChildBook();
		monChilBook.setTitre("Les trois brigands");
		monChilBook.setAuteur("Tomi Ungerer");
		monChilBook.setEditeur("L'écoel des loisirs");
		monChilBook.setAnnee(1968);
		monChilBook.setType("Livres jeunesse");	
		monChilBook.setBooked(false);
		System.out.println(monChilBook.getTitre() + "; écrit par " + monChilBook.getAuteur() + "; aux éditions " + monChilBook.getEditeur() + "; publié en " + monChilBook.getAnnee() + "; " + monChilBook.isBooked());
	}
}
