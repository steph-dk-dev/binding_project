package creaCard;
import cartes.Common;

public class Creacommon {

	public Creacommon() {
		// TODO Auto-generated constructor stub
	}

	// Méthode pour créer et retourner un objet Common pour "A Penny!"
	public static Common penny() {
	    Common penny = new Common("A Penny!", "image/visuel_common/b2-a_penny_6.png", "Gain 1¢.");
	    return penny; // Retourne l'objet "A Penny!"
	}

	// Méthode pour créer et retourner un objet Common pour "2 Cents!"
	public static Common cents2() {
	    Common cents2 = new Common("2 Cents!", "image/visuel_common/b2-two_cents.png", "Gain 2¢.");
	    return cents2; // Retourne l'objet "2 Cents!"
	}

	// Méthode pour créer et retourner un objet Common pour "3 Cents!"
	public static Common cents3() {
	    Common cents3 = new Common("3 Cents!", "image/visuel_common/b2-three_cents.png", "Gain 3¢.");
	    return cents3; // Retourne l'objet "3 Cents!"
	}

	// Méthode pour créer et retourner un objet Common pour "4 Cents!"
	public static Common cents4() {
	    Common cents4 = new Common("4 Cents!", "image/visuel_common/b2-four_cents.png", "Gain 4¢.");
	    return cents4; // Retourne l'objet "4 Cents!"
	}

	// Méthode pour créer et retourner un objet Common pour "A Nickel!"
	public static Common nickel() {
	    Common nickel = new Common("A Nickel!", "image/visuel_common/b2-a_nickel.png", "Gain 5¢.");
	    return nickel; // Retourne l'objet "A Nickel!"
	}

	// Méthode pour créer et retourner un objet Common pour "A Dime!"
	public static Common dime() {
	    Common dime = new Common("A Dime!!", "image/visuel_common/b2-a_dime.png", "Gain 10¢.");
	    return dime; // Retourne l'objet "A Dime!"
	}

	// Méthode pour créer et retourner un objet Common pour "Lil Battery"
	public static Common lil_battery() {
	    Common lil = new Common("Lil Battery", "image/visuel_common/b2-lil_battery.png", "Recharge an item.");
	    return lil; // Retourne l'objet "Lil Battery"
	}

	// Méthode pour créer et retourner un objet Common pour "Mega Battery"
	public static Common mega_battery() {
	    Common mega = new Common("Mega Battery", "image/visuel_common/b2-mega_battery.png", "Mega Battery");
	    return mega; // Retourne l'objet "Mega Battery"
	}

	// Méthode pour créer et retourner un objet Common pour "Bomb!"
	public static Common bomb() {
	    Common bomb = new Common("Bomb!", "image/visuel_common/b2-bomb.png", "Deal 1 damage to a Monster or Player.");
	    return bomb; // Retourne l'objet "Bomb!"
	}

	// Méthode pour créer et retourner un objet Common pour "Gold Bomb!!"
	public static Common gold_bomb() {
	    Common gold = new Common("Gold Bomb!!", "image/visuel_common/b2-gold_bomb.png", "Deal 3 damage to a monster or player.");
	    return gold; // Retourne l'objet "Gold Bomb!!"
	}

	// Méthode pour créer et retourner un objet Common pour "Butter Bean!"
	public static Common butter_bean() {
	    Common butter = new Common("Butter Bean!", "image/visuel_common/b2-butter_bean.png", "Cancel the ↷ or $ ability of an item or a loot being played.");
	    return butter; // Retourne l'objet "Butter Bean!"
	}

	// Méthode pour créer et retourner un objet Common pour "Dice Shard"
	public static Common dice_shard() {
	    Common shard = new Common("Dice Shard", "image/visuel_common/b2-dice_shard_3.png", "Dice Shard");
	    return shard; // Retourne l'objet "Dice Shard"
	}

	// Méthode pour créer et retourner un objet Common pour "Pills!" avec un effet de gain
	public static Common pill2() {
	    Common pill = new Common("Pills!", "image/visuel_common/b2-pills_2.png", 
	        "Roll-\r\n" + 
	        "1-2: Gain 4¢.\r\n" + 
	        "3-4: Gain 7¢.\r\n" + 
	        "5-6: Lose 4¢.");
	    return pill; // Retourne l'objet "Pills!" avec un effet de gain
	}

	// Méthode pour créer et retourner un objet Common pour "Pills!" avec un effet d'attaque et de vie
	public static Common pill3() {
	    Common pill = new Common("Pills!", "image/visuel_common/b2-pills_3.png", 
	        "Roll-\r\n" + 
	        "1-2: You gain +1ATK till the end of turn.\r\n" + 
	        "3-4: You gain +1HP till the end of turn.\r\n" + 
	        "5-6: Take 1 damage.");
	    return pill; // Retourne l'objet "Pills!" avec un effet d'attaque et de vie
	}

	// Méthode pour créer et retourner un objet Common pour "Pills!" avec un effet de loot
	public static Common pill1() {
	    Common pill = new Common("Pills!", "image/visuel_common/b2-pills.png", 
	        "Roll-\r\n" + 
	        "1-2: Loot 1.\r\n" + 
	        "3-4: Loot 3.\r\n" + 
	        "5-6: Discard 1 loot card.");
	    return pill; // Retourne l'objet "Pills!" avec un effet de loot
	}

	// Méthode pour créer et retourner un objet Common pour "Soul Heart"
	public static Common soul_heart() {
	    Common heart = new Common("Soul Heart", "image/visuel_common/b2-soul_heart_2.png", "Choose a player. Prevent the next 1 damage they would take this turn.");
	    return heart; // Retourne l'objet "Soul Heart"
	}

	// Méthode pour créer et retourner un objet Common pour "O. The Fool"
	public static Common fool() {
	    Common fool = new Common("O. The Fool", "image/visuel_common/b2-o_the_fool.png", "End the turn. Cancel everything that hasn't resolved.");
	    return fool; // Retourne l'objet "O. The Fool"
	}

	// Méthode pour créer et retourner un objet Common pour "I. The Magician"
	public static Common magician() {
	    Common magician = new Common("I. The Magician", "image/visuel_common/b2-i_the_magician.png", 
	        "Change the result of a dice roll to a number of your choosing.\r\n" + 
	        "(Rolls can't go below 1 or above 6.)");
	    return magician; // Retourne l'objet "I. The Magician"
	}

	// Méthode pour créer et retourner un objet Common pour "II. The High Priestess"
	public static Common hight_priestess() {
	    Common hight = new Common("II. The High Priestess", "image/visuel_common/b2-ii_the_high_priestess.png", 
	        "Choose a player or monster, then roll-\r\n" + 
	        "Deal damage to them equal to the result.");
	    return hight; // Retourne l'objet "II. The High Priestess"
	}

	// Méthode pour créer et retourner un objet Common pour "III. The Empress"
	public static Common empress() {
	    Common empress = new Common("III. The Empress", "image/visuel_common/b2-iii_the_empress.png", 
	        "Choose a player.\r\n" + 
	        "They gain +1ATK and +1 to dice rolls till end of turn.");
	    return empress; // Retourne l'objet "III. The Empress"
	}

	// Méthode pour créer et retourner un objet Common pour "IV. The Emperor"
	public static Common emperor() {
	    Common emperor = new Common("IV. The Emperor", "image/visuel_common/b2-iv_the_emperor.png", 
	        "Look at the top 5 cards of the monster deck. Put 1 on top and the rest on the bottom.");
	    return emperor; // Retourne l'objet "IV. The Emperor"
	}

	// Méthode pour créer et retourner un objet Common pour "V. The Hierophant"
	public static Common hierophant() {
	    Common hiero = new Common("V. The Hierophant", "image/visuel_common/b2-v_the_hierophant.png", 
	        "Choose a player or monster. Prevent the next instance of up to 2 damage they would take this turn.");
	    return hiero; // Retourne l'objet "V. The Hierophant"
	}

	// Méthode pour créer et retourner un objet Common pour "VI. The Lovers"
	public static Common lovers() {
	    Common lover = new Common("VI. The Lovers", "image/visuel_common/b2-vi_the_lovers.png", 
	        "Choose a player.\r\n" + 
	        "They gain +2HP till end of turn.");
	    return lover; // Retourne l'objet "VI. The Lovers"
	}

	// Méthode pour créer et retourner un objet Common pour "VII. The Chariot"
	public static Common chariot() {
	    Common chariot = new Common("VII. The Chariot", "image/visuel_common/b2-vii_the_chariot.png", 
	        "Choose a player.\r\n" + 
	        "They gain +1ATK and +1HP till end of turn.");
	    return chariot; // Retourne l'objet "VII. The Chariot"
	}

	// Méthode pour créer et retourner un objet Common pour "VIII. Justice"
	public static Common justice() {
	    Common justice = new Common("VIII. Justice", "image/visuel_common/b2-viii_justice.png", 
	        "Choose a player. Loot and gain ¢ until you have the same number of each as they do.");
	    return justice; // Retourne l'objet "VIII. Justice"
	}

	// Méthode pour créer et retourner un objet Common pour "IX. The Hermit"
	public static Common hermit() {
	    Common hermit = new Common("IX. The Hermit", "image/visuel_common/b2-ix_the_hermit.png", 
	        "Look at the top 5 cards of the treasure deck. Put 1 on top and the rest on the bottom.");
	    return hermit; // Retourne l'objet "IX. The Hermit"
	}

	// Méthode pour créer et retourner un objet Common pour "X. Wheel Of Fortune"
	public static Common wheel_of_fortune() {
	    Common wheel = new Common("X. Wheel Of Fortune", "image/visuel_common/b2-x_wheel_of_fortune.png", 
	        "Roll-\r\n" + 
	        "1: Gain 1¢.\r\n" + 
	        "2: Take 2 damage.\r\n" + 
	        "3. Loot 3.\r\n" + 
	        "4. Lose 4¢.\r\n" + 
	        "5: Gain 5¢.\r\n" + 
	        "6: Gain +1 treasure.");
	    return wheel; // Retourne l'objet "X. Wheel Of Fortune"
	}

	// Méthode pour créer et retourner un objet Common pour "XI. Strength"
	public static Common strength() {
	    Common str = new Common("XI. Strength", "image/visuel_common/b2-xi_strength.png", 
	        "Choose a player.\r\n" + 
	        "They gain +1ATK till end of turn and may attack an additional time this turn.");
	    return str; // Retourne l'objet "XI. Strength"
	}

	// Méthode pour créer et retourner un objet Common pour "XII. The Hanged Man"
	public static Common the_hanged_man() {
	    Common man = new Common("XII. The Hanged Man", "image/visuel_common/b2-xii_the_hanged_man.png", 
	        "Look at the top card of each deck. You may put any of those cards on the bottom of their deck, then loot 2.");
	    return man; // Retourne l'objet "XII. The Hanged Man"
	}

	// Méthode pour créer et retourner un objet Common pour "XIII. Death"
	public static Common death() {
	    Common death = new Common("XIII. Death", "image/visuel_common/b2-xiii_death.png", "Kill a player.");
	    return death; // Retourne l'objet "XIII. Death"
	}

	// Méthode pour créer et retourner un objet Common pour "XIV. Temperance"
	public static Common temperance() {
	    Common temp = new Common("XIV. Temperance", "image/visuel_common/b2-xiv_temperance.png", 
	        "Choose one-\r\n" + 
	        "Take 1 damage and gain 4¢.\r\n" + 
	        "Take 2 damage and gain 8¢.");
	    return temp; // Retourne l'objet "XIV. Temperance"
	}

	// Méthode pour créer et retourner un objet Common pour "XV. The Devil"
	public static Common devil() {
	    Common devil = new Common("XV. The Devil", "image/visuel_common/b2-xv_the_devil.png", 
	        "Destroy an item you control. If you do, steal a non-eternal item from a player or from the shop.");
	    return devil; // Retourne l'objet "XV. The Devil"
	}

	// Méthode pour créer et retourner un objet Common pour "XVI. The Tower"
	public static Common tower() {
	    Common tower = new Common("XVI. The Tower", "image/visuel_common/b2-xvi_the_tower.png", 
	        "Roll-\r\n" + 
	        "1-2: Each player takes 1 damage.\r\n" + 
	        "3-4: Each monster takes 1 damage.\r\n" + 
	        "5-6: Each player takes 2 damage.");
	    return tower; // Retourne l'objet "XVI. The Tower"
	}

	// Méthode pour créer et retourner un objet Common pour "XVII. The Stars"
	public static Common star() {
	    Common star = new Common("XVII. The Stars", "image/visuel_common/b2-xvii_the_stars.png", "Gain +1 treasure.");
	    return star; // Retourne l'objet "XVII. The Stars"
	}

	// Méthode pour créer et retourner un objet Common pour "XVIII. The Moon"
	public static Common moon() {
	    Common moon = new Common("XVIII. The Moon", "image/visuel_common/b2-xviii_the_moon.png", 
	        "Look at the top 5 cards of the loot deck. Put 1 on top and the rest on the bottom.");
	    return moon; // Retourne l'objet "XVIII. The Moon"
	}

	// Méthode pour créer et retourner un objet Common pour "XIX. The Sun"
	public static Common sun() {
	    Common sun = new Common("XIX. The Sun", "image/visuel_common/b2-xix_the_sun.png", 
	        "Put this on the bottom of the loot deck. If you do, take an extra turn after this one if it's your turn.");
	    return sun; // Retourne l'objet "XIX. The Sun"
	}

	// Méthode pour créer et retourner un objet Common pour "XX. Judgement"
	public static Common judgement() {
	    Common jud = new Common("XX. Judgement", "image/visuel_common/b2-xx_judgement.png", 
	        "Choose the player with the most souls or tied for the most. That player destroys a soul they control.");
	    return jud; // Retourne l'objet "XX. Judgement"
	}

	// Méthode pour créer et retourner un objet Common pour "XXI. The World"
	public static Common world() {
	    Common world = new Common("XXI. The World", "image/visuel_common/b2-xxi_the_world.png", 
	        "Look at each player's hand, then loot 2.");
	    return world; // Retourne l'objet "XXI. The World"
	}

	// Méthode pour créer et retourner un objet Common pour "Dagaz"
	public static Common dagaz() {
	    Common dagaz = new Common("Dagaz", "image/visuel_common/b2-dagaz.png", 
	        "Choose one-\r\n" + 
	        "Destroy a curse.\r\n" + 
	        "Choose a player. Prevent the next 1 damage they would take this turn.");
	    return dagaz; // Retourne l'objet "Dagaz"
	}

	// Méthode pour créer et retourner un objet Common pour "Ehwaz"
	public static Common ehwaz() {
	    Common ehwaz = new Common("Ehwaz", "image/visuel_common/b2-ehwaz.png", 
	        "Put each monster not being attacked into discard and replace each with the top card of the monster deck.");
	    return ehwaz; // Retourne l'objet "Ehwaz"
	}

	// Méthode pour créer et retourner un objet Common pour "Blank Rune"
	public static Common blank_rune() {
	    Common blank = new Common("Blank Rune", "image/visuel_common/b2-blank_rune.png", 
	        "Roll-\r\n" + 
	        "1: Each player gains 1¢.\r\n" + 
	        "2: Each player loots 2.\r\n" + 
	        "3: Each player takes 3 damage.\r\n" + 
	        "4: Each player gains 4¢.\r\n" + 
	        "5: Each player loots 5.\r\n" + 
	        "6: Each player gains 6¢.");
	    return blank; // Retourne l'objet "Blank Rune"
	}

}
