package json.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader {
	
	
	private static String filename ="C:\\Users\\stebar\\Desktop\\S29\\Binding_version_12_json\\src\\main\\webapp\\json\\exemple.json";
	
	public static char[] Jsonreader() {
		
		char[] data =null;
		try {
			File file = new File(filename);
			
			int size = (int) file.length();
			FileReader fr = new FileReader(file);
			
			// pour le debug afficher en console le contenu du fichier
			
			data = new char[size];
			
			fr.read(data);
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return data;
		
		
	}
	
	
	public static List<Player> getListPlayer(char[] datajson) throws JSONException{
		
		List<Player> lp = new ArrayList<Player>();
		
		JSONObject globalJson = new JSONObject(new String(datajson));
		
//		{
//			"player":[
//						{ "name":"toto",
//						  "action":100,
//						  "status":false
//						},
//						
//						{ "name":"otto",
//						  "action":1000,
//						  "status":true
//						}
//			         ]
//
//		}
		
		System.out.println(globalJson);
		//resultat du global Json
		//{"player":[{"name":"toto","action":100,"status":false},{"name":"otto","action":1000,"status":true}]}
		JSONArray  playerJson = globalJson.getJSONArray("player");
		System.out.println(playerJson);
		// Array qui correspond à la key: player
		//[{"name":"toto","action":100,"status":false},{"name":"otto","action":1000,"status":true}]
		
		
		int player_size = playerJson.length();
		// objet 1 : {"name":"toto","action":100,"status":false}
		// objet 2 : {"name":"otto","action":1000,"status":true}
		
		System.out.println("size :"+player_size);
		
		for(int i= 0 ;i<player_size; i++) {
			
			// pour le premier objet :
			JSONObject obj_player = playerJson.getJSONObject(i);
			
			@SuppressWarnings("unchecked")
			Iterator<JSONObject> it = obj_player.keys();
			// it contient l'ensemble des keys "
			Player player = new Player();
			
			while(it.hasNext()) {
				
				Object key = it.next();
				if(((String)key).equals("name"))
					player.setName(obj_player.getString((String)key));
					
				
				if(((String)key).equals("action"))
					player.setAction(obj_player.getInt((String)key));
				
				
				if(((String)key).equals("status"))
					player.setStatus(obj_player.getBoolean((String)key));
				
			}
			lp.add(player);
			player = null;
		}
		
		return lp;
	}
	
public static List<Player> getListPlayer(char[] datajson,String jsonkey) throws JSONException{
		
		List<Player> lp = new ArrayList<Player>();
		
		JSONObject globalJson = new JSONObject(new String(datajson));
//		{
//			"player":[
//						{ "name":"toto",
//						  "action":100,
//						  "status":false
//						},
//						
//						{ "name":"otto",
//						  "action":1000,
//						  "status":true
//						}
//			         ]
//		}
		
		System.out.println(globalJson);
		//resultat du global Json
		//{"player":[{"name":"toto","action":100,"status":false},{"name":"otto","action":1000,"status":true}]}
		JSONArray  playerJson = globalJson.getJSONArray(jsonkey);
		System.out.println(playerJson);
		// Array qui correspond à la key: player
		//[{"name":"toto","action":100,"status":false},{"name":"otto","action":1000,"status":true}]
		
		int player_size = playerJson.length();
		// objet 1 : {"name":"toto","action":100,"status":false}
		// objet 2 : {"name":"otto","action":1000,"status":true}
		
		System.out.println("size :"+player_size);
		
		for(int i= 0 ;i<player_size; i++) {
			
			// pour le premier objet :
			JSONObject obj_player = playerJson.getJSONObject(i);
			
			@SuppressWarnings("unchecked")
			Iterator<JSONObject> it = obj_player.keys();
			// it contient l'ensemble des keys "
			Player player = new Player();
			
			while(it.hasNext()) {
				
				Object key = it.next();
				if(((String)key).equals("name"))
					player.setName(obj_player.getString((String)key));
					
				
				if(((String)key).equals("action"))
					player.setAction(obj_player.getInt((String)key));
				
				
				if(((String)key).equals("status"))
					player.setStatus(obj_player.getBoolean((String)key));
				
			}
			lp.add(player);
			player = null;
		}
		
		return lp;
	}


	public static List<String> getListKey(char[] datajson) throws JSONException{
		List<String> ls = new ArrayList<String>();
		
		JSONObject globalJson = new JSONObject(new String(datajson));
		//{"plouc":[{"name":"bob","action":20,"status":true},
		//          {"name":"bil","action":50,"status":false}],
		// "player":[{"name":"toto","action":100,"status":false},
		//            {"name":"otto","action":1000,"status":true}]}
		
		Iterator<JSONObject> it = globalJson.keys();
		//System.out.println(it.next());
		while(it.hasNext()) {
			Object key = it.next();
			ls.add((String)key);
		}
		return ls;
	}
	
	
	public static void main(String[] args) throws JSONException {
		char [] datajson = Jsonreader();
		
		for(char d: datajson)
			System.out.print(d);
		List<Player> lp = new ArrayList<Player>();
		lp = getListPlayer(datajson,"plouc");
		
		for( Player p:lp)
			System.out.println(p);
		
		List<String> ls = getListKey(datajson);
		for(String s:ls)
			System.out.println(s);
		
	}
	

}
