package cartes;

import java.util.Objects;

public class Common extends Carte{

	Integer Abilitie;
	static String dosCarte = "image/visuel_common/LootCardBack.png";
	 

	public Common() {
		super();
	}

	public Common(String name,String img ,String text) {
		super(name, img, text);
	
	}
	public Integer getAbilitie() {
		return Abilitie;
	}


	
	public void setAbilitie(Integer abilitie) {
		Abilitie = abilitie;
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
