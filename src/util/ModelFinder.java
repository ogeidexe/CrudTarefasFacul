package util;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import controle.Controle;
import dao.Tabela;

public class ModelFinder {

	public String findModelOnURI(String URI, String sufix) {
		String[] paths =   URI.split("/");
	    String modelo =  "";
	    List<String> modeList;
	    int i;
		for( i = 0 ; i < paths.length ; i++) {
			if(paths[i].equals(sufix) && i+1 != paths.length) {
				modelo = paths[i+1];
				return modelo;
			}
		}
		return null;
	}
	
	
	public Controle<Tabela> findModelByName(String modelname) {
		Controle<?> cn;
		modelname = modelname.substring(0, 1).toUpperCase() + modelname.substring(1).toLowerCase();
		System.out.println(modelname);
		try {
			Class<?> clazz = Class.forName("controle.Manter"+modelname);
			cn =  (Controle<Tabela>) clazz.getConstructor().newInstance();
			if(cn instanceof Controle) {				
				return (Controle<Tabela>) cn;
			}
			else {
				System.out.println("esta classe não é um modelo valido");				
				return null; 
			}
		} catch (ClassNotFoundException  | 
				SecurityException  | 
				IllegalArgumentException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			System.out.println("erro ao tentar encontrar modelo");
			e.printStackTrace();
			return null;
		}
		

	}
}
