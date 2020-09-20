package controle;

import java.util.List;

import dao.DAO;
import dao.Tabela;

public class Controle <TABELA extends Tabela> {
	/*
	 * TO DO Insert <- fazendo
	 * TO DO List <- pendente
	 * TO DO Update <-pendente
	 * TO DO Removel <- pendente
	 * 
	 */
	protected DAO dao;
	public Controle() {
		dao = DAO.getInstance();
	}
	
	public List<TABELA> list(){
		//return dao.list(this.getNo)
		return null;
	}
	
	p
}
