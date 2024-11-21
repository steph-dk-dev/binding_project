/**
 * 
 */

class Frame{
// class attributes
// prévoir le déplacement de la fentêtre et la rendre modale
constructor(id=null,title,width,height,
			bg_color="white",
	        pos_x=200,pos_y=200,
			barre_title="darkblue",
			barre_bg_color="white",
		    visible = true,event=true){
				
	//si id pas défini donc null, on va injecter le Frame dans le body.			
				
	this.id = id;
	
	this.visible = visible;
	
	this.width=width;
	this.height=height;
	this.bg_color=bg_color;
	this.pos_x= pos_x;
	this.pos_y=pos_y;
	
	// Enables event management
	this.enableEvent            = event
	this.idFrame                = null;
	
	// for the window bar
	this.barre_title 	    	= title;
	this.barre_bg_color     	= barre_title;
	this.barre_font_color 		= barre_bg_color;
	this.barre_bg_color_focus  	= "red";
	
}

getIdFrame(){
	return this.idFrame
}

initFrame(){
	
	//Create the different components of the modal window.
	let div_frame = document.createElement('div');
	this.idFrame = this.genereId("frame");
	//console.log("idFrame ="+this.idFrame);
	div_frame.id = this.idFrame;
	
	let div_barre = document.createElement('div');
	let idBarre = this.genereId("barre");
	div_barre.id = idBarre;
	
	let barre_title = document.createElement('p');
	let idtitle = this.genereId("title");
	barre_title.id = idtitle;
	
	let barre_close = document.createElement('div');
	let idclose = this.genereId("close");
	barre_close.id = idclose;
	
	// Define the properties of the bar.
	let str_barre_pos="position:absolute;top:0px;left:0px;margin:0px;padding-left:5px;";
	
	let str_barre_width 		= "width:calc(100% - 5px);";
	let str_barre_height 		= "height:"+25+"px;";
	let str_barre_bg_color 		= "background-color:"+this.barre_bg_color+";";
	let str_barre_font_color 	= "color:"+this.barre_font_color+";";
	
	
	div_barre.setAttribute("style",str_barre_pos+
								   str_barre_bg_color+
	                               str_barre_font_color+
								   str_barre_height+
							       str_barre_width);
								   
	//Define the title properties.							   
	barre_title.setAttribute("style","margin:0px;padding:2px");		
	
	//Define the close properties.
	let str_close_pos="position:absolute;top:0px;right:5px;margin:0px;padding:2px;";					   
	barre_close.setAttribute("style",str_close_pos+str_barre_bg_color+"height:10px;width:10px");							   
	
	
	barre_title.innerHTML = this.barre_title;	
	barre_close.innerHTML = "X";
						   
								   
	div_frame.appendChild(div_barre);
	div_barre.appendChild(barre_title);
	let idf= this.idFrame
	
	//Setting up event management for the modal window's closing block.
	let enableEvent = this.enableEvent
	barre_close.addEventListener('pointerdown', function(){
			if(enableEvent==true){
	                actionDown(idf, "close")
	        }
	  })
	  
	 barre_close.addEventListener('pointerover', function(){
				let str_barre_close_bg_color = "background-color:red;";
				barre_close.setAttribute("style",str_close_pos+str_barre_close_bg_color+"height:15px;width:15px");
	 })
	 
	 barre_close.addEventListener('pointerout', function(){
	 			barre_close.setAttribute("style",str_close_pos+str_barre_bg_color+"height:15px;width:15px");	
	 	  	        
	 })
	
	//Place a button to lock the modal window
	div_barre.appendChild(barre_close);
	
	// define window properties
	let str_frame_width 		= "width:"+this.width+"px;";
	let str_frame_height 		= "height:"+this.height+"px;";
	let str_frame_bg_color 	    = "background-color:"+this.bg_color+";";
	let str_frame_border_color  = "border:1px solid blue;";
	let str_frame_top			= "top:"+this.pos_y+"px;";
	let str_frame_left			= "left:"+this.pos_x+"px;";
	let str_frame_pos 			= "position:absolute;"+str_frame_top+str_frame_left;
	let str_frame_visible       = "display:"+(this.visible?"block;":"none;");
	div_frame.setAttribute("style",str_frame_pos+
								   str_frame_width+
	                               str_frame_height+
								   str_frame_bg_color+
								   str_frame_border_color+str_frame_visible+"z-index:1;");
	
	//Insert the modal in the composer that is found in the "body" defined by its ID.
	if(this.id !=null){					   
		let target = document.getElementById(this.id);
		target.appendChild(div_frame);
	}else
		document.body.appendChild(div_frame)
	
	
}

insertImage(id,obj_img,name="image1",width=200,height=200, event=true){
	let frame = document.getElementById(id);
	let div_panel= document.createElement('div');
	this.idPanel = this.genereId("panel");
	
	div_panel.id = this.idPanel;
	
	let str_panel_width 		= "width:"+width+"px;";
	let str_panel_height 		= "height:"+height+"px;";
	let str_panel_bg_img 	    = "background-image:url("+obj_img+");background-size:100% 100%;";
	let str_panel_border_color  = "border:1px solid red;";
	let str_panel_top			= "top:"+35+"px;";
	let str_panel_left			= "left:"+35+"px;";
	// erreur de syntaxe fin 154
	let str_panel_pos 			= "position:absolute;"+str_panel_top+str_panel_left
	let idObj = this.idPanel	
	div_panel.setAttribute("style",str_panel_pos+
									   str_panel_width+
		                               str_panel_height+
									   str_panel_bg_img+
									   str_panel_border_color);
	
	div_panel.addEventListener('pointerdown', function(){
			if(event==true)
		           actionDown_Image(name, 1)
		    
	})
	div_panel.addEventListener('dblclick', function(){
			if(event==true)
			       actiondblclick_Image(idObj, 1)
			
	})
	
	frame.appendChild(div_panel)
	
}



insertButton(id,value,action,width=50,height=20,position=null, event=true){
	let pos_x = 25;
	let pos_y = 25;
	let type_pos ="absolute";
	
	if (position != null){
		pos_x = position.x;
		pos_y = position.y;
		type_pos = position.type
	}
	
	let frame = document.getElementById(id);
	let div_button= document.createElement('button');
	let idButton = this.genereId("button");
		
	div_button.id = idButton;
	
	let str_button_width 		= "width:"+width+"px;";
	let str_button_height 		= "height:"+height+"px;";
	let str_button_border_color = "border:1px solid red;";
	let str_button_top			= "top:"+pos_y+"px;";
	let str_button_left			= "left:"+pos_x+"px;";
	let str_button_pos 			= "position:"+type_pos+";"+str_button_top+str_button_left;
	div_button.innerHTML = value		
	div_button.setAttribute("style",str_button_pos+
								   str_button_width+
			                       str_button_height+
								   str_button_border_color);
								   
	let idObj = this.idPanel							   
    div_button.addEventListener('pointerdown', function(){
   			if(event==true)
   		          actionclick_Image(idObj, action)
   		    
   	 })
   	 div_button.addEventListener('dblclick', function(){
   			if(event==true)
   			      actiondblclick_Image(idObj, action)
   			
   	 })							   
								   
								  					   
	frame.appendChild(div_button)
	
}

genereId(obj){
	let d = new Date()
	let str_time = d.getDay()+""+d.getHours()+""+d.getMinutes()+""+d.getSeconds()+""+d.getMilliseconds()
	
	let time = parseInt(str_time)
	//
	let a = 4_294_967_000
	
	let x = time & 4_294_967_295   // exemple a = 10101111   b = 11000111  = c = a&b = 10000111
	x = (a*(x & 4_294_967_295)+(x>>16))
	x =Math.floor(Math.abs(x/784))
	return obj+"_"+x
}	
}