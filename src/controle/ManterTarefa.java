package controle;

import dao.Tabela;
import modelo.Tarefa;

public class ManterTarefa  extends Controle<Tabela>{

	@Override
	public Tabela whoami() {
		
		return new Tarefa();
	}

}
