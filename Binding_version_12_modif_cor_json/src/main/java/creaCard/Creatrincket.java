package creaCard;

import cartes.Trincket;

public class Creatrincket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// Méthode pour créer et retourner un objet Trincket pour "Bloody Penny"
	public static Trincket bloody_penny() {
	    Trincket bloody = new Trincket("Bloody Penny", "image/trincket/b2-bloody_penny.png", 
	        "Each time a player dies, before paying penalties, loot 1.");
	    return bloody; // Retourne l'objet "Bloody Penny"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Broken Ankh"
	public static Trincket broken_ankh() {
	    Trincket ankh = new Trincket("Broken Ankh", "image/trincket/b2-broken_ankh.png", 
	        "When you would die, roll-\r\n" + 
	        "6: Prevent death. If it's your turn, cancel everything that hasn't resolved and end it.");
	    return ankh; // Retourne l'objet "Broken Ankh"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Cain’s Eye"
	public static Trincket cains_eye() {
	    Trincket eye = new Trincket("Cain’s Eye", "image/trincket/b2-cains_eye.png", 
	        "At the start of your turn, look at the top card of the loot deck. You may put it on the bottom.");
	    return eye; // Retourne l'objet "Cain’s Eye"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Counterfeit Penny"
	public static Trincket counterfeit_penny() {
	    Trincket penny = new Trincket("Counterfeit Penny", "image/trincket/b2-counterfeit_penny.png", 
	        "If you would gain any number of ¢, gain that much +1¢ instead.");
	    return penny; // Retourne l'objet "Counterfeit Penny"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Curved Horn"
	public static Trincket curved_horn() {
	    Trincket horn = new Trincket("Curved Horn", "image/trincket/b2-curved_horn.png", 
	        "Gain +1ATK for your first attack roll each turn.");
	    return horn; // Retourne l'objet "Curved Horn"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Golden Horseshoe"
	public static Trincket golden_horseshoe() {
	    Trincket golden = new Trincket("Golden Horseshoe", "image/trincket/b2-golden_horseshoe.png", 
	        "At the start of your turn, look at the top card of the treasure deck, you may put it on the bottom.");
	    return golden; // Retourne l'objet "Golden Horseshoe"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Guppy’s Hairball"
	public static Trincket guppys_hair_ball() {
	    Trincket hair = new Trincket("Guppy’s Hairball", "image/trincket/b2-guppys_hairball.png", 
	        "Each time you would take damage, roll-\r\n" + 
	        "6: Prevent 1 of that damage.");
	    return hair; // Retourne l'objet "Guppy’s Hairball"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Purple Heart"
	public static Trincket purple_heart() {
	    Trincket purple = new Trincket("Purple Heart", "image/trincket/b2-purple_heart.png", 
	        "At the start of your turn, look at the top card of the monster deck. You may put it on the bottom.");
	    return purple; // Retourne l'objet "Purple Heart"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Swallowed Penny"
	public static Trincket swallowed_penny() {
	    Trincket penny = new Trincket("Swallowed Penny", "image/trincket/b2-swallowed_penny.png", 
	        "Each time you take damage, gain 1¢.");
	    return penny; // Retourne l'objet "Swallowed Penny"
	}

	// Méthode pour créer et retourner un objet Trincket pour "Lost Soul"
	public static Trincket lost_soul() {
	    Trincket soul = new Trincket("Lost Soul", "", 
	        "When this enters play, it becomes a soul.\r\n" + 
	        "(It's no longer an item.)");
	    soul.setSoul(1); // Définit cet objet comme une âme (soul)
	    return soul; // Retourne l'objet "Lost Soul"
	}

}
