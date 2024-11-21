package bean;

import java.util.Objects;

import cartes.Heros;
import creationDeck.*;

public class ContextGame {
	
	Heros player1;
	Heros player2;
	DeckBoardCommon common;
	deckBoardMonster monstre;
	deckBoardTresor tresor;
	De de;
	
	

	public ContextGame() {
		// TODO Auto-generated constructor stub
	}

	public ContextGame(Heros player1,Heros player2,DeckBoardCommon common ,deckBoardMonster monstre , deckBoardTresor tresor,De de) {
		this.player1=player1;
		this.player2=player2;
		this.common=common;
		this.monstre=monstre;
		this.tresor=tresor;
		this.de=de;
	}

	public Heros getPlayer1() {
		return player1;
	}

	public void setPlayer1(Heros player1) {
		this.player1 = player1;
	}

	public Heros getPlayer2() {
		return player2;
	}

	public void setPlayer2(Heros player2) {
		this.player2 = player2;
	}

	public DeckBoardCommon getCommon() {
		return common;
	}

	public void setCommon(DeckBoardCommon common) {
		this.common = common;
	}

	public deckBoardMonster getMonstre() {
		return monstre;
	}

	public void setMonstre(deckBoardMonster monstre) {
		this.monstre = monstre;
	}

	public deckBoardTresor getTresor() {
		return tresor;
	}

	public void setTresor(deckBoardTresor tresor) {
		this.tresor = tresor;
	}

	public De getDe() {
		return de;
	}

	public void setDe(De de) {
		this.de = de;
	}

	@Override
	public int hashCode() {
		return Objects.hash(common, de, monstre, player1, player2, tresor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContextGame other = (ContextGame) obj;
		return Objects.equals(common, other.common) && Objects.equals(de, other.de)
				&& Objects.equals(monstre, other.monstre) && Objects.equals(player1, other.player1)
				&& Objects.equals(player2, other.player2) && Objects.equals(tresor, other.tresor);
	}

	@Override
	public String toString() {
		return "ContextGame [player1=" + player1 + ", player2=" + player2 + ", common=" + common + ", monstre="
				+ monstre + ", tresor=" + tresor + ", de=" + de + "]";
	}
	
}
