package dao;

import java.util.List;

public abstract class Tabela {
	
	public abstract String getTableName();

	public abstract List<Object>  myFieldValues();
	
	public abstract boolean setFieldValues(List<Object> t);
	
	public abstract List<String> myFieldNames();
	
	public abstract List<String> fieldsWithDefaultValue();
	
	public abstract Tabela whoami();
	
	public abstract String pkName();
	
	// public abstract 
	/* TODOtype filter text
	 * relações entre os modelos (este modelo contempla apenas 1..N)
	 * hasMany	
	 * hasOne
	 * 
	*/
}
