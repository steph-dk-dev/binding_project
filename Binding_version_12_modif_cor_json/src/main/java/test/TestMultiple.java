package test;
import creationDeck.Creadeck;
import creationDeck.deckBoardTresor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;

import cartes.Monstre;
import bean.ContextGame;
import bean.function;
import creaCard.CreaPerso;
import creaCard.Creamonster;
import cartes.Heros;
import test.Test;

public class TestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> deck =creationDeck.Creadeck.creaDeckMonster() ;
		System.out.println(deck);
		
		Heros isaac = CreaPerso.isaac();
		System.out.println(isaac.getEtats());
		Consumer<Heros> penny = heros -> heros.lootplus();
		List<Consumer<Heros>> test = new ArrayList<Consumer<Heros>>();
		test.add(penny);
		
		test.get(0).accept(isaac);
		System.out.println(isaac.getEtats());
		Test coucou = new Test();
		coucou.coucou();
		System.out.println("___");
		List<Object> test2 = new ArrayList<Object>();
		test2.add(coucou);
		Object test3= (Test)test2.get(0);
		((Test) test3).coucou();
		deckBoardTresor deck2 =  new deckBoardTresor();
		System.out.println(deck2);
		
		String test4 = deck2.getTresorDos();
		
		System.out.println(test4);
		
		
	}


	
	
}
