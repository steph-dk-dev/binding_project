 package cartes;

import java.util.Objects;

public class Trincket extends Carte{

	Integer Abilitie;
	Integer soul =0;



	public Trincket() {
		// TODO Auto-generated constructor stub
	}
	public Trincket(String name,String img,String text) {
		super(name, img, text);
		
	}

	public Integer getSoul() {
		return soul;
	}
	public void setSoul(Integer soul) {
		this.soul = soul;
	}
	public Integer getAbilitie() {
		return Abilitie;
	}

	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Abilitie);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj) || (getClass() != obj.getClass())) {
			return false;
		}
		Common other = (Common) obj;
		return Objects.equals(Abilitie, other.Abilitie);
	}

	@Override
	public String toString() {
		return "common [name=" + name + "]";
	}




}
