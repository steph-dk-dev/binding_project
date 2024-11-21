
package creaCard;

import cartes.Heros;
import cartes.Tresor;
import java.util.function.Consumer;
import java.util.function.Function;

public class CreaPerso {

    public static void main(String[] args) {
        // Point d'entrée du programme. Actuellement vide, mais peut être utilisé pour créer et gérer des héros.
    }

    /**
     * Crée un héros Isaac avec un trésor D6.
     * @return Un objet Heros représentant Isaac.
     */
    public static Heros isaac() {
        Tresor D6 = Start_object.D6(); // Récupère le trésor D6 à partir de la classe Start_object.
        System.out.println("-------etrenalfunction-------");
        System.out.println(D6.getImage());
        Heros isaac = new Heros("isaac", "image/visuel perso/b2-isaac.png", "Play an additional loot card this turn.", D6,heros -> heros.lootplus());
        return isaac; // Retourne l'objet Heros Isaac créé.
    }

    /**
     * Crée un héros Maggy avec un trésor yum_heart.
     * @return Un objet Heros représentant Maggy.
     */
    public static Heros Maggy() {
        Tresor yum_heart = Start_object.yum_heart(); // Récupère le trésor yum_heart.
        System.out.println("-------etrenalfunction-------");
        System.out.println(yum_heart.getImage());
        Heros maggy = new Heros("Maggy", "image/visuel perso/b2-maggy.png", "Play an additional loot card this turn.", yum_heart,heros -> heros.lootplus());
        return maggy;
    }

    /**
     * Crée un héros Cain avec un trésor sleight_of_hand.
     * @return Un objet Heros représentant Cain.
     */
    public static Heros cain() {
        Tresor hand = Start_object.sleight_of_hand(); // Récupère le trésor sleight_of_hand.
        System.out.println("-------etrenalfunction-------");
        System.out.println(hand.getImage());
        Heros cain = new Heros("Cain", "image/visuel perso/b2-cain.png", "Play an additional loot card this turn.\r\n" +
                "If you control this as the game starts, you go first.", hand,heros -> heros.lootplus());
        return cain; // Retourne l'objet Heros Cain créé.
    }

    /**
     * Crée un héros Judas avec un trésor book_belial.
     * @return Un objet Heros représentant Judas.
     */
    public static Heros judas() {
        Tresor book = Start_object.book_belial(); // Récupère le trésor book_belial.
        System.out.println("-------etrenalfunction-------");
        System.out.println(book.getImage());
        Heros judas = new Heros("Judas", "image/visuel perso/b2-judas.png", "Tap Effect: Play an additional loot card this turn.", book,heros -> heros.lootplus());
        return judas; // Retourne l'objet Heros Judas créé.
    }

    /**
     * Crée un héros Blue Baby avec un trésor forever_alone.
     * @return Un objet Heros représentant Blue Baby.
     */
    public static Heros blue_baby() {
        Tresor alone = Start_object.forever_alone(); // Récupère le trésor forever_alone.*
        System.out.println("-------etrenalfunction-------");
        System.out.println(alone.getImage());
        Heros blue_baby = new Heros("Blue Baby", "image/visuel perso/b2-blue_baby.png", "Tap Effect: Play an additional loot card this turn.", alone,heros -> heros.lootplus());
        return blue_baby; // Retourne l'objet Heros Blue Baby créé.
    }

    /**
     * Crée un héros Eve avec un trésor curse.
     * @return Un objet Heros représentant Eve.
     */
    public static Heros eve() {
        Tresor curse = Start_object.curse(); // Récupère le trésor curse.
        System.out.println("-------etrenalfunction-------");
        System.out.println(curse.getImage());
        Heros eve = new Heros("Eve", "image/visuel perso/b2-eve.png", "Tap Effect: Play an additional loot card this turn.", curse,heros -> heros.lootplus());
        return eve; // Retourne l'objet Heros Eve créé.
    }

    /**
     * Crée un héros Samson avec un trésor blood_lust.
     * @return Un objet Heros représentant Samson.
     */
    public static Heros samson() {
        Tresor blood = Start_object.blood_lust(); // Récupère le trésor blood_lust.
        System.out.println("-------etrenalfunction-------");
        System.out.println(blood.getImage());
        Heros samson = new Heros("Samson", "image/visuel perso/b2-samson.png", "Tap Effect: Play an additional loot card this turn.", blood,heros -> heros.lootplus());
        return samson; // Retourne l'objet Heros Samson créé.
    }

    /**
     * Crée un héros Lazarus avec un trésor rags.
     * @return Un objet Heros représentant Lazarus.
     */
    public static Heros lazarus() {
        Tresor rags = Start_object.rags(); // Récupère le trésor rags.
        System.out.println("-------etrenalfunction-------");
        System.out.println(rags.getImage());
        Heros lazarus = new Heros("Lazarus", "image/visuel perso/b2-lazarus.png", "Tap Effect: Play an additional loot card this turn.", rags,heros -> heros.lootplus());
        return lazarus; // Retourne l'objet Heros Lazarus créé.
    }

    /**
     * Crée un héros Lilith avec un trésor incubus.
     * @return Un objet Heros représentant Lilith.
     */
    public static Heros lilith() {
        Tresor incubus = Start_object.incubus(); // Récupère le trésor incubus.
        System.out.println("-------etrenalfunction-------");
        System.out.println(incubus.getImage());
        Heros lilith = new Heros("Lilith", "image/visuel perso/b2-lilith.png", "Tap Effect: Play an additional loot card this turn.", incubus,heros -> heros.lootplus());
        return lilith; // Retourne l'objet Heros Lilith créé.
    }

    /**
     * Crée un héros The Forgotten avec un trésor bone.
     * @return Un objet Heros représentant The Forgotten.
     */
    public static Heros forgotten() {
        Tresor bone = Start_object.bone(); // Récupère le trésor bone.
        System.out.println("-------etrenalfunction-------");
        System.out.println(bone.getImage());
        Heros forgotten = new Heros("The Forgotten", "image/visuel perso/b2-the_forgotten.png", "Tap Effect: Play an additional loot card this turn.", bone,heros -> heros.lootplus());
        return forgotten; // Retourne l'objet Heros The Forgotten créé.
    }

    //public static Heros eden() {
    //    Tresor randomItem = null; 
    //    Heros eden = new Heros("Eden", "image/visuel perso/b2-eden.png", "Tap Effect: Play an additional loot card this turn. When you start the game, look at the top 3 cards of the treasure deck and choose one. It becomes your starting item and gains eternal. Put the rest on the bottom of the treasure deck.", randomItem,heros -> heros.lootplus());
    //    return eden; 
    //}
}