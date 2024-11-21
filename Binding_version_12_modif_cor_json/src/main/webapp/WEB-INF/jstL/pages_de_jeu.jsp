<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%String ctx = request.getServletContext().getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="<%=ctx%>/CSS/Game-test.css">
	<meta charset="ISO-8859-1">
	<title>plateau de jeu</title>

	<script type="text/javascript" src="js/script_gameboard.js"></script>
	
	
</head>
<body>

	<div class="taille">
	<img class="card card1"alt="carte" src="image/visuel_common/b2-a_dime.png" onclick="showImage(this)">
	<img class="card card2"alt="no carte" src="image/vide/555-5553432_clipart-stopsign.png" onclick="noShowImage()">
	
	
	
	
	</div>
	
	<div class="display">
		<img alt="" src="" id="displayedImage">
	</div>


</body>
</html>