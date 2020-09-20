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
		
		if(error == 0) {
			String method = this.getMethod();
			switch (method) {
				case"select":
					break;
				case"insert":
					break;
				case"remove":
					break;
				case"update":
					break;
			}
		} else {
			
			
		}
		
			return sql;
	}
	
	public void setInsert() {
		this.setMethod("insert");
	}
	
	public void  setSelect() {
		this.setMethod("select");
	}
	
	public void  setUpdate() {
		this.setMethod("update");
	}
	
	public void  setRemove() {
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
