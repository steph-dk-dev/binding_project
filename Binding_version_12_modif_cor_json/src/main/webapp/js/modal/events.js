function actionDown_Image(name, action){
	
	
}

function actionclick_Image(id, action){
	if(action == 2){// show yes/no
			console.log("button action ")
			let obj_div = document.getElementById(id);
			if (obj_div.style.display === "none")
				obj_div.style.display = "block";	
			else
				obj_div.style.display = "none";
		}
	
}

function actiondblclick_Image(id, action){
	if(action == 1){// action de rotation
		let obj_div = document.getElementById(id);
		if (obj_div.style.transform == "rotate(0deg)")
			obj_div.style.transform = "rotate(90deg)";
		else
			obj_div.style.transform = "rotate(0deg)";		
				
	}
	
	if(action == 2){// show yes/no
		console.log("button action ")
		let obj_div = document.getElementById(id);
		if (obj_div.style.display === "none")
			obj_div.style.display = "block";	
		else
			obj_div.style.display = "none";
	}
	
}

function actionDown(idf,action){
	let obj = document.getElementById(idf)
	if(action == "close"){
		obj.style.display="none"
	}
	
	
}
