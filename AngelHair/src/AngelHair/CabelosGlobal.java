package AngelHair;

import java.util.ArrayList;
import java.util.List;

public class CabelosGlobal {
	
	//lista global com todos os cabelos, para efeitos de pesquisa
	
	public List<Cabelo> listaTodosCabelos = new ArrayList<Cabelo>();
	
	public CabelosGlobal(List<Cabelo> listaTodosCabelos) {
		super();
		this.listaTodosCabelos = listaTodosCabelos;
	}
	
	public CabelosGlobal() {
		super();
	}

	public void adicionarCabeloGlobal(Cabelo cabelo) {
		this.listaTodosCabelos.add(cabelo);
	}
}
