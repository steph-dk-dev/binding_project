package creationDeck;

import java.util.ArrayList;
import java.util.List;

import bean.*;
import cartes.*;
import creaCard.CreaPerso;
import creaCard.Creacommon;
import creaCard.Creacurse;
import creaCard.Creaevent;
import creaCard.Creamonster;
import creaCard.Creatresor;
import creaCard.Creatrincket;

	public class Creadeck {

	public Creadeck() {
		// TODO Auto-generated constructor stub
	}

	public static List<Object> creaDeckMonster () {
		List<Object> deckRange = new ArrayList<Object>();
		List<Object> deckPt1 = bean.function.deck(Creamonster.class);
		List<Object> deckPt2 = bean.function.deck(Creacurse.class);
		List<Object> deckPt3 = bean.function.deck(Creaevent.class);
		for(Object object : deckPt1) {
			deckRange.add(object);
		}
		for(Object object : deckPt2) {
			deckRange.add(object);
		}
		for(Object object : deckPt3) {
			deckRange.add(object);
		}
		
		
		
		System.out.println("-----------deckrange monstre--------");
		System.out.println(deckRange);
		
		
		List<Object> deckMelange = bean.function.unsort(deckRange);
		System.out.println("-----------deckunsort monstre--------");
		System.out.println(deckMelange);
		
		return deckMelange;
		
		
	}
	
	public static List<Object> creaDeckTresor () {
		
		List<Object> deckRange = bean.function.deck(Creatresor.class);
		
		List<Object> deckMelange = bean.function.unsort(deckRange);
		
		
		return deckMelange;
		
		
	}
	
	public static List<Object> creaDeckCommon (){
		List<Object> deckRange = new ArrayList<Object>();
		List<Object> deckPt1 = bean.function.deck(Creacommon.class);
		List<Object> deckPt2 = bean.function.deck(Creatrincket.class);
		deckRange.add(deckPt1);
		deckRange.add(deckPt2);
		
		List<Object> deckMelange = bean.function.unsort(deckRange);
		
		return deckMelange;
	}

	
	public static List<Heros> creaListePerso (){
		
		List<Object> deckPt1 = bean.function.deck(CreaPerso.class);
		List<Object> deckMelange = bean.function.unsort(deckPt1);
		System.out.println("---deckheros----");
		System.out.println(deckMelange);
		System.out.println("---deck---");
		System.out.println(deckPt1);
		return bean.ConversionList.conversionHeros(deckMelange);	
	}
}
