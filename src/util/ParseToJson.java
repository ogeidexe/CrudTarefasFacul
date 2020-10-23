package util;

import java.util.List;

import dao.Tabela;

public class ParseToJson {
	//this class convert objcts and lists in json lol
	public String convert(List<Tabela> lstb) {
		String json = "[";
		for(Tabela  item : lstb) {
		   json.concat("{");
		   json.concat(this.putQuotes(item));
		   json.concat("},");
		}
		json.concat("]");
		return json;
	}	
	
	private String putQuotes(Tabela item) {
		List<String> tempFn =  item.myFieldNames();
		List<Object> tempFv = item.myFieldValues();
		String itemStr = "";
		if(tempFn.size() != tempFv.size()) {
			System.out.println("columns and values dont macth");
			return "";
			//System.exit(0);
		}
		for(String fn: tempFn) {
			int index =  tempFn.indexOf(fn);
			itemStr.concat("\""+fn+"\""+":"+
			quoteByInstance(tempFv.get(index)));
		}
		return itemStr;
		
	}
	
	private String quoteByInstance(Object obj) {
		String result = "";
		if(obj.getClass() ==  String.class ) {
			result.concat("\""+obj.toString()+"\"");
		} else {
			result.concat(obj.toString());
		}
		return result;
	}
	
	

}
