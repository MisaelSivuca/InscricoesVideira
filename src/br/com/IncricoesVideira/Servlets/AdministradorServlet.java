package br.com.IncricoesVideira.Servlets;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.IncricoesVideira.Dao.AdministradorDao;

/**
 * Servlet implementation class AdministradorServlet
 */
@WebServlet("/administradorServlet")
public class AdministradorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private AdministradorDao administradorDao = new AdministradorDao();
    public AdministradorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setAttribute("administrador",administradorDao.getAdministrador());
		} catch (SQLException e) {
			request.setAttribute("Mensagem", "Erro de Banco de Dados"+e.getMessage());
		}catch (ClassNotFoundException e) {
			request.setAttribute("Mensagem", "Erro de Banco de Dados"+e.getMessage());
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispathcer = request.getRequestDispatcher("/WEB-INF/administrador.jsp");
		dispathcer.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
