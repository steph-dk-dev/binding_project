package creationDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cartes.Common;
import cartes.Monstre;

public class deckBoardMonster {
	
	Integer CarteVisible= 2;
	List<Object> MonsterVisible = new ArrayList<Object>();
	List<Object> MonsterDefausse = new ArrayList<Object>();
	List<Object> deck = new ArrayList<Object>();
	Monstre MonsterCard = new Monstre();
	String MonsterDos = MonsterCard.getDosCarte();

	public deckBoardMonster() {
		// TODO Auto-generated constructor stub
		this.deck =creationDeck.Creadeck.creaDeckMonster();
		
		if (deck.size() >= 2) {
	        MonsterVisible.add(deck.remove(0)); // Ajout de la première carte

	        System.out.println(MonsterVisible.get(0));
	        MonsterVisible.add(deck.remove(0)); // Ajout de la deuxième carte
	        System.out.println("up");
	        System.out.println(MonsterVisible.get(1));
	        System.out.println("monstrevisible");
	        System.out.println(MonsterVisible);
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

	public List<Object> getMonsterVisible() {
		return MonsterVisible;
	}

	public void setMonsterVisible(List<Object> monsterVisible) {
		MonsterVisible = monsterVisible;
	}

	public List<Object> getMonsterDefausse() {
		return MonsterDefausse;
	}

	public void setMonsterDefausse(List<Object> monsterDefausse) {
		MonsterDefausse = monsterDefausse;
	}

	public List<Object> getDeck() {
		return deck;
	}

	public void setDeck(List<Object> deck) {
		this.deck = deck;
	}

	public Monstre getMonsterCard() {
		return MonsterCard;
	}

	public void setMonsterCard(Monstre monsterCard) {
		MonsterCard = monsterCard;
	}

	public String getMonsterDos() {
		return MonsterDos;
	}

	public void setMonsterDos(String monsterDos) {
		MonsterDos = monsterDos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CarteVisible, MonsterCard, MonsterDefausse, MonsterDos, MonsterVisible, deck);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		deckBoardMonster other = (deckBoardMonster) obj;
		return Objects.equals(CarteVisible, other.CarteVisible) && Objects.equals(MonsterCard, other.MonsterCard)
				&& Objects.equals(MonsterDefausse, other.MonsterDefausse)
				&& Objects.equals(MonsterDos, other.MonsterDos) && Objects.equals(MonsterVisible, other.MonsterVisible)
				&& Objects.equals(deck, other.deck);
	}

	@Override
	public String toString() {
		return "deckBoardMonster [CarteVisible=" + CarteVisible + ", MonsterVisible=" + MonsterVisible
				+ ", MonsterDefausse=" + MonsterDefausse + ", deck=" + deck + ", MonsterCard=" + MonsterCard
				+ ", MonsterDos=" + MonsterDos + "]";
	}

}
