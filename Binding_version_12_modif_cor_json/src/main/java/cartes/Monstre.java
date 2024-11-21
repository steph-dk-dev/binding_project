package cartes;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.Objects;
import java.util.Optional;

public class Monstre extends Carte {

	Integer health;
	Integer evasion;
	Integer Attaque;
	Integer Abilitie;
	String categorie;
	Integer recompenseGold;
	Integer RecompenseLoot;
	Integer recompensetresor;
	Integer soul;
	boolean live=true;
	String dosCarte = "image/visuel_monstre/MonsterCardBack.png";


	public Monstre() {
		// TODO Auto-generated constructor stub
	}

	public Monstre(String name,String img,String text,Integer health,Integer evasion,Integer Attaque,Integer recompenseGold,Integer recompenseLoot,Integer recompense,Integer soul) {
		super(name, img, text);
		this.health =health;
		this.evasion = evasion;
		this.Attaque = Attaque;
		this.recompenseGold=recompenseGold;
		this.RecompenseLoot=recompenseLoot;
		this.soul = soul;
	}


	

	public Integer getSoul() {
		return soul;
	}

	public void setSoul(Integer soul) {
		this.soul = soul;
	}

	public Integer getHealth() {
		return health;
	}


	public void setHealth(Integer health) {
		this.health = health;
	}


	public Integer getEvasion() {
		return evasion;
	}


	public void setEvasion(Integer evasion) {
		this.evasion = evasion;
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



	public Integer getRecompenseGold() {
		return recompenseGold;
	}

	public void setRecompenseGold(Integer recompenseGold) {
		this.recompenseGold = recompenseGold;
	}

	public Integer getRecompenseLoot() {
		return RecompenseLoot;
	}

	public void setRecompenseLoot(Integer recompenseLoot) {
		RecompenseLoot = recompenseLoot;
	}
	
	public Integer getRecompensetresor() {
		return recompensetresor;
	}

	public void setRecompensetresor(Integer recompensetresor) {
		this.recompensetresor = recompensetresor;
	}

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public String getDosCarte() {
		return dosCarte;
	}

	public void setDosCarte(String dosCarte) {
		this.dosCarte = dosCarte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(Abilitie, Attaque, RecompenseLoot, categorie, evasion, health, recompenseGold, soul);
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
		Monstre other = (Monstre) obj;
		return Objects.equals(Abilitie, other.Abilitie) && Objects.equals(Attaque, other.Attaque)
				&& Objects.equals(RecompenseLoot, other.RecompenseLoot) && Objects.equals(categorie, other.categorie)
				&& Objects.equals(evasion, other.evasion) && Objects.equals(health, other.health)
				&& Objects.equals(recompenseGold, other.recompenseGold) && Objects.equals(soul, other.soul);
	}

	@Override
	public String toString() {
		return "Monstre [name= "+name+" ]";
	}

}
