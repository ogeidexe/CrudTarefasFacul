package controle;

import java.util.List;

import dao.DAO;
import dao.IDAO;
import dao.Tabela;

public class Controle <TABELA extends Tabela> {
	/*
	 * TO DO Insert <- fazendo
	 * TO DO List <- pendente
	 * TO DO Update <-pendente
	 * TO DO Removel <- pendente
	 * 
	 */
	protected IDAO dao;
	public Controle() {
		dao = DAO.getInstance();
	}
	
	public boolean insert() {
		
		return false;
	}
	
<<<<<<< HEAD
=======
	public List<TABELA> list(TABELA t){
		return dao.listar(t);
	}
	
	public boolean remove(Integer Id) {
		//
		return true;
	}
	
>>>>>>> branch 'master' of https://github.com/ogeidexe/CrudTarefasFacul.git
	
}
