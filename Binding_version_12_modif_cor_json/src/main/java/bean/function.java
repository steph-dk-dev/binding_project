package bean;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cartes.Common;
import cartes.Curse;
import cartes.Event;
import cartes.Heros;
import cartes.Monstre;
import cartes.Soul;
import cartes.Tresor;
import cartes.Trincket;

public class function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int lancerDe () {

		Random rand = new Random();
		int num = rand.nextInt(6)+1;
		return num;
	}
	public static int random (int number) {
		Random rand = new Random();
		int num = rand.nextInt(number );
		return num;
	}
	
	public static Integer intrandom (Integer number) {
		Random rand = new Random();
		int num = rand.nextInt(number );
		return num;
	}
	
	
	public static List<Object> deck(Class<?> clazz){
		int count =0;
		List<Object> deck = new ArrayList<>();
		
		Method[] methods =clazz.getDeclaredMethods();
		
		for (Method method : methods) {
			if(Modifier.isStatic(method.getModifiers())) {
				try {
					 if (method.getParameterCount() == 0) {
						Object result =  method.invoke(null);
						 deck.add(result);
						 count++;
					 }
					
					
				}catch(Exception e){
					e.printStackTrace();
					
					
				}
				
			}
			else {
				System.out.println("pas static");
			}
		}
		return deck;
		
	}
	
	public static List<Object> unsort(List<Object> sortDeck) {
	    List<Object> unsort = listeNull(sortDeck.size());  // Une liste remplie de null, même taille que sortDeck

	    for (int i = 0; i < sortDeck.size(); i++) {
	        boolean inserted = false;
	        while (!inserted) {
	            int pointeur = random(sortDeck.size());
	            if (unsort.get(pointeur) == null) {
	                unsort.set(pointeur, sortDeck.get(i));  // Remplacer l'élément null à cet index
	                inserted = true;  // Sortir de la boucle une fois l'élément inséré
	            }
	        }
	    }

	    return unsort;
	}
	public static List<Object> listeNull(int number) {
		
		List<Object> list = new ArrayList<Object>(number);
		for (int i =0;i<number;i++) {
			list.add(i, null);
		}
		return list;
		
		
		
	}
	

	public static  <T> T piocher (List<T> deck ) {
		
		 T carte = deck.remove(0);

		 return carte;	
	}

	public static Object recastObject (Object object) {
		
	if (object instanceof Common) {
		Common cible = (Common) object;
		return cible;
	}
	else if (object instanceof Curse) {
		Curse cible = (Curse) object;
		return cible;
	}
	else if (object instanceof Event) {
		Event cible = (Event) object;
		return cible;
	}
	else if (object instanceof Heros) {
		Heros cible = (Heros) object;
		return cible;
	}
	else if (object instanceof Monstre) {
		Monstre cible = (Monstre) object;
		return cible;
	}
	else if (object instanceof Soul) {
		Soul cible = (Soul) object;
		return cible;
	}
	else if (object instanceof Tresor) {
		Tresor cible = (Tresor) object;
		return cible;
	}
	else if (object instanceof Trincket) {
		Trincket cible = (Trincket) object;
		return cible;
	}
	else
		return null;
	
	
	}
	
	
	
}
