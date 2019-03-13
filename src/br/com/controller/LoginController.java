package br.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (login.equals("gerlan") && senha.equals("123")) {
			// usando o forword para redirecionar para uma pagina informando o meu nome na pagina
			RequestDispatcher f = request.getRequestDispatcher("sucesso.jsp");
			
			request.setAttribute("nome", login);
			
			f.forward(request, response);
			
		}else {
			
			//response.sendRedirect("login.jsp");
			
			String msg = "*Usu�rio ou senha inv�lidos";
			
			RequestDispatcher l = request.getRequestDispatcher("login.jsp");
			
			request.setAttribute("msg", msg);
			
			l.forward(request, response);
		}
	}

}
