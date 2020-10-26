package dao;

import java.util.List;

public class SqlMaker {
	//Yes this class only make beatifull Sql's
	//Method (select, insert, remove, Update)
	//Conditional  where you can put where *ba dum tis*
	
	private List<String> fields;
	private List<Object> values;
	private String method = null;
	private String sql;
	private String pkName;
	private String tableName;
	private Tabela objetoBd;
//    private List<String> conditional
	/* Basic Coditional 
	 * *Where
	 * Medium 
	 * *inner Join
	 * Hard 
	 * *Join
	 */
	public SqlMaker(Tabela tab) {
		
		this.fields =  tab.myFieldNames();
		this.values =  tab.myFieldValues();
		// this.pkName =  tab.;
		this.tableName =  tab.getTableName();
		this.objetoBd =  tab.whoami();
		this.pkName =  tab.pkName();
	}
	
	public String makeMySql() {
		//TODO error cathcers is to basic (melhorar)
		int error = 0;
		if(this.getMethod() ==  null) {
			System.out.println("Method isn't seted");
			error += 1;
		}
		
		if(fields == null) {			
			System.out.println("field is null");
			error += 1;
		}
		
		if(values ==  null) {
			System.out.println("values is null");
			error += 1;
		}
		
		if(pkName ==  null && this.needPk()) {
			System.out.println("pk isn't defined");
			error += 1;
		}
		
		if(tableName == null) {
			System.out.println("isn't defined");
			error += 1;
		}
		
		if(error == 0) {
			String method = this.getMethod();
			switch (method) {
				case"select":
					//pode ter where
					sql = "select "+
						    this.colunsSixtaxe(fields) + 
							" from "+ this.tableName;
						    this.whereSintaxe();
					break;
				case"insert":
					//não tem where
					sql  = "insert in to " +this.tableName + " " +
							this.colunsSixtaxe(fields);
							//" values " + this.colunsSixtaxe(values);
					break;
				case"remove":
					//obrigatorio ter where
					sql =  "delete from " + this.tableName + this.whereSintaxe();
					break;
				case"update":
					
					//obrigatorio ter where (ou não depende do estagiario)
					sql = "update " + this.tableName + " set " + this.updateSintaxe(this.fields,this.values)
					 + " " + this.whereSintaxe(); 
					break;
			}
		} 
		return sql;
	}
	
	private String whereSintaxe() {
		String where =  "";
		if(objetoBd != null) {
			List<Object>  values  = objetoBd.myFieldValues();
			where+= " where ";
			for(Object value: values) {
				if(value !=null && !value.equals(""))
				where+=" and " + value.toString();
			}
		}
		return where;
	}
	  
	private String colunsSixtaxe(List<String> fields){
		//Alinha o nome dos campos da Sql. (coluna1, coluna2,)
		String columns = ""; 
		if(!this.needPk()) {	
			fields.remove(fields.indexOf(pkName));
		}
		columns+= String.join(",",fields);
		return 	columns;
	}
	
	private String updateSintaxe(List<String> fields, List<Object> values) {
		String updateSets = " ";
		for(Object value:values) {
			updateSets+=fields.get(values.indexOf(value)) +" = "+value.toString()+ ", ";   
		}
		
		return updateSets;
	}
	
	private boolean needPk() {
		if(this.getMethod().equals("insert") 
		) {
			return false;
		}
		return true;
	}
	
	public void setInsert() {
		//Não prescisa de PK
		this.setMethod("insert");
	}
	
	public void  setSelect() {
		//pode ter Pk
		this.setMethod("select");
	}
	
	public void  setUpdate() {
		//pk nessessaria 
		this.setMethod("update");
	}
	
	public void  setRemove() {
		//pk nessessaria
		this.setMethod("remove");
	}
	

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<Object> getValues() {
		return values;
	}

	public void setValues(List<Object> values) {
		this.values = values;
	}
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Tabela getObjetoBd() {
		return objetoBd;
	}

	public void setObjetoBd(Tabela objetoBd) {
		this.objetoBd = objetoBd;
	}
}
