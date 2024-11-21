package cartes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.De;

public class Heros extends Carte{

	Integer health = 2;
	Integer healthMax =2;
	Integer Attaque = 1;
	Integer Abilitie;
	String categorie;
	Integer or = 3;
	Tresor eternal;
	boolean live = true;
	boolean useLoot = true;
	int def = 0;
	Integer lootPerTurn = 2;
	List<Object> debut;
	List<Object> fin;
	List<Object> degat;
	List<Object> ifGainGold;
	List<Object> ifGainloot;
	List<Object> ephemere;
	List<Object> dice1;
	List<Object> dice2;
	List<Object> dice3;
	List<Object> dice4;
	List<Object> dice5;
	List<Object> dice6;
	Integer degatplus = 0;
	Integer bonusFirstDice=0;
	Integer bonusDice =0;
	Integer bonusFirstAtk=0;
	Integer bonusAtk =0;
	List<Tresor> mytresor = new ArrayList<Tresor>();
	List<Common> myHand = new ArrayList<Common>(10);
	List<Curse> myCurse = new ArrayList<Curse>();
	List<Object> myHoly = new ArrayList<Object>();
	De dernierde ;
	Consumer<Heros> effect;
	Integer soul =0; 

	public Heros() {
		// TODO Auto-generated constructor stub
	}
	public Heros (String name, String img , String text,Tresor eternal,Consumer<Heros> effect) {
		super(name, img, text);
		this.effect=effect;
		this.eternal=eternal;
		
	}


	public Integer getHealth() {
		return health;
	}


	public void setHealth(Integer health) {
		this.health = health;
	}


	public Integer getAttaque() {
		return Attaque;
	}


	public void setAttaque(Integer attaque) {
		Attaque = attaque;
	}


	public Integer getAbilitie() {
		return Abilitie;
	}


	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public Integer getOr() {
		return or;
	}
	public void setOr(Integer or) {
		this.or = or;
	}
	public Tresor getEternal() {
		return eternal;
	}
	public void setEternal(Tresor eternal) {
		this.eternal = eternal;
	}
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	
	
	public Integer getHealthMax() {
		return healthMax;
	}
	public void setHealthMax(Integer healthMax) {
		this.healthMax = healthMax;
	}
	public boolean isUseLoot() {
		return useLoot;
	}
	public void setUseLoot(boolean useLoot) {
		this.useLoot = useLoot;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public Integer getLootPerTurn() {
		return lootPerTurn;
	}
	public void setLootPerTurn(Integer lootPerTurn) {
		this.lootPerTurn = lootPerTurn;
	}
	public List<Object> getDebut() {
		return debut;
	}
	public void setDebut(List<Object> debut) {
		this.debut = debut;
	}
	public List<Object> getFin() {
		return fin;
	}
	public void setFin(List<Object> fin) {
		this.fin = fin;
	}
	public List<Object> getDegat() {
		return degat;
	}
	public void setDegat(List<Object> degat) {
		this.degat = degat;
	}
	public List<Object> getIfGainGold() {
		return ifGainGold;
	}
	public void setIfGainGold(List<Object> ifGainGold) {
		this.ifGainGold = ifGainGold;
	}
	public List<Object> getIfGainloot() {
		return ifGainloot;
	}
	public void setIfGainloot(List<Object> ifGainloot) {
		this.ifGainloot = ifGainloot;
	}
	public List<Object> getDice1() {
		return dice1;
	}
	public void setDice1(List<Object> dice1) {
		this.dice1 = dice1;
	}
	public List<Object> getDice2() {
		return dice2;
	}
	public void setDice2(List<Object> dice2) {
		this.dice2 = dice2;
	}
	public List<Object> getDice3() {
		return dice3;
	}
	public void setDice3(List<Object> dice3) {
		this.dice3 = dice3;
	}
	public List<Object> getDice4() {
		return dice4;
	}
	public void setDice4(List<Object> dice4) {
		this.dice4 = dice4;
	}
	public List<Object> getDice5() {
		return dice5;
	}
	public void setDice5(List<Object> dice5) {
		this.dice5 = dice5;
	}
	public List<Object> getDice6() {
		return dice6;
	}
	public void setDice6(List<Object> dice6) {
		this.dice6 = dice6;
	}
	public Integer getDegatplus() {
		return degatplus;
	}
	public void setDegatplus(Integer degatplus) {
		this.degatplus = degatplus;
	}
	public Integer getBonusFirstDice() {
		return bonusFirstDice;
	}
	public void setBonusFirstDice(Integer bonusFirstDice) {
		this.bonusFirstDice = bonusFirstDice;
	}
	public Integer getBonusDice() {
		return bonusDice;
	}
	public void setBonusDice(Integer bonusDice) {
		this.bonusDice = bonusDice;
	}
	public Integer getBonusFirstAtk() {
		return bonusFirstAtk;
	}
	public void setBonusFirstAtk(Integer bonusFirstAtk) {
		this.bonusFirstAtk = bonusFirstAtk;
	}
	public Integer getBonusAtk() {
		return bonusAtk;
	}
	public void setBonusAtk(Integer bonusAtk) {
		this.bonusAtk = bonusAtk;
	}
	public List<Tresor> getMytresor() {
		return mytresor;
	}
	public void setMytresor(List<Tresor> mytresor) {
		this.mytresor = mytresor;
	}
	public List<Common> getMyHand() {
		return myHand;
	}
	public void setMyHand(List<Common> myHand) {
		this.myHand = myHand;
	}
	public List<Curse> getMyCurse() {
		return myCurse;
	}
	public void setMyCurse(List<Curse> myCurse) {
		this.myCurse = myCurse;
	}
	public List<Object> getMyHoly() {
		return myHoly;
	}
	public void setMyHoly(List<Object> myHoly) {
		this.myHoly = myHoly;
	}
	public De getDernierde() {
		return dernierde;
	}
	public void setDernierde(De dernierde) {
		this.dernierde = dernierde;
	}
	public Consumer<Heros> getEffect() {
		return effect;
	}
	public void setEffect(Consumer<Heros> effect) {
		this.effect = effect;
	}
	


	
	
	public Integer getSoul() {
		return soul;
	}
	public void setSoul(Integer soul) {
		this.soul = soul;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Abilitie, Attaque, bonusAtk, bonusDice, bonusFirstAtk, bonusFirstDice,
				categorie, debut, def, degat, degatplus, dernierde, dice1, dice2, dice3, dice4, dice5, dice6, effect,
				ephemere, eternal, fin, health, healthMax, ifGainGold, ifGainloot, live, lootPerTurn, myCurse, myHand,
				myHoly, mytresor, or, soul, useLoot);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Heros other = (Heros) obj;
		return Objects.equals(Abilitie, other.Abilitie) && Objects.equals(Attaque, other.Attaque)
				&& Objects.equals(bonusAtk, other.bonusAtk) && Objects.equals(bonusDice, other.bonusDice)
				&& Objects.equals(bonusFirstAtk, other.bonusFirstAtk)
				&& Objects.equals(bonusFirstDice, other.bonusFirstDice) && Objects.equals(categorie, other.categorie)
				&& Objects.equals(debut, other.debut) && def == other.def && Objects.equals(degat, other.degat)
				&& Objects.equals(degatplus, other.degatplus) && Objects.equals(dernierde, other.dernierde)
				&& Objects.equals(dice1, other.dice1) && Objects.equals(dice2, other.dice2)
				&& Objects.equals(dice3, other.dice3) && Objects.equals(dice4, other.dice4)
				&& Objects.equals(dice5, other.dice5) && Objects.equals(dice6, other.dice6)
				&& Objects.equals(effect, other.effect) && Objects.equals(ephemere, other.ephemere)
				&& Objects.equals(eternal, other.eternal) && Objects.equals(fin, other.fin)
				&& Objects.equals(health, other.health) && Objects.equals(healthMax, other.healthMax)
				&& Objects.equals(ifGainGold, other.ifGainGold) && Objects.equals(ifGainloot, other.ifGainloot)
				&& live == other.live && Objects.equals(lootPerTurn, other.lootPerTurn)
				&& Objects.equals(myCurse, other.myCurse) && Objects.equals(myHand, other.myHand)
				&& Objects.equals(myHoly, other.myHoly) && Objects.equals(mytresor, other.mytresor)
				&& Objects.equals(or, other.or) && Objects.equals(soul, other.soul) && useLoot == other.useLoot;
	}
	
	
	@Override
	public String toString() {
		return "Heros [health=" + health + ", healthMax=" + healthMax + ", Attaque=" + Attaque + ", Abilitie="
				+ Abilitie + ", categorie=" + categorie + ", or=" + or + ", eternal=" + eternal + ", live=" + live
				+ ", useLoot=" + useLoot + ", def=" + def + ", lootPerTurn=" + lootPerTurn + ", debut=" + debut
				+ ", fin=" + fin + ", degat=" + degat + ", ifGainGold=" + ifGainGold + ", ifGainloot=" + ifGainloot
				+ ", ephemere=" + ephemere + ", dice1=" + dice1 + ", dice2=" + dice2 + ", dice3=" + dice3 + ", dice4="
				+ dice4 + ", dice5=" + dice5 + ", dice6=" + dice6 + ", degatplus=" + degatplus + ", bonusFirstDice="
				+ bonusFirstDice + ", bonusDice=" + bonusDice + ", bonusFirstAtk=" + bonusFirstAtk + ", bonusAtk="
				+ bonusAtk + ", mytresor=" + mytresor + ", myHand=" + myHand + ", myCurse=" + myCurse + ", myHoly="
				+ myHoly + ", dernierde=" + dernierde + ", effect=" + effect + ", soul=" + soul + "]";
	}
	public  void addOr(int ammont) {
		this.or +=ammont;
		
	}
	public  void giveOr(int ammont) {
		this.or -=ammont;
		
	}

	public void lootplus () {
		this.useLoot = true;
		this.etats = false;
	}
	public void reroll() {
		this.dernierde.setValeur(bean.function.lancerDe());
		
	}

	public void defPlus (int i) {
		this.def+=i;
	}
	public void defretour (int i) {
		if(this.def>0)
			this.def-=i;
	}
	public void defmoins (int i) {
		this.def+=i;
	}
	public List<Object> getEphemere() {
		return ephemere;
	}
	public void setEphemere(List<Object> ephemere) {
		this.ephemere = ephemere;
	}
	
}
