<%@page import="bean.function"%>
<%@page import="bean.ContextGame"%>
<%@page import="bean.ObjContextGame"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="f1"  uri="/WEB-INF/tld/taglib.tld" %>

 <%String ctx = request.getServletContext().getContextPath();%>
 <%                                                          

 
 // objet context
 Object obj_context = session.getAttribute("listobjCG");
 System.out.println("listobjCG ="+obj_context);
 
 ObjContextGame cg =null;
 if(obj_context!=null)
 {
	cg = (ObjContextGame)obj_context;
	//image/visuel_tresor/TreasureCardBack.png
	 System.out.println(cg.getTresor().getTresorDos());
 }

 
 // Objetctif : un clic sur une image , on doit récupérer l'objet associé
 // exemple : clic 
 
 // un clic sur une carte : si option activé {0,1,2} je récupérer coté serveur 
 

 
 %>

 <c:set var ="pointer" value="0"/>
<!DOCTYPE html>
<html>
<head>
 <script src="<%=ctx%>/js/modal/frame.js"></script>
<script src="<%=ctx%>/js/modal/events.js"></script>
<meta charset="ISO-8859-1">
<title>Plateau de jeu</title>
<script type="text/javascript" src="js/script_gameboard.js"></script>
<link rel="stylesheet" href="<%=ctx%>/CSS/gameboard.css">
</head>
<body>
<script>
//let frame = new Frame(null,"Exemple de fenêtre modale",800,200,"lightcyan",400,400,"yellow",true)
//frame.initFrame()
let frame = new Frame(null,"Exemple de fenêtre modale",300,200,"lightcyan",200,500,"yellow",true)
frame.initFrame()





</script>
	<c:out value="${f1.merge('main1card',200)}"/>
	<fieldset class="tresor fieldset1">
		<legend>Tresor</legend>
			<div class="flex-card1">		
			<img class="card" id="tresorDeck" alt="" src="${sessionScope.listobjCG.tresor.tresorDos}" onclick="showImage(this)">
				<c:choose>
            	<c:when test="${not empty sessionScope.listobjCG.tresor.tresorDefausse[0]}">
                	<img class="card" id="tresor1" alt="" name= "${pointer}" src="${sessionScope.listobjCG.tresor.tresorDefausse[fn:length(sessionScope.listobjCG.tresor.tresorDefausse)-1]}" onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="tresor1" name= "${pointer}" alt="" src="" onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        </c:choose>
				<img class="card" id="tresor1"  name= "${pointer}" alt="" src="${sessionScope.listobjCG.tresor.tresorVisible[0].image}" onclick="showImage(this)">
				<c:set var ="pointer" value="${pointer+1 }"/>
				<img class="card" id="tresor2"  name= "${pointer}" alt="" src="${sessionScope.listobjCG.tresor.tresorVisible[1].image}" onclick="showImage(this)">
				<c:set var ="pointer" value="${pointer+1 }"/>	
			</div>
	</fieldset>
		
	<fieldset class="common fieldset4">
		<legend>Objet</legend>
		<div class="flex-card2">
			<img class="card" id="tresorDeck" alt="" src="${sessionScope.listobjCG.common.commonDos}" onclick="showImage(this)">
			<c:choose>
            	<c:when test="${not empty sessionScope.listobjCG.common.commonDefausse[0]}">
                	<img class="card" id="commondefause" name= "${pointer}" alt="" src="${sessionScope.listobjCG.common.commonDefausse[fn:length(sessionScope.listobjCG.common.commonDefausse)-1]}" onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="commondefausse" name= "${pointer}" alt="" src="" onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        </c:choose>
		</div>
	</fieldset>
	<fieldset class="monster fieldset1">
		<legend>Monstre</legend>
		<div class="flex-card1">
			<img class="card" id="monsterDeck" alt="" src="${sessionScope.listobjCG.monstre.monsterDos}" onclick="showImage(this)">
			<c:choose>
            	<c:when test="${not empty sessionScope.listobjCG.monstre.monsterDefausse[0]}">
            		<c:out value="${sessionScope.listobjCG.monstre.monsterDefausse[fn:length(sessionScope.listobjCG.monstre.monsterDefausse)-1]}"/>
                	<img class="card" id="commondefause" name= "${pointer}" alt="" src="${sessionScope.listobjCG.monstre.monsterDefausse[fn:length(sessionScope.listobjCG.monstre.monsterDefausse)-1]}" onclick="showImage(this)">
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="commondefausse" name= "${pointer}" alt="" src="" onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
       		</c:choose>
       		
       		<img class="card" id="monster1"  name= "${pointer}" alt="" src="${sessionScope.listobjCG.monstre.monsterVisible[0].image}" onclick="showImage(this)">
       		<c:set var ="pointer" value="${pointer+1 }"/>
			<img class="card" id="monster2"  alt="" name= "${pointer}" src="${sessionScope.listobjCG.monstre.monsterVisible[1].image}" onclick="showImage(this)">
			<c:set var ="pointer" value="${pointer+1 }"/>
			</div>
	</fieldset>
	<fieldset class="perso1">

		<img class="card persocomp1" id="perso1card"  name= "${pointer}" alt="" src="${sessionScope.listobjCG.player1.image}" onclick="showImage(this)">
		<c:set var ="pointer" value="${pointer+1 }"/>

	<fieldset class="main1 fieldset2 persocomp2">
		<legend>Mains personnage 1</legend>
		<div class="flex-card3">
		<c:forEach var="i" begin="0" end="9">
			<c:choose>
				
            	<c:when test="${not empty sessionScope.listobjCG.player1.myHand[i]}">
            		
                	<img class="card" id="${f1.merge('main1card',i+1)}" 
                	name= "${pointer}" 
                	alt="" src="${sessionScope.listobjCG.player1.myHand[i].image}" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="${f1.merge('main1card',i+1)}" name= "${pointer}" alt="" 
                	src="" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        	</c:choose>
		</c:forEach>
		
		
		</div>
	</fieldset>
	


	<fieldset class="power1 fieldset2 persocomp3">
		<legend>Pouvoir actif personnage 1</legend>
		<div class="flex-card3">
			<img class="card" id="power1card1"  alt="" src="${sessionScope.listobjCG.player1.eternal.image}" onclick="showImage(this)">
			
				<c:forEach var="i" begin="0" end="8">
			<c:choose>
				
            	<c:when test="${not empty sessionScope.listobjCG.player1.mytresor[i]}">
            		
                	<img class="card" id="${f1.merge('power1card',i+1)}" 
                	name= "${pointer}" 
                	alt="" src="${sessionScope.listobjCG.player1.mytresor[i].image}" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="${f1.merge('power1card',i+1)}" name= "${pointer}" alt="" 
                	src="" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        	</c:choose>
		</c:forEach>
		
		</div>
		</fieldset>
		<fieldset class="curse1 fieldset3">
		<legend>curse up</legend>
		<div class="flex-card4">
		<!--  debut modif  -->
		<c:forEach var="pt2" begin="0" end ="3">
			   <c:choose>
	          		<c:when test="${not empty sessionScope.listobjCG.player2.myCurse[pt2]}">
	              	<img class="card" id="${f1:merge('curse1card',pt2) }" alt="" src="${sessionScope.listobjCG.player1.myCurse[pt2].image}" onclick="showImage(this)">
	          		</c:when>
	          	<c:otherwise>
	              	<img class="card" id="${f1:merge('curse1card',pt2) }" alt="" src="" onclick="showImage(this)">
	          	</c:otherwise>
			</c:choose>
		
		</c:forEach>
		
		<!--  fin modif -->
		</div>
		</fieldset>
	
	</fieldset>
		<fieldset class="perso2">
		<legend>Personnage 2</legend>
		<img class="card persocomp1" id="perso2card"  alt="" src="${sessionScope.listobjCG.player2.image}" onclick="showImage(this)">
	
	<fieldset class="main2 fieldset2 persocomp2">
		<legend>Mains personnage 2</legend>
		<div class="flex-card3">
		<c:forEach var="i" begin="0" end="9">
			<c:choose>
				
            	<c:when test="${not empty sessionScope.listobjCG.player2.myHand[i]}">
            		
                	<img class="card" id="${f1.merge('main2card',i+1)}" 
                	name= "${pointer}" 
                	alt="" src="${sessionScope.listobjCG.player2.myHand[i].image}" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="${f1.merge('main2card',i+1)}" name= "${pointer}" alt="" 
                	src="" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        	</c:choose>
		</c:forEach>
		</div>
	</fieldset> 
	<fieldset class="power2  fieldset2 persocomp3">
		<legend>Pouvoir actif personnage 2</legend>
		<div class="flex-card3">
			<img class="card" id="power2card1"  alt="" src="${sessionScope.listobjCG.player2.eternal.image}" onclick="showImage(this)">
		<c:forEach var="i" begin="0" end="8">
			<c:choose>
				
            	<c:when test="${not empty sessionScope.listobjCG.player2.mytresor[i]}">
            		
                	<img class="card" id="${f1.merge('power2card',i+1)}" 
                	name= "${pointer}" 
                	alt="" src="${sessionScope.listobjCG.player2.mytresor[i].image}" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:when>
            	<c:otherwise>
                	<img class="card" id="${f1.merge('power2card',i+1)}" name= "${pointer}" alt="" 
                	src="" 
                	onclick="showImage(this)">
                	<c:set var ="pointer" value="${pointer+1 }"/>
            	</c:otherwise>
        	</c:choose>
		</c:forEach>
		</div>
	</fieldset>
	<fieldset class="curse2 fieldset3">
		<legend>curse down</legend>
		<div class="flex-card4">
		<!--  modif -->
		<c:forEach var="pt" begin="0" end ="3">
			   <c:choose>
	          		<c:when test="${not empty sessionScope.listobjCG.player2.myCurse[pt]}">
	              	<img class="card" id="${f1:merge('curse2card',pt) }" alt="" src="${sessionScope.listobjCG.player2.myCurse[pt].image}" onclick="showImage(this)">
	          		</c:when>
	          	<c:otherwise>
	              	<img class="card" id="${f1:merge('curse2card',pt) }" alt="" src="" onclick="showImage(this)">
	          	</c:otherwise>
			</c:choose>
		
		</c:forEach>
		
		<!--  fin modif -->
		</div>
		</fieldset>
	
	</fieldset>
	<div class="reset">
		<img class="card" ID="resetcard" alt="no carte" src="image/vide/555-5553432_clipart-stopsign.png" onclick="noShowImage()">
	</div>
	<div class="display">
		<img alt="" src="" id="displayedImage">
	</div>
	<div id="modale"></div>
</body>
</html>