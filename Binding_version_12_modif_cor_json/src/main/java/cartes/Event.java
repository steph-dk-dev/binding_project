package cartes;

import java.util.Objects;

public class Event extends Carte{

	Integer abilitie;
	
	
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(String name,String img,String text) {
		super(name, img, text);
	}
	public Integer getAbilitie() {
		return abilitie;
	}
	public void setAbilitie(Integer abilitie) {
		this.abilitie = abilitie;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(abilitie);
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
		Event other = (Event) obj;
		return Objects.equals(abilitie, other.abilitie);
	}
	@Override
	public String toString() {
		return "Event [name=" + name + "]";
	}
	
	
	
	
	
	
	
	
}
