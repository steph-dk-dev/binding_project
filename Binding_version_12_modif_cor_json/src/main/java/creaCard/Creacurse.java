package creaCard;
import cartes.Curse;

public class Creacurse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Crée une malédiction représentant la Malédiction de l'Amnésie.
	 * À la fin de votre tour, défaussez 2 cartes de butin.
	 *
	 * @return un nouvel objet Curse représentant la Malédiction de l'Amnésie.
	 */
	public static Curse curse_of_amnesia() {
	    Curse amnesia = new Curse("Curse Of Amnesia", "image/visuel_monstre/b2-curse_of_amnesia.png", "Curse Effect At the end of your turn, discard 2 loot cards.");
	    return amnesia;
	}

	/**
	 * Crée une malédiction représentant la Malédiction de la Greed.
	 * À la fin de votre tour, perdez 4¢.
	 *
	 * @return un nouvel objet Curse représentant la Malédiction de la Greed.
	 */
	public static Curse curse_of_greed() {
	    Curse greed = new Curse("Curse Of Greed", "image/visuel_monstre/b2-curse_of_greed.png", "Curse Effect At the end of your turn, lose 4¢.");
	    return greed;
	}

	/**
	 * Crée une malédiction représentant la Malédiction de la Perte.
	 * Lorsque vous mourrez, détruisez une âme que vous contrôlez.
	 *
	 * @return un nouvel objet Curse représentant la Malédiction de la Perte.
	 */
	public static Curse curse_of_loss() {
	    Curse loss = new Curse("Curse Of Loss", "image/visuel_monstre/b2-curse_of_loss.png", "Curse Effect When you die, destroy a soul you control.");
	    return loss;
	}

	/**
	 * Crée une malédiction représentant la Malédiction de la Douleur.
	 * Au début de votre tour, subissez 1 dégât.
	 *
	 * @return un nouvel objet Curse représentant la Malédiction de la Douleur.
	 */
	public static Curse curse_of_pain() {
	    Curse pain = new Curse("Curse Of Pain", "image/visuel_monstre/b2-curse_of_pain.png", "Curse Effect At the start of your turn, take 1 damage.");
	    return pain;
	}

	/**
	 * Crée une malédiction représentant la Malédiction des Aveugles.
	 * Les monstres ont +1DC pendant votre tour.
	 *
	 * @return un nouvel objet Curse représentant la Malédiction des Aveugles.
	 */
	public static Curse curse_of_the_blind() {
	    Curse blind = new Curse("Curse Of The Blind", "image/visuel_monstre/b2-curse_of_the_blind.png", "Curse Effect Monsters have +1DC on your turn.");
	    return blind;
	}

	
	
}
