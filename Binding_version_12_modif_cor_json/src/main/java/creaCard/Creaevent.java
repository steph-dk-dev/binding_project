package creaCard;
import cartes.Event;

public class Creaevent {

	public Creaevent() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Crée un événement représentant une embuscade.
	 * Le joueur actif doit attaquer le deck de monstres 2 fois ce tour-ci.
	 *
	 * @return un nouvel objet Event représentant l'embuscade.
	 */
	public static Event ambush() {
	    Event ambush = new Event("Ambush!", "image/visuel_monstre/b2-ambush.png", "The active player must attack the monster deck 2 times this turn.");
	    return ambush;
	}

	/**
	 * Crée un événement représentant un coffre.
	 * Lancez le dé pour déterminer la récompense en pièces.
	 * - 1-2 : Gagnez 1¢.
	 * - 3-4 : Gagnez 3¢.
	 * - 5-6 : Gagnez 6¢.
	 *
	 * @return un nouvel objet Event représentant le coffre.
	 */
	public static Event chest1() {
	    Event chest = new Event("Chest", "image/visuel_monstre/b2-chest.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Gain 1¢.\r\n"
	            + "3-4: Gain 3¢.\r\n"
	            + "5-6: Gain 6¢.");
	    return chest;
	}

	/**
	 * Crée un événement représentant un autre coffre.
	 * Lancez le dé pour déterminer le nombre de butins gagnés.
	 * - 1-2 : Loot 1.
	 * - 3-4 : Loot 2.
	 * - 5-6 : Loot 3.
	 *
	 * @return un nouvel objet Event représentant le coffre.
	 */
	public static Event chest2() {
	    Event chest = new Event("Chest", "image/visuel_monstre/b2-chest_2.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Loot 1.\r\n"
	            + "3-4: Loot 2.\r\n"
	            + "5-6: Loot 3.");
	    return chest;
	}

	/**
	 * Crée un événement représentant un coffre maudit.
	 * Lancez le dé pour déterminer l'effet.
	 * - 1-3 : Prenez 1 dégât.
	 * - 4-5 : Prenez 2 dégâts.
	 * - 6 : Cherchez dans le deck de trésors un objet Guppy, gagnez-le, puis mélangez le deck de trésors.
	 *
	 * @return un nouvel objet Event représentant le coffre maudit.
	 */
	public static Event cursed_chest() {
	    Event chest = new Event("Cursed Chest", "image/visuel_monstre/b2-cursed_chest.png", "Roll-\r\n"
	            + "1-3: Take 1 Damage.\r\n"
	            + "4-5: Take 2 Damage.\r\n"
	            + "6: Search the treasure deck for a Guppy item, gain it, then shuffle the treasure deck.");
	    return chest;
	}

	/**
	 * Crée un événement représentant un coffre sombre.
	 * Lancez le dé pour déterminer l'effet.
	 * - 1-2 : Loot 1.
	 * - 3-4 : Gagnez 3¢.
	 * - 5-6 : Prenez 2 dégâts.
	 *
	 * @return un nouvel objet Event représentant le coffre sombre.
	 */
	public static Event dark_chest() {
	    Event chest = new Event("Dark Chest", "image/visuel_monstre/b2-dark_chest.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Loot 1.\r\n"
	            + "3-4: Gain 3¢.\r\n"
	            + "5-6: Take 2 damage.");
	    return chest;
	}

	/**
	 * Crée un événement représentant un autre coffre sombre.
	 * Lancez le dé pour déterminer l'effet.
	 * - 1-2 : Gagnez 1¢.
	 * - 3-4 : Loot 2.
	 * - 5-6 : Prenez 2 dégâts.
	 *
	 * @return un nouvel objet Event représentant le coffre sombre.
	 */
	public static Event dark_chest2() {
	    Event chest = new Event("Dark Chest", "image/visuel_monstre/b2-dark_chest_2.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Gain 1¢.\r\n"
	            + "3-4: Loot 2.\r\n"
	            + "5-6: Take 2 damage.");
	    return chest;
	}

	/**
	 * Crée un événement représentant un pacte avec le diable.
	 * Le joueur choisit une option parmi les suivantes :
	 * - Mettre cet événement dans le défausse.
	 * - Loot 2 et prendre 1 dégât.
	 * - Prendre 2 dégâts, chercher dans le deck de trésors un objet Guppy, le gagner, puis mélanger le deck de trésors.
	 *
	 * @return un nouvel objet Event représentant le pacte avec le diable.
	 */
	public static Event devil_deal() {
	    Event devil = new Event("Devil Deal", "image/visuel_monstre/b2-devil_deal.png", "Choose one-\r\n"
	            + "\r\n"
	            + "    Put this into discard.\r\n"
	            + "    Loot 2. Take 1 damage.\r\n"
	            + "    Take 2 damage. Search the treasure deck for a guppy item, gain it, then shuffle the treasure deck.");
	    return devil;
	}

	/**
	 * Crée un événement représentant un coffre doré.
	 * Lancez le dé pour déterminer la récompense.
	 * - 1-2 : Gagnez +1 trésor.
	 * - 3-4 : Loot 1.
	 * - 5-6 : Loot 2.
	 *
	 * @return un nouvel objet Event représentant le coffre doré.
	 */
	public static Event gold_chest() {
	    Event gold = new Event("Gold Chest", "image/visuel_monstre/b2-gold_chest_2.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Gain +1 Treasure.\r\n"
	            + "3-4: Loot 1.\r\n"
	            + "5-6: Loot 2.");
	    return gold;
	}

	/**
	 * Crée un événement représentant un autre coffre doré.
	 * Lancez le dé pour déterminer la récompense.
	 * - 1-2 : Gagnez +1 trésor.
	 * - 3-4 : Gagnez 5¢.
	 * - 5-6 : Gagnez 7¢.
	 *
	 * @return un nouvel objet Event représentant le coffre doré.
	 */
	public static Event gold_chest2() {
	    Event gold = new Event("Gold Chest", "image/visuel_monstre/b2-gold_chest.png", "Roll-\r\n"
	            + "\r\n"
	            + "1-2: Gain +1 Treasure.\r\n"
	            + "3-4: Gain 5¢.\r\n"
	            + "5-6: Gain 7¢.");
	    return gold;
	}

	/**
	 * Crée un événement représentant la cupidité.
	 * Choisissez le joueur avec le plus de ¢ ou à égalité. Ce joueur perd tous ses ¢.
	 *
	 * @return un nouvel objet Event représentant la cupidité.
	 */
	public static Event greed() {
	    Event greed = new Event("Greed!", "image/visuel_monstre/b2-greed.png", "Choose the player with the most ¢ or tied for the most. That player loses all their ¢.\r\n"
	            + "Monster Card Back");
	    return greed;
	}

	/**
	 * Crée un événement représentant la capacité de voir au-delà.
	 * Regardez les 6 premières cartes du deck de butin. Remettez-les dans n'importe quel ordre, puis loot 1.
	 *
	 * @return un nouvel objet Event représentant la capacité de voir au-delà.
	 */
	public static Event i_can_see_forever() {
	    Event see = new Event("I Can See Forever!", "image/visuel_monstre/b2-i_can_see_forever.png", "Look at the top 6 cards of the loot deck. Put them back in any order, then loot 1.");
	    return see;
	}

	/**
	 * Crée un événement représentant une bombe méga troll.
	 * Chaque joueur subit 2 dégâts.
	 *
	 * @return un nouvel objet Event représentant la méga bombe troll.
	 */
	public static Event mega_troll_bomb() {
	    Event bomb = new Event("Mega Troll Bomb!", "image/visuel_monstre/b2-mega_troll_bomb.png", "Each player takes 2 damage!");
	    return bomb;
	}

	/**
	 * Crée un événement représentant une salle secrète.
	 * Lancez le dé pour déterminer l'effet.
	 * - 1 : Prenez 3 dégâts.
	 * - 2-3 : Défaussez 2 cartes de butin.
	 * - 4-5 : Gagnez 7¢.
	 * - 6 : Gagnez +1 trésor.
	 *
	 * @return un nouvel objet Event représentant la salle secrète.
	 */
	public static Event secret_room() {
	    Event secret = new Event("Secret Room!", "image/visuel_monstre/b2-secret_room.png", "Roll-\r\n"
	            + "\r\n"
	            + "1: Take 3 damage.\r\n"
	            + "2-3: Discard 2 loot cards.\r\n"
	            + "4-5: Gain 7¢.\r\n"
	            + "6: Gain +1 Treasure.");
	    return secret;
	}

	/**
	 * Crée un événement représentant une amélioration de la boutique.
	 * Élargissez les emplacements de la boutique de 2.
	 * Le joueur actif peut attaquer une fois de plus ce tour-ci.
	 *
	 * @return un nouvel objet Event représentant l'amélioration de la boutique.
	 */
	public static Event shop_upgrade() {
	    Event shop = new Event("Shop Upgrade!", "image/visuel_monstre/b2-shop_upgrade.png", "Expand shop slots by 2.\r\n"
	            + "The active player may attack an additional time this turn.");
	    return shop;
	}

	/**
	 * Crée un événement représentant une bombe troll.
	 * Prenez 2 dégâts.
	 *
	 * @return un nouvel objet Event représentant la bombe troll.
	 */
	public static Event troll_bomb() {
	    Event bomb = new Event("Troll Bombs", "image/visuel_monstre/b2-troll_bombs.png", "Take 2 damage!");
	    return bomb;
	}

	/**
	 * Crée un événement représentant le besoin d'aller plus profondément.
	 * Mettez n'importe quel nombre de cartes de monstres non événement dans le défausse sur le dessus du deck de monstres.
	 * Le joueur actif peut attaquer une fois de plus ce tour-ci.
	 *
	 * @return un nouvel objet Event représentant le besoin d'aller plus profondément.
	 */
	public static Event we_need_to_go_deeper() {
	    Event go = new Event("We Need To Go Deeper!", "image/visuel_monstre/b2-we_need_to_go_deeper.png", "Put any number of non-event monster cards in discard on top of the monster deck.\r\n"
	            + "The active player may attack an additional time this turn.");
	    return go;
	}

	/**
	 * Crée un événement représentant un étage XL.
	 * Élargissez les emplacements de monstres de 1.
	 * Le joueur actif peut attaquer une fois de plus ce tour-ci.
	 *
	 * @return un nouvel objet Event représentant l'étage XL.
	 */
	public static Event xl_floor() {
	    Event xl = new Event("Xl Floor!", "image/visuel_monstre/b2-xl_floor.png", "Expand monster slots by 1.\r\n"
	            + "The active player may attack an additional time this turn.");
	    return xl;
	}

	
	
}
