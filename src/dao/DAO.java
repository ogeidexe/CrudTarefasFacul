package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import util.Configuracoes;

public class DAO implements IDAO {
	 protected Connection con;
	 private static DAO dao;
	 private SqlMaker sqlMaker;
	 
	 public static DAO getInstance() {
		 if(dao ==  null ) {
			dao =  new DAO(); 
		 }
		 return dao;
	 }
	 
	 
	 /*Obtem dados nesseçarios para a conecção 
	  * Testa conecção com o banco
	  * 
	  */
	 /*Defines a object 
	  * initalize SqlMaker 
	  * Enjoy
	  * 
	  * 
	  * 
	  * 
	  */
	 private DAO() throws RuntimeException {
		 Configuracoes conf =  Configuracoes.getInstance();
		 String driver =  conf.getDriveBd();
		 try {
			 Class.forName(driver);
			 con = DriverManager.getConnection(conf.getUrlConexao(), conf.getUsuarioBd(),conf.getSenhaBd());
		 }catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (SQLException e) {
			throw new RuntimeException("Erro na coneção ao banco erro(1):" + e.getMessage());		}
		 
	 }
	 

	@Override
	public <T extends Tabela> List<T> listar(T t) {
		List<T> tabs = new ArrayList<>();
		SqlMaker sqlMaker =  new SqlMaker(t);
		String sql = "";
		PreparedStatement pst;
		sqlMaker.setSelect();
		sql = sqlMaker.makeMySql();
		try {
			pst = con.prepareStatement(sql);
			ResultSet rs =  pst.executeQuery();
			while(rs.next()) {
				Tabela aux = t.whoami();
				aux = this.fillData(rs);
				tabs.add((T) aux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return tabs;
	}
	
	public Tabela fillData(ResultSet rs) {
		Tabela tabObj;
		// tabObj.
		return tabObj;
	}

	@Override
	public <T extends Tabela> List<T> procurar(T t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean insert(Tabela t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean remove(Tabela t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean modfy(Tabela t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean whoiam(Tabela t) {
		// TODO Auto-generated method stub
		return false;
	}
	 

}
