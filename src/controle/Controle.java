package controle;

import java.util.List;


import dao.DAO;
import dao.IDAO;
import dao.Tabela;

public abstract class Controle <TABELA extends Tabela> {
	/*
	 * TO DO Insert <- feito
	 * TO DO List <- fasendo
	 * TO DO Update <-pendente
	 * TO DO Removel <- pendente
	 * 
	 */
	//Controladores com a primeira letra maiuscula apenas
	protected IDAO dao;
	public Controle() {
		dao = DAO.getInstance();
		// this.tabelaClass.whoami();
	}
	
	public boolean insert(Tabela t) {
		
		return dao.insert(t);
	}
	
	public List<TABELA> list(){
		return (List<TABELA>) (dao.listar(this.whoami()));
	}
	
	public boolean remove(Integer Id) {
		//
		return true;
	}
	
	public abstract Tabela whoami();
	
}
