package control;


import javax.servlet.ServletException;    
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.*;

import TO.*;
import model.*;
import DAO.*;
import control.*;

@WebServlet("/EfetuarSaque.do")	
public class EfetuarSaqueServletA05 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String agencia = request.getParameter("agencia");
		String conta = request.getParameter("conta");
		String valor = request.getParameter("valor");

		EfetuarSaqueTO efetuarSaqueTO = new EfetuarSaqueTO(agencia, conta, valor);
		EfetuarSaqueDAO dao = new EfetuarSaqueDAO ();
		efetuarSaqueTO.setAgencia();
		efetuarSaqueTO.setConta();
		efetuarSaqueTO.setValor();		
		dao.sacar(efetuar);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Saque Realizado</title></head><body>");
		out.println( "Agencia: "+EfetuarSaqueTO.getAgencia()+"<br>");
		out.println( "Conta: "+EfetuarSaqueTO.getConta()+"<br>");
		out.println( "Valor Sacado: "+EfetuarSaqueTO.getValor()+"<br>");
		out.println("</body></html>");
		
		request.setAttribute("Efetuar Saque", efetuarSaqueTO);
		RequestDispatcher view = request.getRequestDispatcher("Saque.jsp");
		view.forward(request, response);
		}
}

