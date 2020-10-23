package util;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Properties;

public class Configuracoes {
	public static final String DRIVER_BD = "DRIVER_BD";
	public static final String SENHA_BD = "SENHA_BD";
	public static final String USUARIO_BD = "USUARIO_BD";
	public static final String URLCONEXAO = "URLCONEXAO";
	private String urlConexao="";
	private String usuarioBd="";
	private String senhaBd="";
	private String driveBd="";
	
	private static Configuracoes conf ;
	public static Configuracoes getInstance() {
		if(conf==null) {
			conf = new Configuracoes();
			conf.init();
		}
		return conf;
	}
	public String getUrlConexao() {
		return urlConexao;
	}
	public String getUsuarioBd() {
		return usuarioBd;
	}
	public String getSenhaBd() {
		return senhaBd;
	}
	public String getDriveBd() {
		return driveBd;
	}
	private Configuracoes() {
		
	}
	private void init()  {
		Properties prop = new Properties();
		try {
			System.out.println(new File(".").getAbsolutePath());
			prop.load( getClass().getClassLoader().getResourceAsStream("config.properties") );
			urlConexao	= prop.getProperty(URLCONEXAO, "jdbc:postgresql://localhost:5432/prog3");
			usuarioBd	= prop.getProperty(USUARIO_BD, "postgres");
			senhaBd		= prop.getProperty(SENHA_BD,"");
			driveBd		= prop.getProperty(DRIVER_BD,"org.postgresql.Driver");
			
		} catch (IOException e) {
			e.printStackTrace();
		} //carrega propriedades do arquivo jdbc.properties, 
	}
}
