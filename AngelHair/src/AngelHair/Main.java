package AngelHair;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Clinica> clinicas = new ArrayList<Clinica>();
		List<Cabelo> cabelos = new ArrayList<Cabelo>();
		Cliente cliente = new Cliente();
		Cabelo cabelo = new Cabelo();
		
		Endereco enderecoTeste = new Endereco(1, "Rua da Minha Casa", 12, "sem complemento", "30453-012", "Bairro Que Eu Moro", "BH", "MG");
		Cliente clienteTeste = new Cliente(1, "logincliente", "senhacliente", "nomecliente", "cpfcliente", "telefonecliente", "emailcliente", "datanascimento", enderecoTeste);


		
		/* Dando o "play" será possível:
		 * 
		 * Cadastrar cliente com endereço (objeto separado)
		 * Acessar menu de cliente (algumas opções estão implementadas)
		 * Cadastrar clinica com endereço (objeto separado)
		 * Cadastrar cabelo para cliente
		 * -> ao cadastrar o cabelo, é feita a opção de venda ou doação
		 * -> é possível alterar essa opção através do menu cliente "vender cabelo" ou "doar cabelo"
		 * 
		 * Conforme explicado, pela falta de banco de dados, não faz muito sentido
		 * criar um monte de objetos, listas globais de objetos, etc, pois, apesar de tornar
		 * o projeto mais interessante, não o torna viável, afinal, ninguém faz um programa
		 * inteiro em console... 
		 * 
		*/
		
		TelasIniciais.menuTelaInicial(cliente, cabelo, clientes, clinicas, cabelos);
		
	}

}
