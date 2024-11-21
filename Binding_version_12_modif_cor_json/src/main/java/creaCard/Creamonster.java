package creaCard;
import cartes.Monstre;
import bean.function;

public class Creamonster {

	// Fonction pour créer un monstre "Big Spider"
	public static Monstre big_spider() {
	    // Création d'un nouveau monstre avec ses caractéristiques
	    Monstre big = new Monstre("Big Spider", 
	        "image/visuel_monstre/b2-big_spider.png", 
	        "When this dies, the active player may attack the monster deck an additional time.", 
	        3, 4, 1, 0, 1, 0, 0);
	    return big;
	}

	// Fonction pour créer un monstre "Black Bony"
	public static Monstre black_bony() {
	    Monstre black = new Monstre("Black Bony", 
	        "image/visuel_monstre/b2-black_bony.png", 
	        "When this dies, it deals 1 damage to the player who killed it.", 
	        3, 4, 1, 0, bean.function.lancerDe(), 0, 0);
	    return black;
	}

	// Fonction pour créer un monstre "Boom Fly"
	public static Monstre boom_fly() {
	    Monstre boom = new Monstre("Boom Fly", 
	        "image/visuel_monstre/b2-boom_fly.png", 
	        "When this dies, it deals 1 damage to each player.", 
	        1, 4, 1, 4, 0, 0, 0);
	    return boom;
	}

	// Fonction pour créer un monstre "Clotty"
	public static Monstre clotty() {
	    Monstre clotty = new Monstre("Clotty", 
	        "image/visuel_monstre/b2-clotty.png", 
	        "", 2, 3, 1, 4, 0, 0, 0);
	    return clotty;
	}

	// Fonction pour créer un monstre "Cod Worm"
	public static Monstre cod_worm() {
	    Monstre cod = new Monstre("Cod Worm", 
	        "image/visuel_monstre/b2-cod_worm.png", 
	        "", 2, 5, 0, 3, 0, 0, 0);
	    return cod;
	}

	// Fonction pour créer un monstre "Conjoined Fatty"
	public static Monstre conjoined_fatty() {
	    Monstre fatty = new Monstre("Conjoined Fatty", 
	        "image/visuel_monstre/b2-conjoined_fatty.png", 
	        "", 4, 3, 2, 0, 2, 0, 0);
	    return fatty;
	}

	// Fonction pour créer un monstre "Dank Globin"
	public static Monstre dank_globin() {
	    Monstre dank = new Monstre("Dank Globin", 
	        "image/visuel_monstre/b2-dank_globin.png", 
	        "When this dies, the active player forces a player to discard 2 loot cards.", 
	        2, 4, 2, 0, 2, 0, 0);
	    return dank;
	}

	// Fonction pour créer un monstre "Delirium"
	public static Monstre delirium() {
	    Monstre deli = new Monstre("Delirium", 
	        "image/visuel_monstre/b2-delirium.png", 
	        "Other monsters have +1DC.\nWhen this dies, put it in the monster deck 6 cards from the top.", 
	        5, 4, 3, 0, 0, 2, 0);
	    return deli;
	}

	// Fonction pour créer un monstre "Dinga"
	public static Monstre dinga() {
	    Monstre dinga = new Monstre("Dinga", 
	        "image/visuel_monstre/b2-dinga.png", 
	        "When this dies on an attack roll of 6, double its rewards.", 
	        3, 3, 1, bean.function.lancerDe(), 0, 0, 0);
	    return dinga;
	}

	// Fonction pour créer un monstre "Dip"
	public static Monstre dip() {
	    Monstre dip = new Monstre("Dip", 
	        "image/visuel_monstre/b2-dip.png", 
	        "", 1, 4, 1, 1, 0, 0, 0);
	    return dip;
	}

	// Fonction pour créer un monstre "Dople"
	public static Monstre dople() {
	    Monstre dople = new Monstre("Dople", 
	        "image/visuel_monstre/b2-dople.png", 
	        "Damage dealt to this is also dealt to the player to the active player's right.", 
	        2, 4, 2, 7, 0, 0, 0);
	    return dople;
	}

	// Fonction pour créer un monstre "Evil Twin"
	public static Monstre evil_twin() {
	    Monstre evil = new Monstre("Evil Twin", 
	        "image/visuel_monstre/b2-evil_twin.png", 
	        "Damage dealt to this is also dealt to the player to the active player's left.", 
	        3, 5, 2, 0, 0, 1, 0);
	    return evil;
	}

	// Fonction pour créer un monstre "Fat Bat"
	public static Monstre fat_bat() {
	    Monstre fat = new Monstre("Fat Bat", 
	        "image/visuel_monstre/b2-fat_bat.png", 
	        "", 3, 5, 1, 0, 0, 1, 0);
	    return fat;
	}

	// Fonction pour créer un monstre "Fatty"
	public static Monstre fatty() {
	    Monstre fatty = new Monstre("Fatty", 
	        "image/visuel_monstre/b2-fatty.png", 
	        "", 4, 2, 1, 0, 1, 0, 0);
	    return fatty;
	}

	// Fonction pour créer un monstre "Fly"
	public static Monstre fly() {
	    Monstre fly = new Monstre("Fly", 
	        "image/visuel_monstre/b2-fly.png", 
	        "", 1, 2, 1, 1, 0, 0, 0);
	    return fly;
	}

	// Fonction pour créer un monstre "Greedling"
	public static Monstre greedling() {
	    Monstre greed = new Monstre("Greedling", 
	        "image/visuel_monstre/b2-greedling.png", 
	        "When this dies, the active player chooses a player. They lose 7¢.", 
	        2, 5, 1, 7, 0, 0, 0);
	    return greed;
	}

	// Fonction pour créer un monstre "Hanger"
	public static Monstre hanger() {
	    Monstre hanger = new Monstre("Hanger", 
	        "image/visuel_monstre/b2-hanger.png", 
	        "When this dies, expand shop slots by 1.", 
	        2, 4, 2, 7, 0, 0, 0);
	    return hanger;
	}

	// Fonction pour créer un monstre "Hopper"
	public static Monstre hopper() {
	    Monstre hopper = new Monstre("Hopper", 
	        "image/visuel_monstre/b2-hopper.png", 
	        "This takes no combat damage on attack rolls of 6.", 
	        2, 3, 1, 3, 0, 0, 0);
	    return hopper;
	}

	// Fonction pour créer un monstre "Horf"
	public static Monstre horf() {
	    Monstre horf = new Monstre("Horf", 
	        "image/visuel_monstre/b2-horf.png", 
	        "Combat damage this deals is increased by 1 on attack rolls of 2.", 
	        1, 4, 1, 3, 0, 0, 0);
	    return horf;
	}

	// Fonction pour créer un monstre "Keeper Head"
	public static Monstre keeper_head() {
	    Monstre head = new Monstre("Keeper Head", 
	        "image/visuel_monstre/b2-keeper_head.png", 
	        "Each time this deals combat damage to a player, they lose 2¢.", 
	        2, 4, 1, bean.function.lancerDe(), 0, 0, 0);
	    return head;
	}

	// Fonction pour créer un monstre "Leaper"
	public static Monstre leaper() {
	    Monstre leaper = new Monstre("Leaper", 
	        "image/visuel_monstre/b2-leaper.png", 
	        "Combat damage this deals is doubled on attack rolls of 1.", 
	        2, 4, 1, 5, 0, 0, 0);
	    return leaper;
	}

	// Fonction pour créer un monstre "Leech"
	public static Monstre leech() {
	    Monstre leech = new Monstre("Leech", 
	        "image/visuel_monstre/b2-leech.png", 
	        "", 1, 4, 2, 0, 1, 0, 0);
	    return leech;
	}

	// Fonction pour créer un monstre "Mom’s Dead Hand"
	public static Monstre moms_dead_hand() {
	    Monstre dead = new Monstre("Mom’s Dead Hand", 
	        "/Binding/src/main/webapp/image/visuel_monstre/b2-moms_dead_hand.png", 
	        "When this dies, the active player may steal a non-eternal item another player controls.", 
	        2, 5, 1, 4, 0, 0, 0);
	    return dead;
	}

	// Fonction pour créer un monstre "Mom’s Eye"
	public static Monstre moms_eye() {
	    Monstre eye = new Monstre("Mom’s Eye", 
	        "image/visuel_monstre/b2-moms_eye.png", 
	        "When this dies, the active player may look at a player's hand.", 
	        1, 4, 2, 0, 1, 0, 0);
	    return eye;
	}

	// Fonction pour créer un monstre "Mom’s Hand"
	public static Monstre moms_hand() {
	    Monstre hand = new Monstre("Mom’s Hand", 
	        "image/visuel_monstre/b2-moms_hand.png", 
	        "When the attacking player rolls an attack roll of 6, cancel everything that hasn't resolved and end the turn.", 
	        2, 4, 1, 4, 0, 0, 0);
	    return hand;
	}

	// Fonction pour créer un monstre "Mulliboom"
	public static Monstre mulliboom() {
	    Monstre boom = new Monstre("Mulliboom", 
	        "image/visuel_monstre/b2-mulliboom.png", 
	        "When this dies, the active player deals 3 damage to a player.", 
	        1, 2, 4, 6, 0, 0, 0);
	    return boom;
	}

	// Fonction pour créer un monstre "Mulligan"
	public static Monstre mulligan() {
	    Monstre mulli = new Monstre("Mulligan", 
	        "image/visuel_monstre/b2-mulligan.png", 
	        "When this dies, expand monster slots by 1.", 
	        1, 3, 1, 3, 0, 0, 0);
	    return mulli;
	}

	// Fonction pour créer un monstre "Pale Fatty"
	public static Monstre pale_fatty() {
	    Monstre pale = new Monstre("Pale Fatty", 
	        "image/visuel_monstre/b2-pale_fatty.png", 
	        "", 4, 3, 1, 6, 0, 0, 0);
	    return pale;
	}

	// Fonction pour créer un monstre "Pooter"
	public static Monstre pooter() {
	    Monstre pooter = new Monstre("Pooter", 
	        "image/visuel_monstre/b2-pooter.png", 
	        "", 2, 3, 1, 0, 1, 0, 0);
	    return pooter;
	}

	// Fonction pour créer un monstre "Portal"
	public static Monstre portal() {
	    Monstre portal = new Monstre("Portal", 
	        "image/visuel_monstre/b2-portal.png", 
	        "When this dies, the active player must make an additional attack.", 
	        2, 4, 1, 3, 0, 0, 0);
	    return portal;
	}

	// Fonction pour créer un monstre "Psy Horf"
	public static Monstre psy_horf() {
	    Monstre psy = new Monstre("Psy Horf", 
	        "image/visuel_monstre/b2-psy_horf.png", 
	        "When this dies, the active player recharges each item they control.", 
	        1, 5, 1, 0, 1, 0, 0);
	    return psy;
	}

	// Fonction pour créer un monstre "Rage Creep"
	public static Monstre rage_creep() {
	    Monstre rage = new Monstre("Rage Creep", 
	        "image/visuel_monstre/b2-rage_creep.png", 
	        "Damage this deals to the active player is also dealt to the player to their left.", 
	        1, 5, 1, 0, 1, 0, 0);
	    return rage;
	}

	// Fonction pour créer un monstre "Red Host"
	public static Monstre red_host() {
	    Monstre red = new Monstre("Red Host", 
	        "image/visuel_monstre/b2-red_host.png", 
	        "", 2, 3, 2, 5, 0, 0, 0);
	    return red;
	}

	// Fonction pour créer un monstre "Ring Of Flies"
	public static Monstre ring_of_flies() {
	    Monstre ring = new Monstre("Ring Of Flies", 
	        "image/visuel_monstre/b2-ring_of_flies.png", 
	        "Each time the attacking player rolls an attack roll of 3, they must steal a loot card from another player at random.", 
	        3, 3, 1, 3, 0, 0, 0);
	    return ring;
	}

	// Fonction pour créer un monstre "Spider"
	public static Monstre spider() {
	    Monstre spider = new Monstre("Spider", 
	        "image/visuel_monstre/b2-spider.png", 
	        "", 1, 4, 1, 0, 1, 0, 0);
	    return spider;
	}

	// Fonction pour créer un monstre "Squirt"
	public static Monstre squirt() {
	    Monstre squirt = new Monstre("Squirt", 
	        "image/visuel_monstre/b2-squirt.png", 
	        "", 2, 3, 1, 0, 1, 0, 0);
	    return squirt;
	}

	// Fonction pour créer un monstre "Stoney"
	public static Monstre stonney() {
	    Monstre ston = new Monstre("Stoney", 
	        "image/visuel_monstre/b2-stoney.png", 
	        "Monsters have +1DC.\nThis can't be attacked.\nWhen another monster dies, this dies.", 
	        3, 0, 0, 0, 1, 0, 0);
	    return ston;
	}

	/**
	 * Crée un monstre représentant un essaim de mouches.
	 * Chaque fois que le joueur attaquant obtient un jet d'attaque de 5,
	 * il subit 1 point de dégâts.
	 *
	 * @return un nouvel objet Monstre représentant l'essaim de mouches.
	 */
	public static Monstre swarm_of_flie() {
	    Monstre swarm = new Monstre(
	        "Swarm Of Flies", // Nom du monstre
	        "image/visuel_monstre/b2-swarm_of_flies.png", // Chemin de l'image du monstre
	        "Each time the attacking player rolls an attack roll of 5, they take 1 damage.", // Description de l'effet
	        5, // Points de vie (HP)
	        2, // Évasion (evade)
	        1, // Attaque (ATK)
	        5, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return swarm;
	}

	/**
	 * Crée un monstre représentant un Trite.
	 * Ce monstre ne possède pas d'effet spécial et est relativement faible.
	 *
	 * @return un nouvel objet Monstre représentant un Trite.
	 */
	public static Monstre trite() {
	    Monstre trite = new Monstre(
	        "Trite", // Nom du monstre
	        "image/visuel_monstre/b2-trite.png", // Chemin de l'image du monstre
	        "", // Pas d'effet spécial
	        1, // Points de vie (HP)
	        5, // Évasion (evade)
	        1, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        2, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return trite;
	}

	/**
	 * Crée un monstre représentant un Wizoob.
	 * Lorsque ce monstre est détruit, le joueur actif choisit un autre joueur
	 * qui doit détruire une âme qu'il contrôle.
	 *
	 * @return un nouvel objet Monstre représentant un Wizoob.
	 */
	public static Monstre wizoob() {
	    Monstre wi = new Monstre(
	        "Wizoob", // Nom du monstre
	        "image/visuel_monstre/b2-wizoob.png", // Chemin de l'image du monstre
	        "When this dies, the active player chooses a player. That player destroys a soul they control.", // Description de l'effet
	        3, // Points de vie (HP)
	        5, // Évasion (evade)
	        1, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        3, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return wi;
	}

	/**
	 * Crée un monstre représentant un Cursed Fatty.
	 * Chaque fois qu'un joueur obtient un 5 au dé, il doit défausser une carte de butin.
	 *
	 * @return un nouvel objet Monstre représentant un Cursed Fatty.
	 */
	public static Monstre cursed_fatty() {
	    Monstre fatty = new Monstre(
	        "Cursed Fatty", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_fatty.png", // Chemin de l'image du monstre
	        "Curse Effect Each time a player rolls a ➄, they discard a loot card.", // Description de l'effet
	        4, // Points de vie (HP)
	        2, // Évasion (evade)
	        1, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        2, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return fatty;
	}

	/**
	 * Crée un monstre représentant un Cursed Gaper.
	 * Chaque fois qu'un joueur obtient un 4 au dé, chaque monstre gagne +1 ATK
	 * jusqu'à la fin du tour.
	 *
	 * @return un nouvel objet Monstre représentant un Cursed Gaper.
	 */
	public static Monstre cursed_gaper() {
	    Monstre gaper = new Monstre(
	        "Cursed Gaper", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_gaper.png", // Chemin de l'image du monstre
	        "Curse Effect Each time a player rolls a ➃, each monster gains +1ATK till end of turn.", // Description de l'effet
	        2, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        3, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return gaper;
	}

	/**
	 * Crée un monstre représentant un Cursed Horf.
	 * Chaque fois qu'un joueur obtient un 2 au dé, il subit 2 points de dégâts.
	 *
	 * @return un nouvel objet Monstre représentant un Cursed Horf.
	 */
	public static Monstre cursed_horf() {
	    Monstre horf = new Monstre(
	        "Cursed Horf", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_horf.png", // Chemin de l'image du monstre
	        "Curse Effect Each time a player rolls a ➁, they take 2 damage.", // Description de l'effet
	        1, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        3, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return horf;
	}

	/**
	 * Crée un monstre représentant une tête de gardien maudite.
	 * Chaque fois qu'un joueur obtient un 1 au dé, il perd 2¢.
	 *
	 * @return un nouvel objet Monstre représentant une tête de gardien maudite.
	 */
	public static Monstre cursed_keeper_head() {
	    Monstre head = new Monstre(
	        "Cursed Keeper Head", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_keeper_head.png", // Chemin de l'image du monstre
	        "Curse Effect Each time a player rolls a ➀, they lose 2¢.", // Description de l'effet
	        2, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        bean.function.lancerDe(), // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return head;
	}

	/**
	 * Crée un monstre représentant la main maudite de maman.
	 * Lorsque le joueur actif obtient un 6 au dé, toutes les actions non résolues
	 * sont annulées et le tour se termine.
	 *
	 * @return un nouvel objet Monstre représentant la main maudite de maman.
	 */
	public static Monstre cursed_moms_hand() {
	    Monstre mom = new Monstre(
	        "Cursed Mom’s Hand", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_moms_hand.png", // Chemin de l'image du monstre
	        "Curse Effect When the active player rolls a 6, cancel everything that hasn't resolved and end the turn.", // Description de l'effet
	        2, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        4, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return mom;
	}

	/**
	 * Crée un monstre représentant un Cursed Psy Horf.
	 * Chaque fois qu'un joueur utilise un objet, il subit 1 point de dégâts.
	 *
	 * @return un nouvel objet Monstre représentant un Cursed Psy Horf.
	 */
	public static Monstre cursed_psy_horf() {
	    Monstre psy = new Monstre(
	        "Cursed Psy Horf", // Nom du monstre
	        "image/visuel_monstre/b2-cursed_psy_horf.png", // Chemin de l'image du monstre
	        "Curse Effect Each time a player activates an item, they take 1 damage.", // Description de l'effet
	        1, // Points de vie (HP)
	        5, // Évasion (evade)
	        1, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        2, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return psy;
	}

	/**
	 * Crée un monstre représentant un Holy Dinga.
	 * Chaque fois qu'un joueur obtient un 6 au dé, il récupère 1 HP.
	 *
	 * @return un nouvel objet Monstre représentant un Holy Dinga.
	 */
	public static Monstre holy_dinga() {
	    Monstre dinga = new Monstre(
	        "Holy Dinga", // Nom du monstre
	        "image/visuel_monstre/b2-holy_dinga.png", // Chemin de l'image du monstre
	        "Each time a player rolls a ❻, they heal 1HP.", // Description de l'effet
	        3, // Points de vie (HP)
	        3, // Évasion (evade)
	        1, // Attaque (ATK)
	        bean.function.lancerDe(), // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return dinga;
	}

	/**
	 * Crée un monstre représentant un Holy Dip.
	 * Chaque fois qu'un joueur obtient un 1 au dé, il gagne 1¢.
	 *
	 * @return un nouvel objet Monstre représentant un Holy Dip.
	 */
	public static Monstre holy_dip() {
	    Monstre dip = new Monstre(
	        "Holy Dip", // Nom du monstre
	        "image/visuel_monstre/b2-holy_dip.png", // Chemin de l'image du monstre
	        "Each time a player rolls a ❶, they gain 1¢.", // Description de l'effet
	        1, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        1, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return dip;
	}

	/**
	 * Crée un monstre représentant une tête de gardien sacré.
	 * Chaque fois qu'un joueur obtient un 4 au dé, il gagne 2¢.
	 *
	 * @return un nouvel objet Monstre représentant une tête de gardien sacré.
	 */
	public static Monstre holy_keeper_head() {
	    Monstre head = new Monstre(
	        "Holy Keeper Head", // Nom du monstre
	        "image/visuel_monstre/b2-holy_keeper_head.png", // Chemin de l'image du monstre
	        "Each time a player rolls a ❹, they gain 2¢.", // Description de l'effet
	        2, // Points de vie (HP)
	        4, // Évasion (evade)
	        1, // Attaque (ATK)
	        bean.function.lancerDe(), // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return head;
	}

	/**
	 * Crée un monstre représentant l'œil sacré de maman.
	 * Chaque fois qu'un joueur obtient un 2 au dé, il peut recharger un objet.
	 *
	 * @return un nouvel objet Monstre représentant l'œil sacré de maman.
	 */
	public static Monstre holy_moms_eye() {
	    Monstre eye = new Monstre(
	        "Holy Mom’s Eye", // Nom du monstre
	        "image/visuel_monstre/b2-holy_moms_eye.png", // Chemin de l'image du monstre
	        "Each time a player rolls a ❷, they may recharge an item.", // Description de l'effet
	        0, // Points de vie (HP)
	        1, // Évasion (evade)
	        0, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        0, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return eye;
	}

	/**
	 * Crée un monstre représentant un Holy Squirt.
	 * Chaque fois qu'un joueur obtient un 5 au dé, il loot 1 carte.
	 *
	 * @return un nouvel objet Monstre représentant un Holy Squirt.
	 */
	public static Monstre holy_squirt() {
	    Monstre squirt = new Monstre(
	        "Holy Squirt", // Nom du monstre
	        "image/visuel_monstre/b2-holy_squirt.png", // Chemin de l'image du monstre
	        "Each time a player rolls a ❺, they loot 1.", // Description de l'effet
	        2, // Points de vie (HP)
	        3, // Évasion (evade)
	        1, // Attaque (ATK)
	        0, // Récompense en or (goldReward)
	        2, // Récompense en loot (lootReward)
	        0, // Récompense en trésor (treasureReward)
	        0  // Récompense en soul (soulReward)
	    );
	    return squirt;
	}


	/**
	 * Crée un monstre représentant Carrion Queen.
	 * Ce monstre ne subit aucun dégât de combat sur des lancers d'attaque de 4 ou 5.
	 *
	 * @return un nouvel objet Monstre représentant Carrion Queen.
	 */
	public static Monstre carrion_queen() { 
	    Monstre queen = new Monstre("Carrion Queen", "image/visuel_monstre/b2-carrion_queen.png", "This takes no combat damage on attack rolls of 4 or 5.", 3, 4, 1, 0, 0, 1, 1);
	    return queen;
	}

	/**
	 * Crée un monstre représentant Chub.
	 * Chaque fois que le joueur attaquant obtient un lancer d'attaque de 1, ce monstre guérit 2 HP.
	 *
	 * @return un nouvel objet Monstre représentant Chub.
	 */
	public static Monstre chub() {
	    Monstre chub = new Monstre("Chub", "image/visuel_monstre/b2-chub.png", "Each time the attacking player rolls an attack roll of 1, this heals 2HP", 4, 3, 1, 7, 0, 0, 1);
	    return chub;
	}

	/**
	 * Crée un monstre représentant Conquest.
	 * Lorsque ce monstre meurt, le joueur actif doit effectuer une attaque supplémentaire.
	 *
	 * @return un nouvel objet Monstre représentant Conquest.
	 */
	public static Monstre conquest() {
	    Monstre conquest = new Monstre("Conquest", "image/visuel_monstre/b2-conquest.png", "When this dies, the active player must make an additional attack.", 2, 3, 1, 6, 0, 0, 1);
	    return conquest;
	}

	/**
	 * Crée un monstre représentant Daddy Long Legs.
	 * Chaque fois que le joueur attaquant obtient un lancer d'attaque de 1, chaque monstre gagne +1 DC jusqu'à la fin du tour.
	 *
	 * @return un nouvel objet Monstre représentant Daddy Long Legs.
	 */
	public static Monstre daddy_longs_legs() {
	    Monstre daddy = new Monstre("Daddy Long Legs", "image/visuel_monstre/b2-daddy_long_legs.png", "Each time the attacking player rolls an attack roll of 1, each monster gains +1DC till end of turn.", 4, 4, 1, 7, 0, 0, 1);
	    return daddy;
	}

	/**
	 * Crée un monstre représentant Dark One.
	 * Chaque fois que ce monstre prend des dégâts, il gagne +1 ATK jusqu'à la fin du tour.
	 *
	 * @return un nouvel objet Monstre représentant Dark One.
	 */
	public static Monstre dark_one() {
	    Monstre dark = new Monstre("Dark One", "image/visuel_monstre/b2-dark_one.png", "Each time this takes damage, it gains +1ATK till end of turn.", 3, 4, 1, 0, 0, 1, 1);
	    return dark;
	}

	/**
	 * Crée un monstre représentant Death.
	 * Lorsque ce monstre meurt, le joueur actif tue un autre joueur.
	 *
	 * @return un nouvel objet Monstre représentant Death.
	 */
	public static Monstre death() {
	    Monstre death = new Monstre("Death", "image/visuel_monstre/b2-death.png", "When this dies, the active player kills a player.", 3, 4, 2, 0, 0, 1, 1);
	    return death;
	}

	/**
	 * Crée un monstre représentant Envy.
	 * Lorsque ce monstre meurt, le joueur actif doit effectuer une attaque supplémentaire.
	 *
	 * @return un nouvel objet Monstre représentant Envy.
	 */
	public static Monstre envy() {
	    Monstre envy = new Monstre("Envy", "image/visuel_monstre/b2-envy.png", "When this dies, the active player must make an additional attack.", 2, 5, 1, 0, 0, 1, 1);
	    return envy;
	}

	/**
	 * Crée un monstre représentant Famine.
	 * Lorsque ce monstre meurt, le joueur actif saute son prochain tour.
	 *
	 * @return un nouvel objet Monstre représentant Famine.
	 */
	public static Monstre famine() {
	    Monstre famine = new Monstre("Famine", "image/visuel_monstre/b2-famine.png", "When this dies, the active player skips their next turn.", 2, 3, 1, 0, 3, 0, 1);
	    return famine;
	}

	/**
	 * Crée un monstre représentant Gemini.
	 * Tant que ce monstre est à 1 HP, il a +1 ATK.
	 *
	 * @return un nouvel objet Monstre représentant Gemini.
	 */
	public static Monstre gemini() {
	    Monstre gemini = new Monstre("Gemini", "image/visuel_monstre/b2-gemini.png", "While this is at 1HP, it has +1ATK.", 3, 4, 1, 5, 0, 0, 1);
	    return gemini;
	}

	/**
	 * Crée un monstre représentant Gluttony.
	 * Chaque fois que ce monstre subit des dégâts de combat sur un lancer d'attaque de 6, inflige 1 dégât au joueur à gauche du joueur actif.
	 *
	 * @return un nouvel objet Monstre représentant Gluttony.
	 */
	public static Monstre glutony() {
	    Monstre glu = new Monstre("Gluttony", "image/visuel_monstre/b2-gluttony.png", "Each time this takes combat damage on an attack roll of 6, deal 1 damage to the player to the active player's left.", 999, 999, 999, 999, 999, 999, 999);
	    return glu;
	}

	/**
	 * Crée un monstre représentant Greed.
	 * Chaque fois que ce monstre inflige des dégâts, chaque joueur perd 4¢.
	 *
	 * @return un nouvel objet Monstre représentant Greed.
	 */
	public static Monstre greed() {
	    Monstre greed = new Monstre("Greed", "image/visuel_monstre/b2-greed.png", "Each time this deals damage, each player loses 4¢.", 3, 4, 1, 9, 0, 0, 1);
	    return greed;
	}

	/**
	 * Crée un monstre représentant Gurdy.
	 * Ce monstre n'a pas d'effet spécial défini.
	 *
	 * @return un nouvel objet Monstre représentant Gurdy.
	 */
	public static Monstre gurdy() {
	    Monstre gurdy = new Monstre("Gurdy", "image/visuel_monstre/b2-gurdy.png", "", 5, 4, 1, 7, 0, 0, 1);
	    return gurdy;
	}

	/**
	 * Crée un monstre représentant Gurdy Jr.
	 * Chaque fois que le joueur attaquant active un objet, il subit 1 dégât.
	 *
	 * @return un nouvel objet Monstre représentant Gurdy Jr.
	 */
	public static Monstre gurdy_jr() {
	    Monstre jr = new Monstre("Gurdy Jr.", "image/visuel_monstre/b2-gurdy_jr.png", "Each time the attacking player activates an item, they take 1 damage.", 2, 5, 1, 0, 0, 1, 1);
	    return jr;
	}

	/**
	 * Crée un monstre représentant Larry Jr.
	 * Tant que ce monstre est à 2 HP ou moins, il a +1 DC.
	 *
	 * @return un nouvel objet Monstre représentant Larry Jr.
	 */
	public static Monstre larry_jr() {
	    Monstre jr = new Monstre("Larry Jr.", "image/visuel_monstre/b2-larry_jr.png", "While this is at 2HP or less, it has +1DC.", 4, 3, 1, 6, 0, 0, 1);
	    return jr;
	}

	/**
	 * Crée un monstre représentant Little Horn.
	 * Ce monstre n'a pas d'effet spécial défini.
	 *
	 * @return un nouvel objet Monstre représentant Little Horn.
	 */
	public static Monstre little_horn() {
	    Monstre horn = new Monstre("Little Horn", "image/visuel_monstre/b2-little_horn.png", "", 2, 6, 1, 0, 2, 0, 2);
	    return horn;
	}

	/**
	 * Crée un monstre représentant Lust.
	 * Chaque fois que ce monstre subit des dégâts de combat, il inflige 1 dégât au joueur attaquant.
	 *
	 * @return un nouvel objet Monstre représentant Lust.
	 */
	public static Monstre lust() {
	    Monstre lust = new Monstre("Lust", "image/visuel_monstre/b2-lust.png", "Each time this takes combat damage, it deals 1 damage to the attacking player.", 2, 4, 1, 0, 2, 0, 1);
	    return lust;
	}

	/**
	 * Crée un monstre représentant Mask Of Infamy.
	 * Tant que ce monstre est à 1 HP, il a +2 DC.
	 *
	 * @return un nouvel objet Monstre représentant Mask Of Infamy.
	 */
	public static Monstre mask_of_infamy() {
	    Monstre mask = new Monstre("Mask Of Infamy", "image/visuel_monstre/b2-mask_of_infamy.png", "While this is at 1HP, it has +2DC.", 4, 4, 1, 0, 0, 1, 1);
	    return mask;
	}

	/**
	 * Crée un monstre représentant Mega Fatty.
	 * Chaque fois que ce monstre inflige des dégâts de combat, il guérit 1 HP.
	 *
	 * @return un nouvel objet Monstre représentant Mega Fatty.
	 */
	public static Monstre mega_fatty() {
	    Monstre mega = new Monstre("Mega Fatty", "image/visuel_monstre/b2-mega_fatty.png", "Each time this deals combat damage, it heals 1HP.", 3, 3, 1, 0, 2, 0, 1);
	    return mega;
	}

	/**
	 * Crée un monstre représentant Monstro.
	 * Ce monstre n'a pas d'effet spécial défini.
	 *
	 * @return un nouvel objet Monstre représentant Monstro.
	 */
	public static Monstre monstro() {
	    Monstre monstro = new Monstre("Monstro", "image/visuel_monstre/b2-monstro.png", "", 4, 4, 1, 6, 0, 0, 1);
	    return monstro;
	}

	/**
	 * Crée un monstre représentant Peep.
	 * Lorsque ce monstre meurt, recherche une carte nommée The Bloat dans le deck de monstres et place-la dans une case de monstre non attaquée, puis mélange le deck de monstres.
	 *
	 * @return un nouvel objet Monstre représentant Peep.
	 */
	public static Monstre peep() {
	    Monstre peep = new Monstre("Peep", "image/visuel_monstre/b2-peep.png", "When this dies, search the monster deck for a card named The Bloat and put it in a monster slot not being attacked, then shuffle the monster deck.", 3, 4, 1, 0, 0, 1, 1);
	    return peep;
	}

	/**
	 * Crée un monstre représentant Pestilence.
	 * Lorsque ce monstre meurt, le joueur actif inflige 2 dégâts répartis comme il le souhaite à n'importe quel nombre de monstres ou de joueurs.
	 *
	 * @return un nouvel objet Monstre représentant Pestilence.
	 */
	public static Monstre pestilence() {
	    Monstre pestilence = new Monstre("Pestilence", "image/visuel_monstre/b2-pestilence.png", "When this dies, the active player deals 2 damage divided as they choose to any number of monsters or players.", 4, 4, 1, 0, 2, 0, 1);
	    return pestilence;
	}

	/**
	 * Crée un monstre représentant Pin.
	 * Ce monstre ne subit aucun dégât de combat sur un lancer d'attaque de 6.
	 *
	 * @return un nouvel objet Monstre représentant Pin.
	 */
	public static Monstre pin() {
	    Monstre pin = new Monstre("Pin", "image/visuel_monstre/b2-pin.png", "This takes no combat damage on attack rolls of 6.", 2, 4, 1, 5, 0, 0, 1);
	    return pin;
	}

	/**
	 * Crée un monstre représentant Pride.
	 * Lorsque qu'une attaque est déclarée contre ce monstre, le joueur actif choisit un joueur. Ce joueur défausse 2 cartes de butin.
	 *
	 * @return un nouvel objet Monstre représentant Pride.
	 */
	public static Monstre pride() {
	    Monstre pride = new Monstre("Pride", "image/visuel_monstre/b2-pride.png", "When an attack is declared on this, the active player chooses a player. That player discards 2 loot cards.", 2, 4, 1, 5, 0, 0, 1);
	    return pride;
	}

	/**
	 * Crée un monstre représentant Rag Man.
	 * Lorsque ce monstre meurt, après avoir gagné des récompenses, le joueur actif lance les dés.
	 * 
	 * Si le résultat est 1 ou 6 : remet ce monstre sur le dessus du deck de monstres.
	 *
	 * @return un nouvel objet Monstre représentant Rag Man.
	 */
	public static Monstre rag_man() {
	    Monstre rag = new Monstre("Rag Man", "image/visuel_monstre/b2-rag_man.png", "When this dies, after gaining rewards, the active player rolls-\r\n1 or 6: Put this on top of the monster deck.", 2, 3, 2, 0, 3, 0, 1);
	    return rag;
	}

	/**
	 * Crée un monstre représentant Scolex.
	 * Chaque fois que ce monstre inflige des dégâts de combat à un joueur, il défausse une carte de butin.
	 *
	 * @return un nouvel objet Monstre représentant Scolex.
	 */
	public static Monstre scolex() {
	    Monstre scolex = new Monstre("Scolex", "image/visuel_monstre/b2-scolex.png", "Each time this deals combat damage to a player, they discard a loot card.", 3, 5, 1, 0, 0, 1, 1);
	    return scolex;
	}

	/**
	 * Crée un monstre représentant Sloth.
	 * Lorsque ce monstre meurt, le joueur qui l'a tué défausse sa main.
	 *
	 * @return un nouvel objet Monstre représentant Sloth.
	 */
	public static Monstre sloth() {
	    Monstre sloth = new Monstre("Sloth", "image/visuel_monstre/b2-sloth.png", "When this dies, the player that killed it discards their hand.", 3, 4, 1, 0, 0, 1, 1);
	    return sloth;
	}

	/**
	 * Crée un monstre représentant The Bloat.
	 * Chaque fois que ce monstre inflige des dégâts de combat, il inflige 1 dégât à chaque joueur non actif.
	 *
	 * @return un nouvel objet Monstre représentant The Bloat.
	 */
	public static Monstre bloat() {
	    Monstre bloat = new Monstre("The Bloat", "image/visuel_monstre/b2-the_bloat.png", "Each time this deals combat damage, it deals 1 damage to each non-active player.", 4, 4, 2, 0, 0, 1, 1);
	    return bloat;
	}

	/**
	 * Crée un monstre représentant The Duke Of Flies.
	 * Chaque fois que ce monstre subirait des dégâts, le joueur actif lance les dés.
	 * 
	 * Si le résultat est 1 : empêche ces dégâts.
	 *
	 * @return un nouvel objet Monstre représentant The Duke Of Flies.
	 */
	public static Monstre duke_of_flies() {
	    Monstre flies = new Monstre("The Duke Of Flies", "image/visuel_monstre/b2-the_duke_of_flies.png", "Each time this would take damage, the active player rolls-\r\n1: Prevent that damage.", 4, 3, 1, 0, 2, 0, 1);
	    return flies;
	}

	/**
	 * Crée un monstre représentant The Haunt.
	 * Chaque autre fois que ce monstre prend des dégâts chaque tour, il gagne +1 DC jusqu'à la fin du tour.
	 *
	 * @return un nouvel objet Monstre représentant The Haunt.
	 */
	public static Monstre haunt() {
	    Monstre haunt = new Monstre("The Haunt", "image/visuel_monstre/b2-the_haunt.png", "Every other time this takes damage each turn, it gains +1DC till end of turn.", 3, 4, 1, 0, 0, 1, 1);
	    return haunt;
	}

	/**
	 * Crée un monstre représentant The Lamb.
	 * Lorsque ce monstre meurt, le joueur actif peut choisir un autre joueur. Ce joueur lui donne une âme qu'il contrôle.
	 *
	 * @return un nouvel objet Monstre représentant The Lamb.
	 */
	public static Monstre lamb() {
	    Monstre lamb = new Monstre("The Lamb", "image/visuel_monstre/b2-the_lamb.png", "When this dies, the active player may choose another player. They give you a soul they control.", 6, 3, 6, 3, 0, 0, 1);
	    return lamb;
	}

	/**
	 * Crée un monstre représentant War.
	 * Chaque fois que ce monstre subit des dégâts, il gagne +1 ATK jusqu'à la fin du tour.
	 *
	 * @return un nouvel objet Monstre représentant War.
	 */
	public static Monstre war() {
	    Monstre war = new Monstre("War", "image/visuel_monstre/b2-war.png", "Each time this takes damage, it gains +1ATK till end of turn.", 3, 3, 1, 8, 0, 0, 1);
	    return war;
	}

	/**
	 * Crée un monstre représentant Wrath.
	 * Lorsque ce monstre meurt, le joueur actif lance les dés.
	 * 
	 * Si le résultat est entre 1 et 3 : chaque joueur subit 1 dégât.
	 * Si le résultat est entre 4 et 6 : chaque joueur subit 2 dégâts.
	 *
	 * @return un nouvel objet Monstre représentant Wrath.
	 */
	public static Monstre wrath() {
	    Monstre wrath = new Monstre("Wrath", "image/visuel_monstre/b2-wrath.png", "When this dies, the active player rolls-\r\n1-3: Each player takes 1 damage.\r\n4-6: Each player takes 2 damage.", 3, 3, 1, 6, 0, 0, 1);
	    return wrath;
	}

	/**
	 * Crée un monstre représentant Mom!.
	 * Les dégâts de combat que ce monstre inflige sont doublés sur des lancers d'attaque de 1.
	 * Lorsque ce monstre meurt, il augmente le nombre de cases de monstres de 1.
	 *
	 * @return un nouvel objet Monstre représentant Mom!.
	 */
	public static Monstre mom() {
	    Monstre mom = new Monstre("Mom!", "image/visuel_monstre/b2-mom.png", "Combat damage this deals is doubled on attack rolls of 1.\r\nWhen this dies, expand monsters slots by 1.", 5, 4, 1, 0, 0, 1, 2);
	    return mom;
	}

	/**
	 * Crée un monstre représentant Satan!.
	 * Chaque fois que le joueur attaquant lance un dé d'attaque de 6, il choisit un joueur vivant. Ce joueur meurt.
	 *
	 * @return un nouvel objet Monstre représentant Satan!.
	 */
	public static Monstre satan() {
	    Monstre satan = new Monstre("Satan!", "image/visuel_monstre/b2-satan.png", "Each time the attacking player rolls an attack roll of 6, they choose a living player. That player dies.", 6, 4, 2, 0, 0, 2, 2);
	    return satan;
	}


	

	
}
