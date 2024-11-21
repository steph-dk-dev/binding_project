/**
 * 
 */

let url_json = null
let json_data = null
let list_player = null


function loadGlobalJson(){
	
	url_json = getContext(CONTEXT)+JSONFILE_TEST
	//console.log("url_json ="+url_json)
	// envoyer une requête au serveur pour récuperer le contenu du fichier json
	fetch(url_json).then(response =>{
										var resp = response.json()
										// pour le debug afficher la structure du fichier json
										console.log(resp)
										return resp
									})
									.then(jsondata => json_data = jsondata)
									
     var millisecondsWait = 80
	 //attendre 80 ms avant de récupérer la structure
	 setTimeout( () => {
		
						// les traitements à faire
						// ici on va récupérer la liste des players qui se trouve 
						// dans le JSON  json_data
						getListPlayer_aux()	
								
	                    },millisecondsWait)
									
	
}

function getListPlayer_aux(){
	
	list_player = new Array()
	list_player.push(getPlayer("player")) 
	list_player.push(getPlayer("plouc"))
	
}


function getPlayer(str_player){
	// cet objet est composé d'un tableau
	// console.log(json_data.player)
	
	let json_player = json_data.player
	
	switch(str_player){
		
		case "player":
			json_player =json_data.player
			//console.log(json_player)
			break
		case "plouc":
			json_player =json_data.plouc
			break
		default:
			return null
	} 
	//console.log(json_player)
	// dimension du tableau 
	let len = json_player.length	
	//console.log("len ="+len)
	let array_player = new Array(len)
	//console.log(json_player)
	for(let pt = 0 ; pt<len; pt++){
		
		let name   = json_player[pt].name
		let action = json_player[pt].action
		let status = json_player[pt].status
		let obj_player = new Player(name,action,status)
		array_player[pt] = obj_player
		obj_player = null
	}
	//console.log(array_player)
	return array_player
	
}

function getListPlayer(){
	return list_player
}



