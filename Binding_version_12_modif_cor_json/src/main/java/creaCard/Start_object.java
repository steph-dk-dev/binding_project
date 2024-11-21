package creaCard;
import cartes.Tresor;

public class Start_object {

    public static void main(String[] args) {
        // Point d'entrée du programme. Actuellement vide, mais peut être utilisé pour initialiser des objets ou gérer le jeu.
    }

    /**
     * Crée un trésor D6.
     * @return Un objet Tresor représentant le D6.
     */
    public static Tresor D6() {
        Tresor dsix = new Tresor("the D6", "image/visuel_objet_depart/b2-the_d6.png", 
            "Choose a dice roll. Its controller rerolls it.", true);
        return dsix; // Retourne l'objet Tresor D6 créé.
    }

    /**
     * Crée un trésor Yum Heart.
     * @return Un objet Tresor représentant Yum Heart.
     */
    public static Tresor yum_heart() {
        Tresor yum_heart = new Tresor("yum heart", "image/visuel_objet_depart/b2-yum_heart.png", 
            "Tap Effect: Choose a player or monster. Prevent the next instance of damage they would take this turn. " +
            "At the end of your turn, recharge this.", true );
        return yum_heart; // Retourne l'objet Tresor Yum Heart créé.
    }

    /**
     * Crée un trésor Sleight of Hand.
     * @return Un objet Tresor représentant Sleight of Hand.
     */
    public static Tresor sleight_of_hand() {
        Tresor hand = new Tresor("Sleight Of Hand", "image/visuel_objet_depart/b2-sleight_of_hand.png", 
            "Tap Effect: Look at the top 5 cards of a deck. Put them back in any order.", true);
        return hand; // Retourne l'objet Tresor Sleight of Hand créé.
    }

    /**
     * Crée un trésor Book of Belial.
     * @return Un objet Tresor représentant Book of Belial.
     */
    public static Tresor book_belial() {
        Tresor book = new Tresor("Book Of Belial", "image/visuel_objet_depart/b2-book_of_belial.png", 
            "Add or subtract 1 from a roll. At the end of your turn, recharge this.", true);
        return book; // Retourne l'objet Tresor Book of Belial créé.
    }

    /**
     * Crée un trésor Forever Alone.
     * @return Un objet Tresor représentant Forever Alone.
     */
    public static Tresor forever_alone() {
        Tresor alone = new Tresor("Forever Alone", "image/visuel_objet_depart/b2-forever_alone.png", 
            "Tap Effect: Choose one-\n" +
            "    Steal 1¢ from another player.\n" +
            "    Look at the top card of a deck.\n" +
            "    Discard a loot card, then loot 1\n" +
            "Each time you take damage, recharge this.", true);
        return alone; // Retourne l'objet Tresor Forever Alone créé.
    }

    /**
     * Crée un trésor The Curse.
     * @return Un objet Tresor représentant The Curse.
     */
    public static Tresor curse() {
        Tresor curse = new Tresor("The Curse", "image/visuel_objet_depart/b2-the_curse.png", 
            "At the start of your turn, put the top card of a deck into discard.\n" +
            "Tap Effect: Put the top card of any discard on top of its deck.", true);
        return curse; // Retourne l'objet Tresor The Curse créé.
    }

    /**
     * Crée un trésor Blood Lust.
     * @return Un objet Tresor représentant Blood Lust.
     */
    public static Tresor blood_lust() {
        Tresor blood = new Tresor("Blood Lust", "image/visuel_objet_depart/b2-blood_lust-308x420.png", 
            "Tap Effect: Choose a player or monster. They gain +1 ATK till end of turn.\n" +
            "At the end of your turn, recharge this.", true);
        return blood; // Retourne l'objet Tresor Blood Lust créé.
    }

    /**
     * Crée un trésor Lazarus’ Rags.
     * @return Un objet Tresor représentant Lazarus’ Rags.
     */
    public static Tresor rags() {
        Tresor rags = new Tresor("Lazarus’ Rags", "image/visuel_objet_depart/b2-lazarus_rags-308x420.png", 
            "Each time you die, after paying penalties, gain +1 treasure.", true);
        return rags; // Retourne l'objet Tresor Lazarus’ Rags créé.
    }

    /**
     * Crée un trésor Incubus.
     * @return Un objet Tresor représentant Incubus.
     */
    public static Tresor incubus() {
        Tresor incubus = new Tresor("Incubus", "image/visuel_objet_depart/b2-incubus.png", 
            "Tap Effect: Choose one-\n" +
            "Look at a player's hand. You may swap a card from your hand with one of theirs.\n" +
            "Loot 1, then put a card from your hand on top of the loot deck", true);
        return incubus; // Retourne l'objet Tresor Incubus créé.
    }

    /**
     * Crée un trésor The Bone.
     * @return Un objet Tresor représentant The Bone.
     */
    public static Tresor bone() {
        Tresor bone = new Tresor("The Bone", "image/visuel_objet_depart/b2-the_bone.png", 
            "Tap Effect: Put a counter on this.\n" +
            "Paid Effect: Remove 1 counter from this:\n" +
            "Add +1 to a dice roll.\n" +
            "Paid Effect: Remove 2 counters from this:\n" +
            "Deal 1 damage to a monster or player.\n" +
            "Paid Effect: Remove 5 counters from this:\n" +
            "This becomes a soul and loses all abilities", true);
        return bone; // Retourne l'objet Tresor The Bone créé.
    }
}