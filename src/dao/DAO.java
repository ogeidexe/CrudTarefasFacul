package dao;

import java.sql.Connection;

public class DAO {
	 protected Connection con;
	 private static DAO dao;
	 
	 public static DAO getInstance() {
		 if(dao ==  null ) {
			dao =  new DAO(); 
		 }
		 return dao;
	 }
	 
	 
	 /*Obtem dados nesseçarios para a conecção 
	  * Testa conecção com o banco
	  * (o que são conecções ativas)?
	  * 
	  */
	 private DAO() {
		 
	 }
	 
	 //Inserir 
	 public void insert(Tabela tab) {
		 
	 }
	 //Excluir 
	 public void remove(Tabela tab) {
		 
	 }
	 

}
