package controle;

import dao.Tabela;

public class ManterSubtarefa extends Controle<Tabela>{

	
	@Override
	public Tabela whoami() {
		// TODO Auto-generated method stub
		return new modelo.SubTarefa();
	}

}
