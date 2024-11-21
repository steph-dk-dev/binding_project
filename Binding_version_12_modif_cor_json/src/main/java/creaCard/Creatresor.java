package creaCard;
import cartes.*;

public class Creatresor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	// Crée et retourne une carte "Belly Button" avec des effets spécifiques et une image associée.
	public static Tresor belly_button() {
	    Tresor belly = new Tresor("Belly Button", "image/visuel_tresor/b2-belly_button.png", 
	        "You may play an additional loot card on your turn.\r\n" +
	        "Each time you take damage, you may recharge your character.", false);
	    return belly;
	}

	// Crée et retourne une carte "Bob's Brain" avec des effets aléatoires lors des attaques.
	public static Tresor bob_brain() {
	    Tresor bob_brain = new Tresor("Bob’s Brain", "image/visuel_tresor/b2-bobs_brain.png", 
	        "Each time you declare an attack, roll-\r\n" +
	        "1-2: Deal 1 damage to a monster.\r\n" +
	        "3-4: Deal 1 damage to a player.\r\n" +
	        "5-6: Take 1 damage.", false);
	    return bob_brain;
	}

	// Crée et retourne une carte "Breakfast" qui ajoute 1 point de vie (HP).
	public static Tresor breakfast() {
	    Tresor breakfast = new Tresor("Breakfast", "image/visuel_tresor/b2-breakfast.png", "+1 HP", false);
	    return breakfast;
	}

	// Crée et retourne une carte "Brimstone" qui ajoute 1 ATK et inflige des dégâts aux autres joueurs.
	public static Tresor brimstone() {
	    Tresor brimstone = new Tresor("Brimstone", "image/visuel_tresor/b2-brimstone.png", 
	        "+1 ATK\r\n" + 
	        "Each time you deal combat damage to a monster, deal 1 damage to another player", false);
	    return brimstone;
	}

	// Crée et retourne une carte "Bum-Bo!" avec des effets de progression basés sur les gains de ¢.
	public static Tresor bumbo() {
	    Tresor bumbo = new Tresor("Bum-Bo!", "image/visuel_tresor/b2-bum_bo.png", 
	        "If you would gain any amount of ¢, this levels up by that much instead.\r\n" +
	        "LV1 Effect: You have +2 to your first attack roll each turn.\r\n" +
	        "LV10 Effect: You have +1ATK.\r\n" +
	        "LV25 Effect: You may attack any number of times on your turn.", false);
	    return bumbo;
	}

	// Crée et retourne une carte "Cambion Conception" qui gagne des compteurs en fonction des dégâts subis.
	public static Tresor cambion() {
	    Tresor cambion = new Tresor("Cambion Conception", "image/visuel_tresor/b2-cambion_conception.png", 
	        "Each time you take damage, put counters on this equal to the amount of damage taken. " +
	        "Then, if this has 6+ counters, remove 6 counters from this and gain +1 treasure.", false);
	    return cambion;
	}

	// Crée et retourne une carte "Champion Belt" qui améliore les jets d'attaque.
	public static Tresor champion() {
	    Tresor champion = new Tresor("Champion Belt", "image/visuel_tresor/b2-champion_belt.png", 
	        "You have +1ATK for your first attack roll each turn.\r\n" +
	        "You may attack an additional time on your turn", false);
	    return champion;
	}

	// Crée et retourne une carte "Charged Baby" qui permet de recharger un objet à chaque fois qu'un ❷ est lancé.
	public static Tresor charged_baby() {
	    Tresor charged = new Tresor("Charged Baby", "image/visuel_tresor/b2-charged_baby.png", 
	        "Each time a player rolls a ❷, you may recharge an item.", false);
	    return charged;
	}

	// Crée et retourne une carte "Cheese Grater" qui permet de manipuler les cartes de tout deck à chaque ❻ lancé.
	public static Tresor cheese_grater() {
	    Tresor cheese = new Tresor("Cheese Grater", "image/visuel_tresor/b2-cheese_grater.png", 
	        "Each time a player rolls a ❻, reveal the top card of any deck. Put it back or put it into discard.", false);
	    return cheese;
	}

	// Crée et retourne une carte "Curse of the Tower" qui inflige des dégâts aléatoires à d'autres joueurs ou à des monstres après avoir pris des dégâts.
	public static Tresor curse_tower() {
	    Tresor curse = new Tresor("Curse Of The Tower", "image/visuel_tresor/b2-curse_of_the_tower.png", 
	        "Each time you take damage, roll-\r\n" +
	        "1-3: Each other player takes 1 damage.\r\n" +
	        "4-6: Deal 1 damage to a monster.", false);
	    return curse;
	}

	// Crée et retourne une carte "Dad's Lost Coin" qui permet de forcer un joueur à relancer un ❶.
	public static Tresor dad_lost_coin() {
	    Tresor dad = new Tresor("Dad’s Lost Coin", "image/visuel_tresor/b2-dads_lost_coin.png", 
	        "Each time a player would roll a ❶, you may force that player to reroll it.", false);
	    return dad;
	}

	// Crée et retourne une carte "Dark Bum" avec des effets aléatoires en début de tour.
	public static Tresor dark_bum() {
	    Tresor dark = new Tresor("Dark Bum", "image/visuel_tresor/b2-dark_bum.png", 
	        "At the start of your turn, roll-\r\n" +
	        "1-2: Gain 3¢.\r\n" +
	        "3-4: Loot 1.\r\n" +
	        "5-6: Take 1 damage.", false);
	    return dark;
	}

	// Crée et retourne une carte "Dead Bird" qui permet de voler une carte à un autre joueur lorsqu'un ❸ est lancé.
	public static Tresor dead_bird() {
	    Tresor bird = new Tresor("Dead Bird", "image/visuel_tresor/b2-dead_bird.png", 
	        "Each time a player rolls a ❸, you may look at their hand and steal a loot card from them.", false);
	    return bird;
	}

	// Crée et retourne une carte "Dinner" qui ajoute 1 point de vie (HP).
	public static Tresor dinner() {
	    Tresor dinner = new Tresor("Dinner", "image/visuel_tresor/b2-dinner.png", "+1 HP", false);
	    return dinner;
	}

	// Crée et retourne une carte "Dry Baby" qui réduit les dégâts reçus à 1.
	public static Tresor dry_baby() {
	    Tresor baby = new Tresor("Dry Baby", "image/visuel_tresor/b2-dry_baby.png", 
	        "Damage you would take is reduced to 1", false);
	    return baby;
	}

	// Crée et retourne une carte "Eden's Blessing" qui accorde 6¢ si le joueur n'en a pas à la fin de son tour.
	public static Tresor eden_blessing() {
	    Tresor eden = new Tresor("Eden’s Blessing", "image/visuel_tresor/b2-edens_blessing.png", 
	        "At the end of your turn, if you have 0¢, gain 6¢.", false);
	    return eden;
	}

	// Crée et retourne une carte "Empty Vessel" qui octroie des bonus lorsqu'aucune carte loot n'est en main.
	public static Tresor empty_vessel() {
	    Tresor empty = new Tresor("Empty Vessel", "image/visuel_tresor/b2-empty_vessel.png", 
	        "When you have 0 loot cards in your hand, you have +1ATK.\r\n" +
	        "While you have 0¢, you have +1 to your attack rolls.", false);
	    return empty;
	}

	// Crée et retourne une carte "Eye of Greed" qui permet de gagner 3¢ à chaque fois qu'un ❺ est lancé.
	public static Tresor eye_of_greed() {
	    Tresor eye = new Tresor("Eye Of Greed", "image/visuel_tresor/b2-eye_of_greed.png", 
	        "Each time a player rolls a ❺, gain 3¢.", false);
	    return eye;
	}

	// Crée et retourne une carte "Fanny Pack" qui permet de piocher une carte à chaque fois que des dégâts sont pris.
	public static Tresor fanny_pack() {
	    Tresor fanny = new Tresor("Fanny Pack", "image/visuel_tresor/b2-fanny_pack.png", 
	        "Each time you take damage, loot 1.", false);
	    return fanny;
	}
	// Méthode pour créer et retourner un objet Tresor pour "The Polaroid"
	public static Tresor polaroid() {
	    Tresor pola = new Tresor("The Polaroid", "image/visuel_tresor/b2-the_polaroid.png", 
	        "At the end of your turn, if you have 0 loot cards in your hand, loot 2.", false);
	    return pola; // Retourne le trésor "The Polaroid"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The Relic"
	public static Tresor relic() {
	    Tresor relic = new Tresor("The Relic", "image/visuel_tresor/b2-the_relic.png", 
	        "Each time a player rolls a ❶, loot 1.", false);
	    return relic; // Retourne le trésor "The Relic"
	}

	// Méthode pour créer et retourner un objet Tresor pour "There’s Options"
	public static Tresor theres_options() {
	    Tresor option = new Tresor("There’s Options", "image/visuel_tresor/b2-theres_options.png", 
	        "You may look at the top card of the treasure deck at any time on your turn.\r\n"
	        + "You may purchase an additional time on your turn.", false);
	    return option; // Retourne le trésor "There’s Options"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Trinity Shield"
	public static Tresor trinity_shield() {
	    Tresor shield = new Tresor("Trinity Shield", "image/visuel_tresor/b2-trinity_shield.png", 
	        "Other players can't play loot cards or activate items on your turn.", false);
	    return shield; // Retourne le trésor "Trinity Shield"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Blank Card"
	public static Tresor blank_card() {
	    Tresor blank = new Tresor("Blank Card", "image/visuel_tresor/b2-blank_card.png", 
	        "Tap EffectThe next time you play a non-trinket, non-ambush loot card this turn, copy it.", false);
	    return blank; // Retourne le trésor "Blank Card"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Book Of Sin"
	public static Tresor book_of_sin() {
	    Tresor book = new Tresor("Book Of Sin", "image/visuel_tresor/b2-book_of_sin.png", 
	        "Tap EffectRoll-\r\n" 
	        + "1-2: Gain 1¢.\r\n" 
	        + "3-4: Loot 1.\r\n" 
	        + "5-6: Gain +1HP till end of turn.", false);
	    return book; // Retourne le trésor "Book Of Sin"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Boomerang"
	public static Tresor boomerang() {
	    Tresor boom = new Tresor("Boomerang", "image/visuel_tresor/b2-boomerang.png", 
	        "Tap Effect Choose another player. Steal a loot card from them at random.", false);
	    return boom; // Retourne le trésor "Boomerang"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Box!"
	public static Tresor box() {
	    Tresor box = new Tresor("Box!", "image/visuel_tresor/b2-box.png", 
	        "Tap EffectDestroy this. If you do, you may play any number of additional loot cards till end of turn.\r\n", false);
	    return box; // Retourne le trésor "Box!"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Bum Friend"
	public static Tresor bum_friend() {
	    Tresor friend = new Tresor("Bum Friend", "image/visuel_tresor/b2-bum_friend.png", 
	        "Tap Effect Loot 1, then put a loot card from your hand on top of the loot deck.", false);
	    return friend; // Retourne le trésor "Bum Friend"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Chaos"
	public static Tresor chaos() {
	    Tresor chaos = new Tresor("Chaos", "image/visuel_tresor/b2-chaos.png", 
	        "Tap Effect Each player gives their hand to the player to their left.", false);
	    return chaos; // Retourne le trésor "Chaos"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Chaos Card"
	public static Tresor chaos_card() {
	    Tresor card = new Tresor("Chaos Card", "image/visuel_tresor/b2-chaos_card.png", 
	        "Tap Effect Destroy this. If you do, choose one-\r\n"
	        + "Kill a player or monster.\r\n" 
	        + "Destroy an item or soul.", false);
	    return card; // Retourne le trésor "Chaos Card"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Compost"
	public static Tresor compost() {
	    Tresor compost = new Tresor("Compost", "image/visuel_tresor/b2-compost.png", 
	        "Tap Effect The next time a player would loot, they loot from the top of the loot discard instead.", false);
	    return compost; // Retourne le trésor "Compost"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Crystal Ball"
	public static Tresor crystal_ball() {
	    Tresor ball = new Tresor("Crystal Ball", "image/visuel_tresor/b2-crystal_ball.png", 
	        "Tap Effect Before a dice is rolled, choose a number. If the next roll is that number, loot 3.", false);
	    return ball; // Retourne le trésor "Crystal Ball"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Decoy"
	public static Tresor decoy() {
	    Tresor decoy = new Tresor("Decoy", "image/visuel_tresor/b2-decoy.png", 
	        "Tap Effect Swap this with a non-eternal item another player controls.", false);
	    return decoy; // Retourne le trésor "Decoy"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Diplopia"
	public static Tresor diplopia() {
	    Tresor diplopia = new Tresor("Diplopia", "image/visuel_tresor/b2-diplopia.png", 
	        "Tap Effect Choose a non-eternal passive item. This becomes a copy of that item till end of turn.", false);
	    return diplopia; // Retourne le trésor "Diplopia"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Flush!"
	public static Tresor flush() {
	    Tresor flush = new Tresor("Flush!", "image/visuel_tresor/b2-flush.png", 
	        "Tap Effect Choose one-\r\n" 
	        + "Put each monster not being attacked on the bottom of the monster deck.\r\n" 
	        + "Put each shop item on the bottom of the treasure deck.", false);
	    return flush; // Retourne le trésor "Flush!"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Glass Cannon"
	public static Tresor glass_cannon() {
	    Tresor cannon = new Tresor("Glass Cannon", "image/visuel_tresor/b2-glass_cannon.png", 
	        "Tap EffectDestroy another item, then roll-\r\n" 
	        + "\r\n" 
	        + "1-5: Destroy this and loot 2.\r\n" 
	        + "6: Recharge this.", false);
	    return cannon; // Retourne le trésor "Glass Cannon"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Godhead"
	public static Tresor godhead() {
	    Tresor god = new Tresor("Godhead", "image/visuel_tresor/b2-godhead.png", 
	        "Tap Effect Change the result of a dice roll to a 1 or 6.", false);
	    return god; // Retourne le trésor "Godhead"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Guppy’s Head"
	public static Tresor guppys_head() {
	    Tresor head = new Tresor("Guppy’s Head", "/Binding/src/main/webapp/image/visuel_tresor/b2-guppys_head.png", 
	        "Tap Effect Choose a player. That player gives you a loot card.\r\n", false);
	    return head; // Retourne le trésor "Guppy’s Head"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Guppy’s Paw"
	public static Tresor guppys_paw() {
	    Tresor paw = new Tresor("Guppy’s Paw", "image/visuel_tresor/b2-guppys_paw.png", 
	        "Tap EffectPay 1HP. If you do, choose a player. Prevent the next instance of up to 2 damage they would take this turn.", false);
	    return paw; // Retourne le trésor "Guppy’s Paw"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Host Hat"
	public static Tresor host_hat() {
	    Tresor hat = new Tresor("Host Hat", "image/visuel_tresor/b2-host_hat.png", 
	        "Tap Effect Prevent the next 1 damage you would take this turn. When you prevent damage this way, deal 1 damage to another player.", false);
	    return hat; // Retourne le trésor "Host Hat"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Jawbone"
	public static Tresor jawbone() {
	    Tresor jaw = new Tresor("Jawbone", "image/visuel_tresor/b2-jawbone.png", 
	        "Tap Effect Steal 3¢ from a player.", false);
	    return jaw; // Retourne le trésor "Jawbone"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Lucky Foot"
	public static Tresor lucky_foot() {
	    Tresor foot = new Tresor("Lucky Foot", "image/visuel_tresor/b2-lucky_foot.png", 
	        "Tap Effect Add up to 2 to a non-attack roll.", false);
	    return foot; // Retourne le trésor "Lucky Foot"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Mini Mush"
	public static Tresor mini_mush() {
	    Tresor mush = new Tresor("Mini Mush", "image/visuel_tresor/b2-mini_mush.png", 
	        "Tap Effect Subtract up to 2 from a roll.", false);
	    return mush; // Retourne le trésor "Mini Mush"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Modeling Clay"
	public static Tresor modeling_clay() {
	    Tresor clay = new Tresor("Modeling Clay", "image/visuel_tresor/b2-modeling_clay.png", 
	        "Tap Effect Choose a non-eternal item. This becomes a copy of that item.\r\n" 
	        + "(This change is indefinite.)", false);
	    return clay; // Retourne le trésor "Modeling Clay"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Mom’s Bra"
	public static Tresor moms_bra() {
	    Tresor bra = new Tresor("Mom’s Bra", "image/visuel_tresor/b2-moms_bra.png", 
	        "Tap Effect Choose a monster or player. The next instance of damage they take this turn is reduced to 1.", false);
	    return bra; // Retourne le trésor "Mom’s Bra"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Mom’s Shovel"
	public static Tresor moms_shovel() {
	    Tresor shovel = new Tresor("Mom’s Shovel", "image/visuel_tresor/b2-moms_shovel.png", 
	        "This enters play deactivated.\r\n" 
	        + "Tap Effect Destroy this. If you do, steal a soul from another player.", false);
	    shovel.setEtats(false); // Définir l'état activé du trésor à "false"
	    return shovel; // Retourne le trésor "Mom’s Shovel"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Monster Manual"
	public static Tresor Monster_manual() {
	    Tresor manual = new Tresor("Monster Manual", "image/visuel_tresor/b2-monster_manual.png", 
	        "Tap Effect Choose a monster. The active player must attack that monster this turn if able.", false);
	    return manual; // Retourne le trésor "Monster Manual"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Mr. Boom"
	public static Tresor Mr_Boom() {
	    Tresor boom = new Tresor("Mr. Boom", "image/visuel_tresor/b2-mr_boom.png", 
	        "Tap Effect Deal 1 damage to a monster.", false);
	    return boom; // Retourne le trésor "Mr. Boom"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Mystery Sack"
	public static Tresor Mystery_Sack() {
	    Tresor sack = new Tresor("Mystery Sack", "image/visuel_tresor/b2-mystery_sack.png", 
	        "Tap Effect Roll-\r\n" 
	        + "1-2: Loot 1.\r\n" 
	        + "3-4: Gain 4¢.", false);
	    return sack; // Retourne le trésor "Mystery Sack"
	}

	// Méthode pour créer et retourner un objet Tresor pour "No!"
	public static Tresor no() {
	    Tresor no = new Tresor("No!", "image/visuel_tresor/b2-no.png", 
	        "Tap Effect Cancel the ↷ or $ ability of an item.", false);
	    return no; // Retourne le trésor "No!"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Pandora’s Box"
	public static Tresor Pandoras_Box() {
	    Tresor box = new Tresor("Pandora’s Box", "image/visuel_tresor/b2-pandoras_box.png", 
	        "Tap Effect Destroy this. If you do, roll-\r\n" 
	        + "1: Gain 1¢.\r\n" 
	        + "2: Gain 6¢.\r\n" 
	        + "3: Kill a monster.\r\n" 
	        + "4: Loot 3.\r\n" 
	        + "5: Gain 9¢.\r\n" 
	        + "6: This becomes a soul. Gain it.", false);
	    return box; // Retourne le trésor "Pandora’s Box"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Placebo"
	public static Tresor placebo() {
	    Tresor placebo = new Tresor("Placebo", "image/visuel_tresor/b2-placebo.png", 
	        "Tap Effect This copies a ↷ ability of a non-eternal item.", false);
	    return placebo; // Retourne le trésor "Placebo"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Potato Peeler"
	public static Tresor Potato_Peeler() {
	    Tresor potato = new Tresor("Potato Peeler", "image/visuel_tresor/b2-potato_peeler.png", 
	        "Tap Effect Put the top card of each deck into discard.", false);
	    return potato; // Retourne le trésor "Potato Peeler"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Razor Blade"
	public static Tresor razor_blade() {
	    Tresor blade = new Tresor("Razor Blade", "", 
	        "Tap Effect Deal 1 damage to a player.", false);
	    return blade; // Retourne le trésor "Razor Blade"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Remote Detonator"
	public static Tresor remote_detonator() {
	    Tresor remote = new Tresor("Remote Detonator", "image/visuel_tresor/b2-remote_detonator.png", 
	        "Tap Effect Each player votes on an item in play. Destroy the item with the most votes. If there is a tie, nothing happens.", false);
	    return remote; // Retourne le trésor "Remote Detonator"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Sack Head"
	public static Tresor sack_head() {
	    Tresor sack = new Tresor("Sack Head", "image/visuel_tresor/b2-sack_head.png", 
	        "Tap Effect Look at the top card of a deck. You may put that card on the bottom of that deck.", false);
	    return sack; // Retourne le trésor "Sack Head"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Sack Of Pennies"
	public static Tresor Sack_Of_Pennies() {
	    Tresor sack = new Tresor("Sack Of Pennies", "image/visuel_tresor/b2-sack_of_pennies.png", 
	        "Tap Effect Gain 1¢.\r\nEach time a player rolls a ❶, you may recharge this.", false);
	    return sack; // Retourne le trésor "Sack Of Pennies"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Spoon Bender"
	public static Tresor spoon_bender() {
	    Tresor spoon = new Tresor("Spoon Bender", "image/visuel_tresor/b2-spoon_bender.png", 
	        "Tap Effect Add 1 to a roll.", false);
	    return spoon; // Retourne le trésor "Spoon Bender"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Tech X"
	public static Tresor tech_x() {
	    Tresor x = new Tresor("Tech X", "image/visuel_tresor/b2-tech_x.png", 
	        "Tap Effect Put a counter on this.\r\nPaid Effect Remove 3 counters from this:\r\nKill a player or monster.", false);
	    return x; // Retourne le trésor "Tech X"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The Battery"
	public static Tresor battery() {
	    Tresor battery = new Tresor("The Battery", "image/visuel_tresor/b2-the_battery.png", 
	        "Tap Effect Recharge another item.", false);
	    return battery; // Retourne le trésor "The Battery"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The D100"
	public static Tresor d100() {
	    Tresor d100 = new Tresor("The D100", "image/visuel_tresor/b2-the_d100.png", 
	        "Tap Effect Roll-\r\n1: Loot 1.\r\n2: Loot 2.\r\n3: Gain 3¢.\r\n4: Gain 4¢.\r\n5: Gain +1HP till end of turn.\r\n6: Gain +1ATK till end of turn.", false);
	    return d100; // Retourne le trésor "The D100"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The D20"
	public static Tresor d20() {
	    Tresor d20 = new Tresor("The D20", "image/visuel_tresor/b2-the_d20.png", 
	        "Tap Effect Reroll an item.\r\n(Destroy that item and replace it with the top card of the treasure deck.)", false);
	    return d20; // Retourne le trésor "The D20"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The D4"
	public static Tresor d4() {
	    Tresor d4 = new Tresor("The D4", "image/visuel_tresor/b2-the_d4.png", 
	        "Tap Effect Destroy this. If you do, choose a player. They reroll each item they control.", false);
	    return d4; // Retourne le trésor "The D4"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The Shovel"
	public static Tresor shovel() {
	    Tresor shovel = new Tresor("The Shovel", "image/visuel_tresor/b2-the_shovel.png", 
	        "Tap Effect Put a non-event monster card in discard on top of the monster deck.", false);
	    return shovel; // Retourne le trésor "The Shovel"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Two Of Clubs"
	public static Tresor two_of_club() {
	    Tresor club = new Tresor("Two Of Clubs", "image/visuel_tresor/b2-two_of_clubs.png", 
	        "Tap Effect Choose a player. Till end of turn, if they would loot any number of loot cards, they loot double that number instead.", false);
	    return club; // Retourne le trésor "Two Of Clubs"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Battery Bum"
	public static Tresor battery_bum() {
	    Tresor bum = new Tresor("Battery Bum", "image/visuel_tresor/b2-battery_bum.png", 
	        "Paid Effect Pay 4¢:\r\nRecharge an item.", false);
	    return bum; // Retourne le trésor "Battery Bum"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Contract From Below"
	public static Tresor contract_from_below() {
	    Tresor below = new Tresor("Contract From Below", "image/visuel_tresor/b2-contract_from_below.png", 
	        "Paid Effect Destroy 2 items you control:\r\nSteal a non-eternal item from a player.", false);
	    return below; // Retourne le trésor "Contract From Below"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Donation Machine"
	public static Tresor donation_machine() {
	    Tresor machine = new Tresor("Donation Machine", "image/visuel_tresor/b2-donation_machine.png", 
	        "Paid Effect Give another non-eternal item you control to another player:\r\nGain 8¢.", false);
	    return machine; // Retourne le trésor "Donation Machine"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Golden Razor Blade"
	public static Tresor golden_razor_blade() {
	    Tresor golden = new Tresor("Golden Razor Blade", "image/visuel_tresor/b2-golden_razor_blade.png", 
	        "Paid Effect Pay 5¢:\r\nDeal 1 damage to a monster or player.", false);
	    return golden; // Retourne le trésor "Golden Razor Blade"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Pay To Play"
	public static Tresor pay_to_play() {
	    Tresor pay = new Tresor("Pay To Play", "image/visuel_tresor/b2-pay_to_play.png", 
	        "Paid Effect Pay 10¢:\r\nSteal a non-eternal item a player controls.", false);
	    return pay; // Retourne le trésor "Pay To Play"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Portable Slot Machine"
	public static Tresor portable_slot_machine() {
	    Tresor slot = new Tresor("Portable Slot Machine", "image/visuel_tresor/b2-portable_slot_machine.png", 
	        "Paid Effect Pay 3¢: Roll-\r\n1-2: Loot 1.\r\n3-4: Gain 4¢.", false);
	    return slot; // Retourne le trésor "Portable Slot Machine"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Smelter"
	public static Tresor smelter() {
	    Tresor smelter = new Tresor("Smelter", "image/visuel_tresor/b2-smelter.png", 
	        "Paid Effect Discard a loot card:\r\nGain 3¢.", false);
	    return smelter; // Retourne le trésor "smelter"
	}

	// Méthode pour créer et retourner un objet Tresor pour "The Poop"
	public static Tresor poop() {
	    Tresor poop = new Tresor("The Poop", "image/visuel_tresor/b2-the_poop.png", 
	        "Each time you take damage, put a counter on this.\r\n" + 
	        "Paid Effect Remove a counter from this:\r\n" + 
	        "Prevent the next 1 damage you would take this turn.", false);
	    return poop; // Retourne le trésor "The Poop"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Baby Haunt"
	public static Tresor baby_haunt() {
	    Tresor haunt = new Tresor("Baby Haunt", "image/visuel_tresor/b2-baby_haunt.png", 
	        "Curse Effect Monsters have +1DC on your turn.\r\n" + 
	        "When you die, before paying penalties, give this to another player.", false);
	    return haunt; // Retourne le trésor "Baby Haunt"
	}

	// Méthode pour créer et retourner un objet Tresor pour "Daddy Haunt"
	public static Tresor daddy_haunt() {
	    Tresor daddy = new Tresor("Daddy Haunt", "image/visuel_tresor/b2-daddy_haunt.png", 
	        "Curse Effect If you would take any amount of damage, take that much damage +1 instead.\r\n" + 
	        "When you die, before paying penalties, give this to another player.", false);
	    return daddy; // Retourne le trésor "Daddy Haunt"
	}

}
