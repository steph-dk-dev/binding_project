package json.reader;

import java.util.Objects;

public class Player {

	
	private String name=null;
	private Integer action;
	private Boolean status;
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(String name, Integer action, Boolean status) {
		super();
		this.name = name;
		this.action = action;
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAction() {
		return action;
	}


	public void setAction(Integer action) {
		this.action = action;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		return Objects.hash(action, name, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(action, other.action) && Objects.equals(name, other.name)
				&& Objects.equals(status, other.status);
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", action=" + action + ", status=" + status + "]";
	}
	
	
}
