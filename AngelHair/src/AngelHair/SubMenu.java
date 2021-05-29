package AngelHair;
import java.util.List;

public interface SubMenu {
	
	public abstract void subMenu(Cliente cliente, Cabelo cabelo, Clinica clinica, List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos);

	//public abstract void subMenu(List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos);
	
	//public abstract void subMenu(Cliente cliente, List<Cliente> clientes, List<Clinica> clinicas, List<Cabelo> cabelos);

}
