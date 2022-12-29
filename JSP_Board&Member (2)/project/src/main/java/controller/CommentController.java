package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.CommentService;
import service.CommentServiceImpl;

@WebServlet("/cmt/*")
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = LoggerFactory.getLogger(CommentController.class);
    private CommentService csv;
    private int isOk;
	
	
    public CommentController() {
        csv = new CommentServiceImpl();
    }

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String uri = req.getRequestURI(); // /cmt/list/10
		String pathUri = uri.substring("/cmt/".length());
		String path = pathUri.substring(0, pathUri.lastIndexOf("/")); //list
		String pathVar = pathUri.substring(pathUri.lastIndexOf("/")+1); //10
		log.info(">>> uri >> "+uri);
		log.info(">>> path >> "+path);
		log.info(">>> pathVar >> "+pathVar);
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
