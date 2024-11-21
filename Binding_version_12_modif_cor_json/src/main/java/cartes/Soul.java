package cartes;

import java.util.Objects;

public class Soul extends Carte{

	Integer Abilitie;
	Integer soul=1;
	
	public Soul() {
		// TODO Auto-generated constructor stub
		
			
		
	}

	public Soul(String name,String img,String text) {
		super(name, img, text);
	}

	public Integer getAbilitie() {
		return Abilitie;
	}

	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
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
		result = prime * result + Objects.hash(Abilitie, soul);
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
		Soul other = (Soul) obj;
		return Objects.equals(Abilitie, other.Abilitie) && Objects.equals(soul, other.soul);
	}

	@Override
	public String toString() {
		return "Soul [Abilitie=" + Abilitie + ", soul=" + soul + "]";
	}


	
	
}
