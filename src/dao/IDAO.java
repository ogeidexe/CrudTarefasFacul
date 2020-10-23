package dao;

import java.util.List;

public interface IDAO {
	public <T extends Tabela> List<T> listar(T t);
	public <T extends Tabela> List<T> procurar(T t);
	public boolean insert(Tabela t);
	public boolean remove(Tabela t);
	public boolean modfy(Tabela t);
}
