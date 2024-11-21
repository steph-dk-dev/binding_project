package creationDeck;
import creationDeck.Creadeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bean.*;

import cartes.Common;

public class DeckBoardCommon {
	Integer CarteVisible= 2;
	List<Object> commonVisible = new ArrayList<Object>();
	List<Object> commonDefausse = new ArrayList<Object>();
	List<Object> deck = new ArrayList<Object>();
	Common commonCard = new Common();
	String commonDos = commonCard.getDosCarte();
	
	public DeckBoardCommon() {
			this.deck =creationDeck.Creadeck.creaDeckCommon();

	}

	public Integer getCarteVisible() {
		return CarteVisible;
	}

	public void setCarteVisible(Integer carteVisible) {
		CarteVisible = carteVisible;
	}

	public List<Object> getCommonVisible() {
		return commonVisible;
	}

	public void setCommonVisible(List<Object> commonVisible) {
		this.commonVisible = commonVisible;
	}

	public List<Object> getCommonDefausse() {
		return commonDefausse;
	}

	public void setCommonDefausse(List<Object> commonDefausse) {
		this.commonDefausse = commonDefausse;
	}

	public List<Object> getDeck() {
		return deck;
	}

	public void setDeck(List<Object> deck) {
		this.deck = deck;
	}

	public Common getCommonCard() {
		return commonCard;
	}

	public void setCommonCard(Common commonCard) {
		this.commonCard = commonCard;
	}

	public String getCommonDos() {
		return commonDos;
	}

	public void setCommonDos(String commonDos) {
		this.commonDos = commonDos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CarteVisible, commonCard, commonDefausse, commonDos, commonVisible, deck);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeckBoardCommon other = (DeckBoardCommon) obj;
		return Objects.equals(CarteVisible, other.CarteVisible) && Objects.equals(commonCard, other.commonCard)
				&& Objects.equals(commonDefausse, other.commonDefausse) && Objects.equals(commonDos, other.commonDos)
				&& Objects.equals(commonVisible, other.commonVisible) && Objects.equals(deck, other.deck);
	}

	@Override
	public String toString() {
		return "DeckBoardCommon [CarteVisible=" + CarteVisible + ", commonVisible=" + commonVisible
				+ ", commonDefausse=" + commonDefausse + ", deck=" + deck + ", commonCard=" + commonCard
				+ ", commonDos=" + commonDos + "]";
	}

	
	
	
	
	
	
	
	
	
}
