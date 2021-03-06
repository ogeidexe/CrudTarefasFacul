package visao;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import util.ParseToJson;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/listar/*")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String modelo =  new ModelFinder().findModelOnURI(request.getRequestURI(),"listar");
		Controle<Tabela> cn = new ModelFinder().findModelByName(modelo);
		Tabela model =  cn.whoami();
		HashMap<String, String> hm = model.fieldTypes();
		for ( Map.Entry<String, String> entry : hm.entrySet()) {
		    String key = entry.getKey();
		    String tab = entry.getValue();
		    System.out.println(key+"."+tab);
		}

		
		if(cn != null) {				
			ParseToJson ps  = new ParseToJson();
			response.getWriter().append(ps.convert(cn.list()));
		}else {
			response.getWriter().append("modelo não encontrado");
		
	     } 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
