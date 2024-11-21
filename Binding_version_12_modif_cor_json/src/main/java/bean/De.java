package bean;

import java.util.Objects;

public class De {
	Boolean battle;
	Integer valeur;

	public De() {
		// TODO Auto-generated constructor stub
	}
	public De(Boolean battle,Integer valeur) {
		this.battle=battle;
		this.valeur=valeur;
	}
	public Boolean getBattle() {
		return battle;
	}
	public void setBattle(Boolean battle) {
		this.battle = battle;
	}
	public Integer getValeur() {
		return valeur;
	}
	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}
	@Override
	public int hashCode() {
		return Objects.hash(battle, valeur);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		De other = (De) obj;
		return Objects.equals(battle, other.battle) && Objects.equals(valeur, other.valeur);
	}
	@Override
	public String toString() {
		return "De [battle=" + battle + ", valeur=" + valeur + "]";
	}
	
}
