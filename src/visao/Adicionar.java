package visao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controle.Controle;
import controle.ManterTarefa;
import dao.Tabela;
import util.ModelFinder;

/**
 * Servlet implementation class Adicionar
 */
@WebServlet("/adicionar")
public class Adicionar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adicionar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getAttribute("");
		response.setStatus(405);
		response.getWriter().append("METHOD NOT ALLOWED");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String modelo = new ModelFinder().findModelOnURI(request.getRequestURI(), "adicionar");
		Controle<Tabela> cn = new ModelFinder().findModelByName(modelo);
		Tabela model =  cn.whoami();
		HashMap<String, String> hm = model.fieldTypes();
		for ( Map.Entry<String, String> entry : hm.entrySet()) {
		    String key = entry.getKey();
		    String tab = entry.getValue();
		    
		    
		}
		
		doGet(request, response);
	}
	
	private List<Object> initVariables(HttpServletRequest request){
		
		// Tabela t =  mt.whoami();
		//List<String> fieldNames =  
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()){
			String pName = parameterNames.nextElement();
			request.getParameter(pName);
		}
		return null;
	}
	

}
