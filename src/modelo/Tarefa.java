package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dao.Tabela;

public class Tarefa extends Tabela {
	public String idTarefa;
	public Date dataEntrega;
	public Date dataInicial;
	public String tituloTarefa;
	public String descricaoTarefa;
	public boolean statusEntrega;
	public boolean emAtraso;
	public String prioridade = "Normal";
	public boolean foiProrrogada;
	public Date dataProrrogacao;
	

	@Override
	public List<Object> myFieldValues() {
		List<Object> values = new ArrayList<>();
		values.add(this.getDataEntrega());
		
		values.add(this.getDataRegistro());
		
		values.add(this.getTituloTarefa());
		
		values.add(this.getDescricaoTarefa());
		
		values.add(this.getStatusEntrega());
		
		values.add(this.getEmAtraso());
		
		values.add(this.getPrioridade());
		
		values.add(this.isProrrogada());
		
		values.add(this.getDataProrrogacao());
		return values;
	}

	@Override
	public List<String> myFieldNames() {
		  
		List<String> values = new ArrayList<>();
		values.add("idTarefa");
		values.add("nomeTarefa");
		values.add("dataInicial");
		values.add("dataEntrega");
		values.add("tituloTarefa");
		values.add("descricaTarefa");
		values.add("statusTarefa");
		values.add("emAtraso");
		values.add("prioridade");
		values.add("isProrrogada");
		values.add("DataProgorrogacao");
		return values;
	}
	
	@Override
	public boolean setFieldValues(List<Object> valueList) {
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<String> fieldsWithDefaultValue() {
		// TODO Auto-generated method stub
		List<String> fieldsWDefaultValue = new ArrayList<>(); 
		fieldsWDefaultValue.add("prioridade");
		return fieldsWDefaultValue;
	}
	
	/*TODO metodo e vinculação dos campos com valor "default"
	 * Ex.:
	 * se o campo prioridade é um campo com valor padrão 
	 * o valor tem que ser encontrado e atribuido caso 
	 * não seja obrigatorio e (&&) o campo vier
	 * vazio 
	 */
	@Override
	public String getTableName() {
		return "Tarefa";
	}

	@Override
	public Tabela whoami() {
		// TODO Auto-generated method stub
		return new Tarefa();
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Date getDataRegistro() {
		return dataInicial;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataInicial = dataRegistro;
	}

	public String getTituloTarefa() {
		return tituloTarefa;
	}

	public void setTituloTarefa(String tituloTarefa) {
		this.tituloTarefa = tituloTarefa;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

	public boolean getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(boolean statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public boolean getEmAtraso() {
		return emAtraso;
	}

	public void setEmAtraso(boolean emAtraso) {
		this.emAtraso = emAtraso;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public boolean isProrrogada() {
		return foiProrrogada;
	}

	public void setProrrogada(boolean foiProrrogada) {
		this.foiProrrogada = foiProrrogada;
	}

	public Date getDataProrrogacao() {
		return dataProrrogacao;
	}

	public void setDataProrrogacao(Date dataProrrogacao) {
		this.dataProrrogacao = dataProrrogacao;
	}

	@Override
	public String pkName() {
		return "idTarefa";
	}



}
