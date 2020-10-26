package util;

import java.sql.Date;
import java.util.List;

import dao.Tabela;

public class ParseToJson {
	//this class convert objcts and lists in json lol
	public String convert(List<Tabela> lstb) {
		String json = "[";
		for(Tabela  item : lstb) {
		   json+="{";
		   json+=this.putQuotes(item);
		   json+="}";
		   if(lstb.indexOf(item) < lstb.size() - 1) {
			   json+=',';
		   };
		}
		json+="]";
		return json;
	}	
	
	private String putQuotes(Tabela item) {
		List<String> tempFn =  item.myFieldNames();
		List<Object> tempFv = item.myFieldValues();
		String itemStr = "";
		if(tempFn.size() != tempFv.size()) {
			System.out.println("columns and values dont macth");
			System.out.println("Fields"+ tempFn.size());
			System.out.println("Coluns"+ tempFv.size());
			return "";
			//System.exit(0);
		}
		for(String fn: tempFn) {
			int index =  tempFn.indexOf(fn);
			String temp = "";
			temp = "\""+fn+"\""+":"+this.quoteByInstance(tempFv.get(index));
			
			if(tempFn.size() -1 > index ) {
				temp+=",";
			}
			
			itemStr+= temp;
		}
		return itemStr;
		
	}
	
	private String quoteByInstance(Object obj) {
		String result = "";
		if(obj.getClass() ==  String.class || obj.getClass() ==  Date.class) {
			result+="\""+obj.toString()+"\"";
		} else {
			result+=obj.toString();
		}
		return result;
	}
	
	

}
