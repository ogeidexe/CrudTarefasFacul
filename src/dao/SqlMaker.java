package dao;

import java.util.List;

public class SqlMaker {
	//Yes this class only make beatifull Sql's
	//Method (select, insert, remove, Update)
	//Conditional  where you can put where *ba dum tis*
	
	private List<String> fields;
	private List<String> values;
	private String method = null;
	private String sql;
	private String pkName;
	private String tableName;
//    private List<String> conditional
	/* Basic Coditional 
	 * *Where
	 * Medium 
	 * *inner Join
	 * Hard 
	 * *Join
	 */
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
		
		if(pkName ==  null) {
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
					sql = "select" + this.colunsSixtaxe(fields);
					break;
				case"insert":
					//obrigatorio ter where
					break;
				case"remove":
					//obrigatorio ter where
					break;
				case"update":
					//obrigatorio ter where
					break;
			}
		} 
		return sql;
	}
	
	  
	private String colunsSixtaxe(List<String> fields){
		//Alinha o nome dos campos da Sql. (coluna1, coluna2,)
		String columns = ""; 
		if(!this.needPk()) {	
			fields.remove(fields.indexOf(pkName));
		}
		
		columns+="(";
		for(String field: fields) {
			columns+= field;
		}
		columns+=")";
		
		
		
		
		return 	columns;
	}
	
	private boolean needPk() {
		if(this.getMethod().equals("update") ||
		   this.getMethod().equals("remove")
		) {
			return true;
		}
		return false;
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

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}
}
