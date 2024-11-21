package cartes;

import java.util.Objects;

public class Curse extends Carte{

	Integer Abilitie;

	@Override
	public String toString() {
		return "Curse [name=" + name + "]";
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
		Curse other = (Curse) obj;
		return Objects.equals(Abilitie, other.Abilitie);
	}

	public Integer getAbilitie() {
		return Abilitie;
	}

	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
	}

	public Curse() {
		// TODO Auto-generated constructor stub
	}

	public Curse(String name,String img,String text) {
		super(name, img, text);
	}
	
}
