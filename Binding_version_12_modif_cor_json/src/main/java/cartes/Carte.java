package cartes;

import java.util.Objects;

public class Carte {

	String name ;
	String image;
	String text;
	Boolean etats=true;
	Integer owner = null; 


	public Carte() {
		
	}




	public Carte(String name, String image, String text, Boolean etats, Integer owner) {
		super();
		this.name = name;
		this.image = image;
		this.text = text;
		this.etats = etats;
		this.owner = owner;
	}
	
	public Carte(String name, String image, String text) {
		super();
		this.name = name;
		this.image = image;
		this.text = text;
		this.etats = false;
		this.owner = 0;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public Boolean getEtats() {
		return etats;
	}


	public void setEtats(Boolean etats) {
		this.etats = etats;
	}


	@Override
	public int hashCode() {
		return Objects.hash(etats, image, name, owner, text);
	}


	public Integer getOwner() {
		return owner;
	}


	public void setOwner(Integer owner) {
		this.owner = owner;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carte other = (Carte) obj;
		return Objects.equals(etats, other.etats) && Objects.equals(image, other.image)
				&& Objects.equals(name, other.name) && Objects.equals(owner, other.owner)
				&& Objects.equals(text, other.text);
	}


	@Override
	public String toString() {
		return "Carte [name=" + name + ", image=" + image + ", text=" + text + ", etats=" + etats + ", owner=" + owner
				+ "]";
	}






}
