package creationDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cartes.Monstre;
import cartes.Tresor;

public class deckBoardTresor {
	
	Integer CarteVisible= 2;
	List<Object> tresorVisible = new ArrayList<Object>();
	List<Object> tresorDefausse = new ArrayList<Object>();
	List<Object> deck = new ArrayList<Object>();
	Tresor TresorCard = new Tresor();
	String TresorDos = TresorCard.getDosCarte();

	public deckBoardTresor() {
		// TODO Auto-generated constructor stub
		this.deck =creationDeck.Creadeck.creaDeckTresor();
		System.out.println("decktresor");
		System.out.println(deck.toString());
		if (deck.size() >= 2) {
	        tresorVisible.add(deck.remove(0)); // Ajout de la première carte
	        tresorVisible.add(deck.remove(0)); // Ajout de la deuxième carte
	    } else {
	        System.out.println("Pas assez de cartes dans le deck pour initialiser les cartes visibles.");
	    }
	}

	public Integer getCarteVisible() {
		return CarteVisible;
	}

	public void setCarteVisible(Integer carteVisible) {
		CarteVisible = carteVisible;
	}

	public List<Object> getTresorVisible() {
		return tresorVisible;
	}

	public void setTresorVisible(List<Object> tresorVisible) {
		this.tresorVisible = tresorVisible;
	}

	public List<Object> getTresorDefausse() {
		return tresorDefausse;
	}

	public void setTresorDefausse(List<Object> tresorDefausse) {
		this.tresorDefausse = tresorDefausse;
	}

	public List<Object> getDeck() {
		return deck;
	}

	public void setDeck(List<Object> deck) {
		this.deck = deck;
	}

	public Tresor getTresorCard() {
		return TresorCard;
	}

	public void setTresorCard(Tresor tresorCard) {
		TresorCard = tresorCard;
	}

	public String getTresorDos() {
		return TresorDos;
	}

	public void setTresorDos(String tresorDos) {
		TresorDos = tresorDos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CarteVisible, TresorCard, TresorDos, deck, tresorDefausse, tresorVisible);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		deckBoardTresor other = (deckBoardTresor) obj;
		return Objects.equals(CarteVisible, other.CarteVisible) && Objects.equals(TresorCard, other.TresorCard)
				&& Objects.equals(TresorDos, other.TresorDos) && Objects.equals(deck, other.deck)
				&& Objects.equals(tresorDefausse, other.tresorDefausse)
				&& Objects.equals(tresorVisible, other.tresorVisible);
	}

	@Override
	public String toString() {
		return "deckBoardTresor [CarteVisible=" + CarteVisible + ", tresorVisible=" + tresorVisible
				+ ", tresorDefausse=" + tresorDefausse + ", deck=" + deck + ", TresorCard=" + TresorCard
				+ ", TresorDos=" + TresorDos + "]";
	}

}
