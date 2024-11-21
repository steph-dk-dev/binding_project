package cartes;

import java.util.Objects;
import java.util.function.Consumer;

public class Tresor extends Carte {

	Integer Abilitie;
	Boolean eternal;
	int counter = 0;
	Boolean guppy = true;
	Integer soul = 0;
	String dosCarte = "image/visuel_tresor/TreasureCardBack.png";
	Consumer<Heros> effect;
	Consumer<Heros> depart;
	
	public Tresor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Tresor(String name,String img,String text,Boolean eternal) {
		//Consumer<Heros> effect,Consumer<Heros> depart
		super(name, img, text);
		this.eternal=eternal;
		//this.effect=effect;
		//this.depart=depart;
		
		
		
	}




	public Consumer<Heros> getEffect() {
		return effect;
	}




	public void setEffect(Consumer<Heros> effect) {
		this.effect = effect;
	}




	public Consumer<Heros> getDepart() {
		return depart;
	}




	public void setDepart(Consumer<Heros> depart) {
		this.depart = depart;
	}




	public Boolean getGuppy() {
		return guppy;
	}




	public void setGuppy(Boolean guppy) {
		this.guppy = guppy;
	}




	public Integer getAbilitie() {
		return Abilitie;
	}




	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
	}




	public Boolean getEternal() {
		return eternal;
	}




	public void setEternal(Boolean eternal) {
		this.eternal = eternal;
	}




	public int getCounter() {
		return counter;
	}




	public void setCounter(int counter) {
		this.counter = counter;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Abilitie, counter, eternal, guppy);
		return result;
	}




	public Integer getSoul() {
		return soul;
	}




	public void setSoul(Integer soul) {
		this.soul = soul;
	}




	public String getDosCarte() {
		return dosCarte;
	}




	public void setDosCarte(String dosCarte) {
		this.dosCarte = dosCarte;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tresor other = (Tresor) obj;
		return Objects.equals(Abilitie, other.Abilitie) && counter == other.counter
				&& Objects.equals(eternal, other.eternal) && Objects.equals(guppy, other.guppy);
	}




	@Override
	public String toString() {
		return "Tresor [name=" + name + "]";
	}
	public String name () {
		return this.name;
		
		
		
		
	}
	
	
	
}
