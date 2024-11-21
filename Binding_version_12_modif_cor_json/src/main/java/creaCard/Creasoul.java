package creaCard;
import cartes.Soul;

public class Creasoul {

	public Creasoul() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Crée une instance représentant l'âme de la gloutonnerie.
	 * Le premier joueur à avoir 10 cartes de butin ou plus dans sa main gagne cette âme.
	 *
	 * @return un nouvel objet Soul représentant l'âme de la gloutonnerie.
	 */
	public static Soul soul_of_gluttony() {
	    Soul gluttony = new Soul("Soul Of Gluttony", "image/ame_sup/b2-soul_of_gluttony.png", "The first player to have 10 or more loot cards in their hand gains this soul.");
	    return gluttony;
	}

	/**
	 * Crée une instance représentant l'âme de l'avarice.
	 * Le premier joueur à avoir 25¢ ou plus gagne cette âme.
	 *
	 * @return un nouvel objet Soul représentant l'âme de l'avarice.
	 */
	public static Soul soul_of_greed() {
	    Soul greed = new Soul("Soul Of Greed", "image/ame_sup/b2-soul_of_greed.png", "The first player to have 25¢ or more gains this soul.");
	    return greed;
	}

	/**
	 * Crée une instance représentant l'âme de Guppy.
	 * Le premier joueur à contrôler 2 objets Guppy ou plus gagne cette âme.
	 *
	 * @return un nouvel objet Soul représentant l'âme de Guppy.
	 */
	public static Soul soul_of_guppy() {
	    Soul guppy = new Soul("Soul Of Guppy", "image/ame_sup/b2-soul_of_guppy.png", "The first player to control 2 or more guppy items gains this soul.");
	    return guppy;
	}

	
	
}
