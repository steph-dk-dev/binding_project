package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cartes.Heros;
import creationDeck.DeckBoardCommon;
import creationDeck.deckBoardMonster;
import creationDeck.deckBoardTresor;
import creaCard.*;

public class ObjContextGame {
	
	private Heros player1;
	private Heros player2;
	private DeckBoardCommon common;
	private deckBoardMonster monstre;
	private deckBoardTresor tresor;
	private De de;
	
	
	
	public ObjContextGame() {

	}

	public ObjContextGame(Heros player1,Heros player2,DeckBoardCommon common,
			deckBoardMonster monstre,deckBoardTresor tresor,De de) {
		// TODO Auto-generated constructor stub*
		this.player1=player1;
		this.player2=player2;
		this.common=common;
		this.monstre=monstre;
		this.tresor=tresor;
		this.de=de;
	}
	public void test () {
		player1.getMyHand().add(creaCard.Creacommon.cents2());
		player1.getMyHand().add(creaCard.Creacommon.chariot());
		player1.getMyHand().add(creaCard.Creacommon.cents4());
		player1.getMyHand().add(creaCard.Creacommon.death());
		player1.getMyHand().add(creaCard.Creacommon.judgement());
		player1.getMyHand().add(creaCard.Creacommon.dice_shard());
		player1.getMyHand().add(creaCard.Creacommon.tower());
		player1.getMyHand().add(creaCard.Creacommon.magician());
		player1.getMyHand().add(creaCard.Creacommon.hermit());
		player1.getMyHand().add(creaCard.Creacommon.fool());
		player2.getMyHand().add(creaCard.Creacommon.hierophant());
		player2.getMyHand().add(creaCard.Creacommon.penny());
		player2.getMyHand().add(creaCard.Creacommon.temperance());
		player2.getMyHand().add(creaCard.Creacommon.sun());
		player2.getMyHand().add(creaCard.Creacommon.soul_heart());
		player2.getMyHand().add(creaCard.Creacommon.judgement());
		player2.getMyHand().add(creaCard.Creacommon.star());
		player2.getMyHand().add(creaCard.Creacommon.gold_bomb());
		player2.getMyHand().add(creaCard.Creacommon.ehwaz());
		player2.getMyHand().add(creaCard.Creacommon.dime());
		player1.setOr(9);
		player2.setOr(7);
		de.setBattle(true);
		de.setValeur(4);
		player1.getMytresor().add(creaCard.Creatresor.trinity_shield());
		player1.getMytresor().add(creaCard.Creatresor.battery());
		player1.getMytresor().add(creaCard.Creatresor.belly_button());
		player1.getMytresor().add(creaCard.Creatresor.sack_head());
		player1.getMytresor().add(creaCard.Creatresor.smelter());
		player1.getMytresor().add(creaCard.Creatresor.shovel());
		player1.getMytresor().add(creaCard.Creatresor.Potato_Peeler());
		player1.getMytresor().add(creaCard.Creatresor.two_of_club());
		player1.getMytresor().add(creaCard.Creatresor.poop());
		player2.getMytresor().add(creaCard.Creatresor.pay_to_play());
		player2.getMytresor().add(creaCard.Creatresor.Pandoras_Box());
		player2.getMytresor().add(creaCard.Creatresor.no());
		player2.getMytresor().add(creaCard.Creatresor.Mr_Boom());
		player2.getMytresor().add(creaCard.Creatresor.polaroid());
		player2.getMytresor().add(creaCard.Creatresor.lucky_foot());
		player2.getMytresor().add(creaCard.Creatresor.godhead());
		player2.getMytresor().add(creaCard.Creatresor.bob_brain());
		player2.getMytresor().add(creaCard.Creatresor.belly_button());
		player1.setSoul(1);
		player1.setSoul(2);	
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
		ObjContextGame other = (ObjContextGame) obj;
		return Objects.equals(common, other.common) && Objects.equals(de, other.de)
				&& Objects.equals(monstre, other.monstre) && Objects.equals(player1, other.player1)
				&& Objects.equals(player2, other.player2) && Objects.equals(tresor, other.tresor);
	}

	@Override
	public String toString() {
		return "ObjContextGame [player1=" + player1 + ", player2=" + player2 + ", common=" + common + ", monstre="
				+ monstre + ", tresor=" + tresor + ", de=" + de + "]";
	}
	public List<Object> getList () {
		List<Object> Liste = new ArrayList<Object>();
		if(this.tresor.getTresorDefausse().size()>0)
			Liste.add(this.tresor.getTresorDefausse().get(this.tresor.getTresorDefausse().size()-1));
		else {
			Liste.add(null);}
		Liste.add(this.tresor.getTresorVisible().get(0));
		Liste.add(this.tresor.getTresorVisible().get(1));
		if(this.common.getCommonDefausse().size()>0)
			Liste.add(this.common.getCommonDefausse().get(this.common.getCommonDefausse().size()-1));
		else {
			Liste.add(null);	
		}
		if(this.monstre.getMonsterDefausse().size()>0)
			Liste.add(this.monstre.getMonsterDefausse().get(this.monstre.getMonsterDefausse().size()-1));
		else {
			Liste.add(null);}
		Liste.add(this.monstre.getMonsterVisible().get(0));
		Liste.add(this.monstre.getMonsterVisible().get(1));
		Liste.add(player1);
		
		for(int i=1;i<=10;i++) {
			if(player1.getMyHand().size()>=i) {
				Liste.add(player1.getMyHand().get(i-1));	
			} else {
				Liste.add(null);
			}	
		}
		Liste.add(player1.getEternal());
		for(int i=1;i<=9;i++) {
			if(player1.getMytresor().size()>=i) {
				Liste.add(player1.getMytresor().get(i-1));	
			} else {
				Liste.add(null);
			}	
			
			
		}
		for(int i=1;i<=9;i++) {
			if(player1.getMytresor().size()>=i) {
				Liste.add(player1.getMytresor().get(i-1));	
			} else {
				Liste.add(null);
			}		
			}
		for(int i=1;i<=4;i++) {
			if(player1.getMyCurse().size()>=i) {
				Liste.add(player1.getMyCurse().get(i-1));	
			} else {
				Liste.add(null);
			}		
			}
	Liste.add(player2);
		
		for(int i=1;i<=10;i++) {
			if(player2.getMyHand().size()>=i) {
				Liste.add(player2.getMyHand().get(i-1));	
			} else {
				Liste.add(null);
			}	
		}
		Liste.add(player2.getEternal());
		for(int i=1;i<=9;i++) {
			if(player2.getMytresor().size()>=i) {
				Liste.add(player2.getMytresor().get(i-1));	
			} else {
				Liste.add(null);
			}	
			
			
		}
		for(int i=1;i<=9;i++) {
			if(player2.getMytresor().size()>=i) {
				Liste.add(player2.getMytresor().get(i-1));	
			} else {
				Liste.add(null);
			}		
			}
		for(int i=1;i<=4;i++) {
			if(player2.getMyCurse().size()>=i) {
				Liste.add(player2.getMyCurse().get(i-1));	
			} else {
				Liste.add(null);
			}		
			}
		return Liste;
	}	
			

}