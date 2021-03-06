package modelo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.Tabela;

public class Tarefa extends Tabela {
	public Integer idTarefa;
	public Date dataEntrega;
	public Date dataInicial;
	public String tituloTarefa;
	public String descricaoTarefa;
	public boolean statusEntrega;
	public boolean emAtraso;
	public String prioridade;
	public boolean foiProrrogada;
	public Date dataProrrogacao;
	

	@Override
	public List<Object> myFieldValues() {
		List<Object> values = new ArrayList<>();
		values.add(this.getIdTarefa());
		
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
		values.add("id_tarefa");
		values.add("data_inicial");
		values.add("data_entrega");
		values.add("titulo");
		values.add("descricao");
		values.add("status_entrega");
		values.add("atraso");
		values.add("prioridade");
		values.add("prorrogada");
		values.add("data_prorrogada");
		return values;
	}
	
	@Override
	public boolean setFieldValues(List<Object> valueList) {
		try {
			this.setIdTarefa((Integer) valueList.get(0) );
			this.setDataRegistro((Date) valueList.get(1));
			this.setDataEntrega((Date) valueList.get(2));
			this.setTituloTarefa((String) valueList.get(3));
			this.setDescricaoTarefa((String)valueList.get(4));
			this.setStatusEntrega((Boolean)valueList.get(5));
			this.setEmAtraso((Boolean) valueList.get(6));
			this.setPrioridade((String) valueList.get(7));
			this.setProrrogada((Boolean) valueList.get(8));
			this.setDataProrrogacao((Date) valueList.get(9));
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Override 
	public HashMap<String, String> fieldTypes() {
	HashMap<String, String> lista = new HashMap<>();
			lista.put("Integer","parseInt");
			lista.put("Date", "valueOf");
			lista.put("Date", "valueOf" ); 
			lista.put("String","toString");
			lista.put("String","toString");
			lista.put("Boolean","getBoolean");
			lista.put("Boolean","getBoolean");
			lista.put("String", "toString");
			lista.put("Boolean", "getBoolean");
			lista.put("Date","valueOf");
		return lista;
	}

	@Override
	public List<String> fieldsWithDefaultValue() {
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
	
	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}



}
