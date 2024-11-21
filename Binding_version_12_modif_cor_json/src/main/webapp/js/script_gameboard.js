/**
 * 
 */
function send(frame,context,data){
	let obj_frame = document.getElementById(frame)
	
	let obj_form = document.createElement('form')
	let obj_pointer = document.createElement('input')
	
	/* Ajout de propriété aux balises*/
    obj_form.setAttribute('action',context)
    obj_form.setAttribute('method','post')
    obj_pointer.setAttribute('name','pointer')
    obj_pointer.setAttribute('value',data)
    
    obj_form.appendChild(obj_pointer)
    obj_frame.appendChild(obj_form)
    
    obj_form.submit()
	
}

 function showImage(imgElement) {
    var displayedImage = document.getElementById("displayedImage");
	//console.log(displayedImage)
   displayedImage.src = imgElement.src;
}

 function  noShowImage() {
    var displayedImage = document.getElementById("displayedImage");
    displayedImage.src = "";
}
