package bean;

import java.util.ArrayList;
import java.util.List;

import cartes.Common;
import cartes.Curse;
import cartes.Event;
import cartes.Heros;
import cartes.Monstre;
import cartes.Soul;
import cartes.Tresor;
import cartes.Trincket;

public class ConversionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Heros> conversionHeros (List<Object> liste){
		
		List<Heros> listeHeros = new ArrayList<Heros>();
		for(Object object : liste ) {
			listeHeros.add((Heros)object );
		}
		return listeHeros;
	}
	public static List<Common> conversion (List<Object> liste){
		
		List<Common> listeCommon = new ArrayList<Common>();
		for(Object object : liste ) {
			listeCommon.add((Common)object );
		}
		return listeCommon;
	}
	public static List<Curse> conversionCurse (List<Object> liste){
		
		List<Curse> listeCurse = new ArrayList<Curse>();
		for(Object object : liste ) {
			listeCurse.add((Curse)object );
		}
		return listeCurse;
	}
	public static List<Event> conversionEvent (List<Object> liste){
		
		List<Event> listeEvent = new ArrayList<Event>();
		for(Object object : liste ) {
			listeEvent.add((Event)object );
		}
		return listeEvent;
	}	
	public static List<Monstre> conversionMonstre (List<Object> liste){
		
		List<Monstre> listeMonstre = new ArrayList<Monstre>();
		for(Object object : liste ) {
			listeMonstre.add((Monstre)object );
		}
		return listeMonstre;
	}	
	public static List<Soul> conversionSoul (List<Object> liste){
		
		List<Soul> listeSoul = new ArrayList<Soul>();
		for(Object object : liste ) {
			listeSoul.add((Soul)object );
		}
		return listeSoul;
	}
	public static List<Tresor> conversionTresor (List<Object> liste){
		
		List<Tresor> listeTresor = new ArrayList<Tresor>();
		for(Object object : liste ) {
			listeTresor.add((Tresor)object );
		}
		return listeTresor;
	}
	public static List<Trincket> conversionTrincket (List<Object> liste){
		
		List<Trincket> listeTrincket = new ArrayList<Trincket>();
		for(Object object : liste ) {
			listeTrincket.add((Trincket)object );
		}
		return listeTrincket;
	}
	
	
	
	
}
