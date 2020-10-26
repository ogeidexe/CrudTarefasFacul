package modelo;

import java.util.ArrayList;
import java.util.List;

import dao.Tabela;

public class SubTarefa extends Tabela {
	public Integer id_subtarefa;
	public String nome_subtarefa;
	public String descricao_subtarefa;
	public boolean status_entregaSub;

	@Override
	public List<Object> myFieldValues() {
		List<Object> values = new ArrayList<>();
		values.add("id_subtarefa");
		values.add("nome_subtarefa");
		values.add("descricao_subtarefa");
		values.add("status_entregaSub");
		return values;
	}

	@Override
	public List<String> myFieldNames() {
		List<String> values = new ArrayList<>();
		values.add("id_subtarefa");
		values.add("nome_subtarefa");
		values.add("descricao_subtarefa");
		values.add("status_entregaSub");
		return values;
	}

	public List<String> fieldsWithDefaultValue() {

		return null;
	}

	@Override
	public String getTableName() {

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
		return "id_subtarefa";
	}

	@Override
	public boolean setFieldValues(List<Object> t) {
		// TODO Auto-generated method stub
		return false;
	}

	public Integer getId_subtarefa() {
		return id_subtarefa;
	}

	public void setId_subtarefa(Integer id_subtarefa) {
		this.id_subtarefa = id_subtarefa;
	}

	public String getNome_subtarefa() {
		return nome_subtarefa;
	}

	public void setNome_subtarefa(String nome_subtarefa) {
		this.nome_subtarefa = nome_subtarefa;
	}

	public String getDescricao_subtarefa() {
		return descricao_subtarefa;
	}

	public void setDescricao_subtarefa(String descricao_subtarefa) {
		this.descricao_subtarefa = descricao_subtarefa;
	}

	public boolean isStatus_entregaSub() {
		return status_entregaSub;
	}

	public void setStatus_entregaSub(boolean status_entregaSub) {
		this.status_entregaSub = status_entregaSub;
	}

}
