package br.com.testeage.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;


@Namespace(value = "/exame")

public class ExameAction{
	private List<Exame> exames;
	private Exame exame;
	
	public ExameAction() {
		
	}
	
	@Action(value="lista", results = @Result(name="ok", location = "/lista.jsp"))
	public String lista() {
		
		exames = new ArrayList<Exame>();
		
		Exame exame1 = new Exame(1, "Exame de Sangue");
		Exame exame2 = new Exame(2, "Exame Psicotecnico");
		
		exames.add(exame1);
		exames.add(exame2);
		
		return "ok";
	}
	@Action(value = "novo", results = @Result(name="ok", location="/exame/adciona.jsp"))
	
	public String novo(){
		
		return "ok";
	}
	
	public List getExames() {
		
		return exames;
	}

}
