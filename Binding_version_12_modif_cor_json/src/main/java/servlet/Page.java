package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bean.ContextGame;
import bean.De;
import bean.ObjContextGame;
import cartes.Heros;
import creaCard.CreaPerso;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import creationDeck.Creadeck;
import creationDeck.DeckBoardCommon;
import creationDeck.deckBoardMonster;
import creationDeck.deckBoardTresor; 

/**
 * Servlet implementation class Page
 */
@WebServlet("/index")
public class Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String INDEX = "/WEB-INF/jstL/gameboard.jsp";
    private ObjContextGame objCG = null; 
    private HttpSession session = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    
    	
    }
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		objCG = new ObjContextGame(CreaPerso.cain(),
				                   CreaPerso.eve(),
				                   new DeckBoardCommon(),
				                   new deckBoardMonster(),
				                   new deckBoardTresor(),
				                   new De(true,6));
		objCG.test();
		
		session = request.getSession();
		session.setAttribute("listobjCG", objCG);
		doPost(request, response);
		
	}
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String pointer = request.getParameter("pointer");
	System.out.println("pointer :"+pointer);
	
	if(pointer !=null ) {
		session.setAttribute("objCG", objCG.getList().get(Integer.parseInt(pointer)));

	}
 
	request.getRequestDispatcher(INDEX).forward(request,response);	
}




}
