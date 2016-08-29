package mz.com.cedisif.conversor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mz.com.cedsif.conversor.Modelo.NumeroDecimal;
import mz.com.cedsif.conversor.servicos.Servicos;

@WebServlet("/converterNumeroDecimalRomano")
public class ConversorDeNumeroServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String numeroStr = request.getParameter("numero");
		int valor = Integer.parseInt(numeroStr);

		NumeroDecimal numeroDecimal = new NumeroDecimal();
		numeroDecimal.setValor(valor);
		Servicos servicos = new Servicos(numeroDecimal);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> O numero " + numeroStr
				+ " em Decimal, foi convertido para "
				+ servicos.converteNumero() + " em Romanos </h1>");

		out.println("</body>");
		out.println("</html>");
	}
}
