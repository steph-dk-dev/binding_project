<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%String ctx = request.getServletContext().getContextPath();%>
<%@ taglib prefix="function"  uri="/WEB-INF/tld/taglib.tld" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="<%=ctx %>/js/modal/frame.js"></script>
<script src="<%=ctx %>/js/modal/events.js"></script>
<script src="<%=ctx %>/js/json/context.js"></script>
<script src="<%=ctx %>/js/json/readJson.js"></script>
<script src="<%=ctx %>/js/beans/player.js"></script>
<meta charset="UTF-8">
<title>test</title>
</head>

<%

	String nom ="Toto";
	// comment passer une fonction en tant que paramètre
	
%>

<body>

<div id="100" style="width:500px;height:600px;background-color: transparent;">toto</div>


<script>
    const CONTEXT = "<%=ctx %>"
	// public static void exemple(Object ... data){}
	console.log("document.body.id="+document.body.id)
	let frame = new Frame(null,"Exemple de fenêtre modale",300,200,"lightcyan",20,50,"yellow",true)
	frame.initFrame()
	let imgtest = "<%=ctx%>/image/ame_sup/b2-soul_of_greed.png"
	//id,obj_img,name="image1",width=200,height=200, event=true
	let id = frame.getIdFrame()
	frame.insertImage(id,imgtest,"image1",100,150,true)
	
	//insertButton(id,value,action,width=50,height=20,position=null, event=true)
	let position = {x:180,y:150,type:"absolute"}
	let value = "<%=nom%>"
	// un bug
	frame.insertButton(id,'go_${function:random(200)}',2,75,30,position)
	
	loadGlobalJson()
	setTimeout(()=>{
		let array_player = getListPlayer()
		console.log("array_player")
		console.log(array_player)
	},150)
	
	
	
	
	
	
</script>
<!-- bug  -->  

</body>
</html>