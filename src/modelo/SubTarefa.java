package modelo;

import java.util.List;

import dao.Tabela;

public class SubTarefa extends Tabela{
	
	
	

	@Override
	public List<Object> myFieldValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> myFieldNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> fieldsWithDefaultValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "subtarefa";
	}

	@Override
	public Tabela whoami() {
		// TODO Auto-generated method stub
		return new SubTarefa();
	}

	@Override
	public String pkName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setFieldValues(List<Object> t) {
		// TODO Auto-generated method stub
		return false;
	}

}
